create table course
(
    id bigint not null,
    name varchar(255) not null,
    author varchar(255) not null,
    primary key(id)

);

insert into course (id, name, author) values (1, 'Learn AWS', 'in28minutes');
insert into course (id, name, author) values (2, 'Learn DevOps', 'in28minutes');
insert into course (id, name, author) values (3, 'Learn Maths', 'Wits');
insert into course (id, name, author) values (4, 'Learn COMS', 'Wits');