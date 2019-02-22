drop database if exists lesson;
create database if not exists lesson;
use lesson;
drop table if exists login_user;
create table login_user(
  id int not null primary key auto_increment,
  user_name varchar(50),
  password varchar(16),
  insert_date datetime
);

INSERT INTO login_user(user_name, password) VALUES("admin", "1234");