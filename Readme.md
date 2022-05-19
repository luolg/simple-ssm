# simple-ssm
> This is simple ssm project that using spring spring-mvc mybatis.

### Prepare
make sure you have mysql running
```
# run mysql with docker
docker run --name mysql \
-e MYSQL_ROOT_PASSWORD=ops123 \
-p 3306:3306 \
-d mysql:5.7

# create database ssm with sql
docker exec -it mysql bash
mysql -uroot -p

# password
ops123

# use ssm as database;
create database ssm;
use ssm;

# create players table with sql

CREATE TABLE `players` (
                           `id` bigint(22) unsigned NOT NULL AUTO_INCREMENT COMMENT 'player id',
                           `name` char(22) NOT NULL DEFAULT '' COMMENT 'player name',
                           `number` int(22) unsigned NOT NULL COMMENT 'player known number',
                           `team` varchar(22) NOT NULL DEFAULT '' COMMENT 'play golden team',
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='NBA goat palyers';

INSERT INTO `players` (`id`, `name`, `number`, `team`)
VALUES
    (1000, 'kobe bryant', 24, 'laker'),
    (1001, 'michael jordan', 23, 'bulls'),
    (1002, 'lebron james', 23, 'cavaliers'),
    (1003, 'yao ming', 11, 'rockets');

# start project in tomcat8
# I used the IntelliJ Tomcat server to start the project, this is much more easy
# if you use macbook ,you can install tomcat 8 with command
brew install tomcat@8

```

![img.png](img.png)
![img_1.png](img_1.png)