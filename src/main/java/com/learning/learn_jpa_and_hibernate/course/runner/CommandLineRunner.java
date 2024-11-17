package com.learning.learn_jpa_and_hibernate.course.runner;

import com.learning.learn_jpa_and_hibernate.course.business.Course;
import com.learning.learn_jpa_and_hibernate.course.jdbc.repository.CourseJdbcRepo;
import com.learning.learn_jpa_and_hibernate.course.jpa.repository.CourseJpaRepo;
import com.learning.learn_jpa_and_hibernate.course.springdatajpa.repository.CourseSpringDataJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

    @Autowired
    private CourseJdbcRepo jdbcRepo;

    @Autowired
    private CourseJpaRepo jpaRepo;

    @Autowired
    private CourseSpringDataJpaRepo dataJpaRepo;

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

        System.out.println("Find By id 8: \n" + jpaRepo.findById(8));
        System.out.println("Find By id 9: \n" + jpaRepo.findById(9));
        System.out.println("Find By id 10: \n" + jpaRepo.findById(10));

        dataJpaRepo.save(new Course(11, "Learn COMSI", "Udemy"));
        dataJpaRepo.save(new Course(12, "Learn Ethical Hacking", "UJ"));
        dataJpaRepo.save(new Course(13, "Learn UnEthical Hacking", "CPT"));
        dataJpaRepo.save(new Course(14, "Learn Mechanics", "UCT"));

        System.out.println("Find By id 8: \n" + dataJpaRepo.findById(8l));
        System.out.println("Find By id 9: \n" +dataJpaRepo.findById(9l));
        System.out.println("Find By id 10: \n" +dataJpaRepo.findById(10l));

        System.out.println("Find By All: \n" +dataJpaRepo.findAll());
        System.out.println("Counts :"+ dataJpaRepo.count());
        System.out.println("Find By Aurthor: \n" + dataJpaRepo.findByAuthor("UJ"));
        System.out.println("Find By Course Name: \n" + dataJpaRepo.findByName("Learn COMSI"));


    }
}
