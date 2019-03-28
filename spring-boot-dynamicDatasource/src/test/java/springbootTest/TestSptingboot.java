package springbootTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.test.app.SpringBootMain;
import com.test.service.TestService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootMain.class)
public class TestSptingboot {
	
	

	@Autowired
	private TestService testService;
	@Test
	public void test004(){
		
		System.out.println(JSON.toJSONString(testService.getAllEmps(),true));
	}

}
