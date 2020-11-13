create schema if not exists productsdb;
use productsdb;

create table if not exists items(
barcode bigint NOT NULL,
name VARCHAR(225) NOT NULL,
color VARCHAR(225) NOT NULL,
description VARCHAR(225) NOT NULL,
primary key(barcode));