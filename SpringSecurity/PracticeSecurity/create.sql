create table course (course_id integer not null, duration integer not null, title varchar(255), instructor integer, primary key (course_id)) engine=InnoDB;
create table instructor (id integer not null, first_name varchar(255), last_name varchar(255), primary key (id)) engine=InnoDB;
alter table course add constraint FKbfjh7520r8jgjrtwshk8tbqwb foreign key (instructor) references instructor (id);
