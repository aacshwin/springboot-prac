package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.EmpBeanDao;
import com.example.demo.dao.EmpBeanUsingJpa;

@Controller
public class EmpController {
	
	@Autowired
	EmpBeanDao empBeanDao;
	
	@Autowired
	EmpBeanUsingJpa empBeanUsingJpa;
	
	@RequestMapping("home")
	public String home(EmpBean emp) {
		return "home.jsp";
	}
	
	@RequestMapping("addEmp")
	public String addEmp(EmpBean emp) {
		empBeanDao.save(emp);
		return "home.jsp";
	}
	
	@RequestMapping("deleteEmp")
	public String deleteEmp(EmpBean emp) {
		empBeanDao.delete(emp);
		return "home.jsp";
	}
	
	@RequestMapping("showDetails")
	public ModelAndView showDetails(String name) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", empBeanDao.findById(name).get());
		mv.setViewName("detail.jsp");
		return mv;
	}
	
	// RestApi Methods :
	
	@RequestMapping(path="employees", produces= {"application/xml"})
	@ResponseBody
	public List<EmpBean> employees() {
		
		return empBeanUsingJpa.findAll();
	}
	
	@RequestMapping("employee/{name}")
	@ResponseBody
	public Optional<EmpBean> employeesByName(@PathVariable("name") String name) {
		
		return empBeanUsingJpa.findById(name);
	}
	
	@RequestMapping(path = "employee", method = RequestMethod.POST)
	@ResponseBody
	public EmpBean addEmployee(@RequestBody EmpBean emp) {
		empBeanUsingJpa.save(emp);
		return emp;
	}
	
	@DeleteMapping(path = "employee/{name}")
	@ResponseBody
	public EmpBean deleteEmployee(@PathVariable("name") String name) {
		EmpBean a = empBeanUsingJpa.findById(name).get();
		
		empBeanDao.delete(a);
		return a;
	}
	
	@PutMapping(path = "employee")
	@ResponseBody
	public EmpBean updateEmployee(@RequestBody EmpBean emp) {
		empBeanDao.save(emp);
		
		return emp;
	}
}
