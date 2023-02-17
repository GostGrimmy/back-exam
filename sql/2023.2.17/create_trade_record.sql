-- back_exam.trade_Record definition

CREATE TABLE `trade_Record` (
                                `id` bigint NOT NULL AUTO_INCREMENT,
                                `type` tinyint NOT NULL COMMENT '0表示外部充值，1表示扣费，2表示从别钱包充到此钱包，3表示从此钱包充到别钱包',
                                `trade_amount` decimal(22,3) NOT NULL COMMENT '交易金额',
                                `User_Code` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '发起交易的用户编号',
                                `create_Time` date NOT NULL COMMENT '创建时间',
                                `recode_Code` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '编号',
                                `status` tinyint NOT NULL COMMENT '状态：0为创建，1为进行，2为交易成功，3为交易失败。',
                                `trade_before` decimal(22,3) NOT NULL COMMENT '交易前余额',
                                `trade_after` decimal(22,3) NOT NULL COMMENT '交易后余额',
                                `wallet_code` varchar(100) COLLATE utf8mb4_0900_as_ci DEFAULT NULL COMMENT '当前交易钱包',
                                `wallet_to` varchar(100) COLLATE utf8mb4_0900_as_ci DEFAULT NULL COMMENT '当充值时，交易类型为2和3时，表示为此钱包和其它钱包交易的其它钱包编号',
                                PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_ci;