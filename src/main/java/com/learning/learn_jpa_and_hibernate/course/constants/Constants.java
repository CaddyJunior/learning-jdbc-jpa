package com.learning.learn_jpa_and_hibernate.course.constants;

public class Constants {

    public static final String INSERT_QUERY =
            """
            insert into course (id, name, author) 
            values (?, ?, ?);
            """;

    public static final String DELETE_QUERY =
            """
            delete from course
            where id = ?;
            """;

    public static final String SELECT_ALL_QUERY =
            """
            select * from course;
            """;

    public static final String SELECT_BY_ID_QUERY =
            """
            select * from course
             where id = ?;
            """;
}
