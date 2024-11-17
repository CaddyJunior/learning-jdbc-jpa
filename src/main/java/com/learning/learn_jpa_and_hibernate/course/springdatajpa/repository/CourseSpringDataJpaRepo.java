package com.learning.learn_jpa_and_hibernate.course.springdatajpa.repository;

import com.learning.learn_jpa_and_hibernate.course.business.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepo extends JpaRepository<Course, Long> {

}
