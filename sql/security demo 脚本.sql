CREATE DATABASE IF NOT EXISTS sskdb

-- role
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`name` varchar(32) DEFAULT NULL,
`nameZh` varchar(32) DEFAULT NULL,
PRIMARY KEY (`id`)  
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

INSERT INTO `role` VALUES ('1', 'ROLE_dba', '数据库管理员');
INSERT INTO `role` VALUES ('2', 'ROLE_admin', '系统管理员');  
INSERT INTO `role` VALUES ('3', 'ROLE_user', '用户');

-- user
DROP TABLE IF EXISTS `user`;  
CREATE TABLE `user` ( 
`id` int(11) NOT NULL AUTO_INCREMENT, 
`username` varchar(32) DEFAULT NULL,  
`password` varchar(255) DEFAULT NULL,  
`enabled` tinyint(1) DEFAULT NULL, 
`locked` tinyint(1) DEFAULT NULL,  
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- 密码明文是 123
INSERT INTO `user` VALUES ('1', 'root', '$2a$10$RMuFXGQ5AtH4wOvkUqyvuecpqUSeoxZYqilXzbz50dceRsga.WYiq', '1', '0');  
INSERT INTO `user` VALUES ('2', 'admin', '$2a$10$RMuFXGQ5AtH4wOvkUqyvuecpqUSeoxZYqilXzbz50dceRsga.WYiq', '1', '0'); 
INSERT INTO `user` VALUES ('3', 'sang', '$2a$10$RMuFXGQ5AtH4wOvkUqyvuecpqUSeoxZYqilXzbz50dceRsga.WYiq', '1', '0');

-- user_role
DROP TABLE IF EXISTS `user_role`; 
CREATE TABLE `user_role` ( 
`id` int(11) NOT NULL AUTO_INCREMENT, 
`uid` int(11) DEFAULT NULL,  
`rid` int(11) DEFAULT NULL, 
PRIMARY KEY (`id`) 
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;


INSERT INTO `user_role` VALUES ('1', '1', '1'); 
INSERT INTO `user_role` VALUES ('2', '1', '2'); 
INSERT INTO `user_role` VALUES ('3', '2', '2'); 
INSERT INTO `user_role` VALUES ('4', '3', '3');