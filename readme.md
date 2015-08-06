#Spring boot data jpa mysql sample

##Aimed at the following purposes
* As simple as possible
* Use spring boot
* Use spring data jpa
* Use MySQL
* Use maven

##Advance preparation
* Create database
```SQL:testDatabase.sql
CREATE DATABASE `test` /*!40100 DEFAULT CHARACTER SET utf8 */;
```

* Please create table
```SQL:customer.sql
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
```

* Please edit src/main/resources/application.properties
