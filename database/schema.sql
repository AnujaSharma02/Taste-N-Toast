CREATE DATABASE toastntaste;
USE toastntaste;

CREATE TABLE orders (
    id INT AUTO_INCREMENT PRIMARY KEY,
    food_item VARCHAR(100),
    quantity INT,
    order_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
