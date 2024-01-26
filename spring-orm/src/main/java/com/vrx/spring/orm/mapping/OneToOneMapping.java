package com.vrx.spring.orm.mapping;

import com.vrx.spring.orm.entity.Laptop;
import com.vrx.spring.orm.entity.Student;
import com.vrx.spring.orm.repository.LaptopRepository;
import com.vrx.spring.orm.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OneToOneMapping {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private LaptopRepository laptopRepository;

    public void saveStudent(){
        Student student1 = new Student();
        student1.setStudentId(101);
        student1.setStudentName("Vijay");
        student1.setAbout("I am a Fullstack Developer.");

        Laptop laptop1 = new Laptop();
        laptop1.setLaptopId(101);
        laptop1.setModelNumber("M109909");
        laptop1.setBand("Samsung");
        laptop1.setStudent(student1);
        student1.setLaptop(laptop1);

        studentRepository.save(student1);
    }

}
