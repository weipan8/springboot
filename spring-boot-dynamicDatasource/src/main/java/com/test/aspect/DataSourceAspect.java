package com.test.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.test.config.JdbcContextHolder;
import com.test.config.MyDataSource;

@Aspect
@Order(1) // 设置AOP执行顺序(需要在事务之前，否则事务只发生在默认库中)
@Component
public class DataSourceAspect {
	// 切点
	@Pointcut("execution(* com.test.service..*.*(..))")
	public void aspect() {
	}

	@Before("aspect()")
	private void before(JoinPoint point) {
		Object target = point.getTarget();
		
		//获得访问的方法名
		String method = point.getSignature().getName();
		
		//获得当前访问的class
		Class<?> classz = target.getClass();
		//得到方法的参数的类型
		Class<?>[] parameterTypes = ((MethodSignature) point.getSignature()).getMethod().getParameterTypes();
		try {
			
			java.lang.reflect.Method m = classz.getMethod(method, parameterTypes);
			if (m != null && m.isAnnotationPresent(MyDataSource.class)) {
				MyDataSource data = m.getAnnotation(MyDataSource.class);
				JdbcContextHolder.putDataSource(data.value().getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
