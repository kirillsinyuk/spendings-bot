create table if not exists telegram_user
(
    id uuid primary key,
    chat_id bigint not null
);

create index chat_id_idx on telegram_user(chat_id);