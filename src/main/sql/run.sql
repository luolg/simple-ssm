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
