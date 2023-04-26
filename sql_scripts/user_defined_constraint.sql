-- user defined constraint

CREATE TABLE sale (
    saleId INT PRIMARY KEY,
    locationId INT NOT NULL,
    amount DECIMAL,
    CHECK (amount >= 20.0)
);

insert into sale
values
(1, 200, 100.0);

select * from sale;

insert into sale
values
(1, 200, 5.0);