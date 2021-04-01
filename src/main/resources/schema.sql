create table user
(
   id integer not null,
   name varchar(255) not null,
   role integer not null,
   primary key(id)
);

create table user_role
(
   id integer not null,
   name varchar(255) not null,
   primary key(id)
);