create table video(
    id bigint auto_increment NOT NULL,
    titulo varchar(100) not null,
    descricao varchar(200) not null,
    url varchar(100) not null,

    primary key(id)
);