CREATE TABLE `User` (
                        `id` bigint NOT NULL AUTO_INCREMENT,
                        `user_code` varchar(100) DEFAULT NULL,
                        `balance` varchar(100) DEFAULT NULL,
                        `create_time` varchar(100) DEFAULT NULL,
                        `type` tinyint DEFAULT NULL,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;