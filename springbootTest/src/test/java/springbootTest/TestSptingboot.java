package springbootTest;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.test.app.SpringBootMain;
import com.test.async.AsyncTask;
import com.test.config.ClassConfig;
import com.test.entity.Dept;
import com.test.entity.Emp;
import com.test.service.TransationalService;
import com.test.test1mapper.EmpMapper;
import com.test.test1mapper.TableTestMapper;
import com.test.test2mapper.Emp1Mapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootMain.class)
public class TestSptingboot {
	
	@Autowired
	private ClassConfig conf;
	@Test
	public void test(){
		System.out.println(JSON.toJSONString(conf,true));
	}
	
	@Value("${value.test}")
	private String testvalue;
	@Test
	public void test02(){
		
		System.out.println(testvalue);
	}
	
	/*@Autowired
	private com.test.mapper.EmpMapper mapper;
	@Test
	public void mybatisTest(){
		
		System.out.println(JSON.toJSONString(mapper.findEmps(),true));
	}*/
	

	@Autowired
	private EmpMapper empMapper;
	@Test
	public void test03(){
		System.out.println(JSON.toJSONString(empMapper.findEmps(),true));
	}
	
	@Autowired
	private Emp1Mapper emp1mapper;
	@Test
	public void testEmp1(){
		System.out.println(JSON.toJSONString(emp1mapper.findEmps(),true));
	}
	
	
	/*@Autowired
	private TransationalService service;
	@Test
	public void test66(){
		service.addall();
	}
	*/
	/*@Test
	public void testInsert(){
		Dept dept=new Dept();
		dept.deptName="TestDeptName";
		empMapper.addDept(dept);
	}
	

	@Test
	//@Transactional
	public void test04(){
		
		Emp emp=new Emp();
		Dept dept=new Dept();
		dept.deptId=1;
		emp.empName="test-no-transational2";
		emp.dept=dept;
		emp.salary=8000;
		emp.telephone="111111111";
		emp.birthday="1900-10-01";
		empMapper.addEmp(emp);
		int i=5/0;
		
	}*/

	
}
