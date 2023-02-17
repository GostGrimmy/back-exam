-- back_exam.wallet definition

CREATE TABLE `wallet` (
                          `id` bigint NOT NULL AUTO_INCREMENT,
                          `user_code` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                          `create_time` date NOT NULL,
                          `balance` decimal(22,3) NOT NULL,
                          `wallet_Code` varchar(100) NOT NULL,
                          PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;