package com.bhup.onetoone1.Service;

import com.bhup.onetoone1.Repository.StudentRepository;
import com.bhup.onetoone1.entity.ParentDetail;
import com.bhup.onetoone1.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.GeneratedValue;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository repository;
    public List<Student>getAll()
    {
        return (List<Student>) repository.findAll();
    }
    public Student getId(@PathVariable int rollNo)
    {
        return repository.findById(rollNo).get();

    }

    public void save(Student student)
    {
        repository.save(student);
    }

    public void delete( int rollNo)
    {
        repository.deleteById(rollNo);
    }
    public Student update(int rollNo, Student student)
    {
        Student student1= repository.findById(rollNo).get();
        student1.setName(student.getName());
        student1.setBranch(student.getBranch());
        student1.setYear(student.getYear());
        student1.setParentDetail(student.getParentDetail());
        repository.save(student1);
        return student1;

    }


}
