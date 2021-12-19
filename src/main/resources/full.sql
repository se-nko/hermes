create table accounts
(
    id         bigserial primary key,
    token      varchar(100),
    api_key    varchar(100),
    api_secret varchar(100)
);


create table account_settings (
    id bigserial primary key,
    account_id bigint references accounts (id),
    strategy_name varchar(50),
    currency varchar(50),
    limit bigint -- TODO make numeric
);

insert into account_settings (account_id, strategy_name, currency, limit) values
(select id from