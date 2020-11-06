package com.zrn.controller;

import com.zrn.pojo.Teachers;
import com.zrn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 85845
 */

@RestController
@RequestMapping("/student")
public class StudentController {
    //controller层调用Service层

    @Autowired
    @Qualifier("StudentServiceImpl")
    private StudentService studentService;

    /**
     * 调用service层的方法，通过姓名查询
     * @param name
     * @param col
     * @return
     */
    @GetMapping("/teacher-by-name/{name}/{col}")
    public List<Teachers> queryTeacherByName(@PathVariable String name,@PathVariable String col){

        List<Teachers> list = studentService.queryTeacherByName(name,col);
        return list;
    }

    /**
     * 查询所有该学生学院的老师
     * @param col
     * @return
     */
    @GetMapping("/all-teacher/{col}")
    public List<Teachers> queryAllTeacher(@PathVariable String col){

        List<Teachers> list = studentService.queryAllTeacher(col);
        return list;
    }

    /**
     * 测试
     * @return
     */
    @GetMapping("/hello")
    public String test(){
        return "ok";
    }

    /**
     * 查询所有老师
     * @return
     */
    @GetMapping("/all-teachers")
    public List<Teachers> queryAll(){
        List<Teachers> list = studentService.queryAll();
        return list;
    }
}
