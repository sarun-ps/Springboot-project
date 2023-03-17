package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.Student;
import com.project.repository.Repository;

@Controller
public class StudentController {
	@Autowired
	Repository resp;
	@RequestMapping("index")
	public String user() {
		return "index.jsp";
	}
	@RequestMapping("addstud")
	public String addstud(Student student) {
		resp.save(student);
		return "index.jsp";
	}
	@RequestMapping("getstud")
	public ModelAndView  getstud(@RequestParam int regno){
		ModelAndView mav=new ModelAndView("show.jsp");
		Student student=resp.findById(regno).orElse(new Student());
		mav.addObject(student);
		return mav;
	}
	@RequestMapping("deletestud")
	public ModelAndView  deletestud(@RequestParam int regno){
		ModelAndView mav=new ModelAndView("delete.jsp");
		Student student=resp.findById(regno).orElse(new Student());
		resp.deleteById(regno);
		mav.addObject(student);
		return mav;
	}
	@RequestMapping("updatestud")
	public ModelAndView  updatestud(Student student){
		ModelAndView mav=new ModelAndView("update.jsp");
		student=resp.findById(student.getRegno()).orElse(new Student());
		resp.deleteById(student.getRegno());
		mav.addObject(student);
		return mav;
	}
}
