package com.ibms.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibms.app.entity.Student;
import com.ibms.app.service.StudentService;
import com.ibms.app.utils.R;

/**
 * @Author Druid_Xu
 * @Date 2020/11/3 下午 03:02
 * @Description
 */
@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    public StudentService studentService;

    @PostMapping("/insert")
    public R insert(@RequestBody Student student) {
        studentService.insert(student);
        return R.ok();
    }

    @GetMapping
    public R list() {
        return R.ok().put("students",studentService.getByBean());
    }

    @PostMapping("/update")
    public R update(@RequestBody Student student) {
        studentService.update(student);
        return R.ok();
    }

    @DeleteMapping("/delete")
    public R delete(@RequestParam int id) {
        studentService.delete(id);
        return R.ok();
    }

}
