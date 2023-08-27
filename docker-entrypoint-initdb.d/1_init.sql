create table brands
(
    id         bigserial primary key ,
    created_at timestamp,
    updated_at timestamp,
    brand_name varchar(20)
);

create table laptops
(
    id               bigserial primary key,
    brand_id         bigint,
    created_at       timestamp(6),
    updated_at       timestamp(6),
    hard_disk_size   varchar(255),
    model_name       varchar(255),
    operating_system varchar(255),
    price            varchar(255),
    ram_memory_size  varchar(255),
    foreign key (brand_id) references brands(id)
);

INSERT INTO brands (created_at, updated_at, brand_name)
VALUES ('2023-08-27 20:51:33.000000', '2023-08-27 20:51:36.000000', 'HP');
INSERT INTO brands (created_at, updated_at, brand_name)
VALUES ('2023-08-27 20:51:33.000000', '2023-08-27 20:51:36.000000', 'Xiaomi');
INSERT INTO brands (created_at, updated_at, brand_name)
VALUES ('2023-08-27 20:51:33.000000', '2023-08-27 20:51:36.000000', 'Honor');


INSERT INTO laptops (brand_id, created_at, updated_at, hard_disk_size, model_name, operating_system, price,
                            ram_memory_size)
VALUES (2, '2023-08-30 21:37:28.000000', '2023-08-27 21:37:35.000000', '244', 'Xiomi MiBook', 'Windows',
        '43242', '8Gb');
INSERT INTO laptops (brand_id, created_at, updated_at, hard_disk_size, model_name, operating_system, price,
                     ram_memory_size)
VALUES (3, '2023-08-30 21:37:28.000000', '2023-08-27 21:37:35.000000', '244', 'MagicBook X 14', 'Windows',
        '49900', '8GB');

