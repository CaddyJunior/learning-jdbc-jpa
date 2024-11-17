package com.learning.learn_jpa_and_hibernate.course.runner;

import com.learning.learn_jpa_and_hibernate.course.business.Course;
import com.learning.learn_jpa_and_hibernate.course.jdbc.repository.CourseJdbcRepo;
import com.learning.learn_jpa_and_hibernate.course.jpa.repository.CourseJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

    @Autowired
    private CourseJdbcRepo jdbcRepo;

    @Autowired
    private CourseJpaRepo jpaRepo;

    @Override
    public void run(String... args) throws Exception {
        jdbcRepo.insert(new Course(5, "Learn Robotics", "Nal"));
        jdbcRepo.insert(new Course(6, "Learn Mecha", "UJ"));
        jdbcRepo.insert(new Course(7, "Learn Law", "CPT"));
        jdbcRepo.insert(new Course(8, "Learn Animetronics", "Harvard"));

        jdbcRepo.deleteById(8);
        System.out.println(jdbcRepo.selecyById(5));

        jpaRepo.insert(new Course(8, "Learn Animetronics", "Harvard"));
        jpaRepo.insert(new Course(9, "Learn Economics", "Limps"));
        jpaRepo.insert(new Course(10, "Learn Yoga", "Arts"));

        System.out.println(jpaRepo.findById(8));
        System.out.println(jpaRepo.findById(9));
        System.out.println(jpaRepo.findById(10));

    }
}