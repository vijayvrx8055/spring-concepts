package com.vrx.spring.orm.mapping;

import com.vrx.spring.orm.entity.Address;
import com.vrx.spring.orm.entity.Student;
import com.vrx.spring.orm.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OneToManyMapping {

    @Autowired
    private StudentRepository studentRepository;

    public void saveStudentAndAddress(){
        Student student1 = new Student();
        student1.setStudentId(101);
        student1.setStudentName("Vijay umar");
        student1.setAbout("I am a Java Fullstack Developer.");

        Address address = new Address();
        address.setCity("Bokaro");
        address.setState("Jharkhand");
        address.setStreet("49");
        address.setStudent(student1);
        student1.getAddresses().add(address);

        studentRepository.save(student1);

    }
}
