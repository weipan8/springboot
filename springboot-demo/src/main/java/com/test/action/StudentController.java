package com.test.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.test.model.Student;
import com.test.service.StudentService;
import com.test.util.ResultData;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	
	/*@InitBinder
	protected void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}*/
	
	@RequestMapping("/getAll")
	@ResponseBody
	public String getStudents(){
		List<Student> allStudents = studentService.getAllStudents();
		for (Student student : allStudents) {
			System.out.println(student);
		}
		/*ObjectMapper mapper = JackJsonUtil.getDefaultObjectMapper();
		try {
			responseStr = mapper.writeValueAsString(allStudents);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		ResultData rs=new ResultData();
		rs.data=allStudents;
		rs.status=ResultData.SUCCESS;
		return rs.toString();
	}
	@RequestMapping("/getone/{id}")
	@ResponseBody
	public String getstudent(@PathVariable("id") int id){
		Student stu = studentService.getStudentById(id);
		return JSON.toJSONString(stu);
	}
	
	@RequestMapping(value ="/save",method=RequestMethod.POST)
	@ResponseBody
	public String save(@RequestBody Student student){
		
		System.out.println(JSON.toJSONString(student,true));
		studentService.save(student);
		return "ok";
	}
	
	@RequestMapping(value ="/saveAndFlush",method=RequestMethod.POST)
	@ResponseBody
	public String saveAndFlush(@RequestBody Student student){
		ResultData rs=new ResultData();
		
		Student saveAndFlush=null;
		try {
			System.out.println(JSON.toJSONString(student,true));
			saveAndFlush = studentService.saveAndFlush(student);
			rs.data=saveAndFlush;
			rs.status=ResultData.SUCCESS;
		} catch (Exception e) {
			rs.status=ResultData.FAILED;
			rs.descript=e.getMessage();
			e.printStackTrace();
		}
		return rs.toString();
	}
	
	@RequestMapping("/getAll4PageAndCondition")
	@ResponseBody
	public String getStudents4PageAnd(HttpServletRequest req){
		int size = Integer.parseInt(req.getParameter("pSize"));
		int page = Integer.parseInt(req.getParameter("cPage"));
		String name=req.getParameter("name");
		System.out.println(size+"--"+page+"--"+name);
		ResultData rs=new ResultData();
		Student bookQuery=new Student();
		bookQuery.setName(name);
		Page<Student> studens4PageAndQuery = studentService.getStudens4PageAndQuery(page, size, bookQuery);
		System.out.println(JSON.toJSONString(studens4PageAndQuery,true));
		rs.data=studens4PageAndQuery;
		return JSON.toJSONString(studens4PageAndQuery);
	}
	
	
	@RequestMapping(value ="/update.do",method=RequestMethod.POST)
	@ResponseBody
	public String update(@RequestBody Student student){
		
		System.out.println(JSON.toJSONString(student,true));
		studentService.save(student);
		return "ok";
	}
	
	@RequestMapping(value ="/del.do",method=RequestMethod.GET)
	@ResponseBody
	public String update(@RequestParam("id")int id){
		
		studentService.del(id);
		return "ok";
	}
	
}
