#Spring boot data jpa mysql sample

##以下の目的を目指しています
* できるだけシンプルに
* spring bootを使用
* spring data jpaを使用
* MySQLを使用
* mavenを使用

##事前準備
* Create databaseを行う
```SQL:testDatabase.sql
CREATE DATABASE `test` /*!40100 DEFAULT CHARACTER SET utf8 */;
```

* Create tableを行う
```SQL:customer.sql
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
```

* src/main/resources/application.propertiesの中身を編集する

##以下のページを参考にしています
* https://spring.io/guides/gs/accessing-data-jpa/
