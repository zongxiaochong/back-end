CREATE TABLE `back_end`.`sys_account`  (
  `id` int(16) NOT NULL COMMENT '主键',
  `account` varchar(64) NOT NULL COMMENT '登录账号',
  `password` varchar(32) NOT NULL COMMENT '密码',
  `use_status` int(2) NULL COMMENT '使用状态',
  `acc_type` varchar(16) NULL COMMENT '账户类型',
  `is_deleted` int(1) NOT NULL COMMENT '逻辑标识：1-正常使用，0-删除',
  `creator` varchar(64) NULL COMMENT '创建用户',
  `create_time` datetime(0) NULL COMMENT '创建时间',
  `operator` varchar(64) NULL COMMENT '更新用户',
  `modify_time` datetime(0) NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT='系统用户表';


CREATE TABLE `back_end`.`sys_menu`  (
  `id` int(16) NOT NULL COMMENT '主键',
  `menu_code` varchar(255) NOT NULL COMMENT '菜单code',
  `menu_name` varchar(255) NOT NULL COMMENT '菜单名称',
  `icon` varchar(255) NULL COMMENT '菜单图标',
  `parent_id` int(16) NULL COMMENT '父级菜单',
  `level` int(2) NULL COMMENT '菜单层级',
  `sort` int(2) NULL COMMENT '排序编号',
  `creator` varchar(64) NULL COMMENT '添加用户',
  `create_time` datetime(0) NULL COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT='菜单表';







