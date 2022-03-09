create table game (id varchar(255) not null, background_image varchar(255), metacritic int4, name varchar(255), rating float8 not null, released timestamp, primary key (id));
create table platforms (game_id varchar(255) not null, platforms int4);
alter table if exists platforms add constraint FKrl1w2nha63kdq2hfpgdym492e foreign key (game_id) references game;
