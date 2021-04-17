DROP TABLE IF EXISTS EMPLOYEE;

CREATE TABLE EMPLOYEE (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  country_code varchar(3) NOT NULL,
  mobile varchar(15) NOT NULL,
  email varchar(25) NOT NULL,
  password varchar(100) NOT NULL

);

INSERT INTO EMPLOYEE (first_name, last_name, country_code,mobile,email,password) VALUES
    ('kuldeep', 'rana', '+91','0000000000','someemail@temp.com','password');