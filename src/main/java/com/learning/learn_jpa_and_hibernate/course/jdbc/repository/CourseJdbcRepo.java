package com.learning.learn_jpa_and_hibernate.course.jdbc.repository;

import com.learning.learn_jpa_and_hibernate.course.business.Course;
import com.learning.learn_jpa_and_hibernate.course.constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private Constants constants;

    private Course course;

    public void insert(Course couse){
        jdbcTemplate.update(Constants.INSERT_QUERY,
                couse.getId(), couse.getName(), couse.getAuthor());
    }

    public void deleteById(long id){
        jdbcTemplate.update(Constants.DELETE_QUERY, id);
    }


    public Course selecyById(long id){
        return jdbcTemplate.queryForObject(Constants.SELECT_BY_ID_QUERY,
                new BeanPropertyRowMapper<>(Course.class), id);
    }

}
