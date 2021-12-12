create table accounts
(
    id         bigserial primary key,
    token      varchar(100),
    api_key    varchar(100),
    api_secret varchar(100)
);