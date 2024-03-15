create table category(
    id bigint primary key,
    chat_id bigint not null,
    "name" varchar(255) not null,
    created_at timestamp not null
);

create index category_chat_id_idx on category(chat_id);

create table spending(
    id bigint primary key,
    chat_id bigint not null,
    category_id bigint REFERENCES category (id),
    description varchar(255),
    "sum" numeric not null,
    created_at timestamp not null
);

create index spending_chat_id_idx on spending(chat_id);
create index spending_category_id_idx on spending(category_id);

create table user_command(
    chat_id bigint primary key,
    status varchar(255) not null,
    created_at timestamp not null
);