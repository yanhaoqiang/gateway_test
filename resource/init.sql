create database `test_mybatis`;
use `test_mybatis`;
CREATE TABLE `article` (
  `id` varchar(64) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `body` text,
  `create_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='文章表';