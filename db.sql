create table customer
(
    id       int auto_increment
        primary key,
    name     varchar(20)      not null,
    modified timestamp        null,
    created  timestamp        null,
    phone    varchar(20)      null,
    delYn    char default 'N' null
);
