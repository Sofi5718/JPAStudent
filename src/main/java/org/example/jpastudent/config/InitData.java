package org.example.jpastudent.config;

import org.example.jpastudent.model.Student;
import org.example.jpastudent.repositories.StudentRepository;
import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student student = new Student();
        student.setName("tset");
        student.setBornDate(LocalDate.of(1997, 8, 23));
        student.setBornTime(LocalTime.of(6, 23, 12));
        studentRepository.save(student);
    }
}
