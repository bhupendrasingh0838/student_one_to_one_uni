package com.bhup.onetoone1.Controller;

import com.bhup.onetoone1.Service.StudentService;
import com.bhup.onetoone1.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService service;

    @GetMapping("/retrieve")
    public List<Student>getAll(){
        return (List<Student>) service.getAll();
    }
    @GetMapping("/retrieve/{rollNo}")
    public Student getId(@PathVariable int rollNo)
    {
        Student student =service.getId(rollNo);
        return student;
    }

    @PostMapping("/create")
    public String save(@RequestBody Student student){
        service.save(student);
        return "Data Updated";

    }

    @DeleteMapping("/delete/{rollNo}")
    public String delete(@PathVariable int rollNo){
        service.delete(rollNo);
        return "item deleated";

    }
    @PutMapping("/update/{rollNo}")
        public Student update(@PathVariable int rollNo, @RequestBody Student student){
        service.update(rollNo, student);
        return student;

    }


}
