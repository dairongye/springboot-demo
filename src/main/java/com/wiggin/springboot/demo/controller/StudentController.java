package com.wiggin.springboot.demo.controller;
import java.util.Date;

import com.wiggin.springboot.demo.model.Student;
import com.wiggin.springboot.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * copyright 2015-2020
 *
 * @author wiggin
 * @date 2017/9/26 22:48
 * @Description: 控制器
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @RequestMapping(value = "/qryById")
    public Student qry(int id){
        System.out.println("this is v2");
        System.out.println("this is v2gi");
        return service.queryById(id);
    }
    @RequestMapping(" getStuddent")
    public Student getStuddent(){
        Student student = new Student();
        student.setId(2);
        student.setName("csd");
        student.setSex("vd");
        student.setBirth(new Date());
        student.setDepartment("vs");
        student.setAddress("va");
return student;
    }
}
