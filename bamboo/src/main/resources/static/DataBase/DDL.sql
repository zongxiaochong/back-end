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
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT='账户表';


CREATE TABLE `back_end`.`sys_account_user`  (
  `id` int(16) NOT NULL COMMENT '主键',
  `account_id` int(16) NOT NULL COMMENT '账户Id',
  `name` varchar(32) NULL COMMENT '姓名',
  `gender` int(2) NULL COMMENT '性别',
  `birthday` datetime(0) NULL COMMENT '生日',
  `id_type` int(3) NULL COMMENT '证件类型',
  `id_number` varchar(32) NULL COMMENT '证件号码',
  `phone` varchar(32) NULL COMMENT '联系电话',
  `mail` varchar(255) NULL COMMENT '邮箱',
  `addr` varchar(1024) NULL COMMENT '通讯地址',
  `is_deleted` int(1) NULL COMMENT '逻辑标识：1-正常使用，0-删除',
  `creator` varchar(64) NULL COMMENT '添加用户',
  `create_time` datetime(0) NULL COMMENT '添加时间',
  `operator` varchar(64) NULL COMMENT '更新用户',
  `modify_time` datetime(0) NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '账户信息表';


CREATE TABLE `back_end`.`sys_menu`  (
  `id` int(16) NOT NULL COMMENT '主键',
  `menu_code` varchar(128) NOT NULL COMMENT '菜单编码',
  `menu_name` varchar(128) NOT NULL COMMENT '菜单名称',
  `icon_font` varchar(255) NULL COMMENT '菜单图标',
  `path` varchar(255) NOT NULL COMMENT '菜单路径',
  `url` varchar(255) NULL COMMENT '菜单URL,保留字段',
  `parent_id` int(16) NULL COMMENT '父级菜单Id',
  `menu_level` int(3) NULL COMMENT '菜单层级',
  `sort` int(3) NULL COMMENT '排序编号',
  `creator` varchar(64) NULL COMMENT '添加用户',
  `create_time` datetime(0) NULL COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '菜单表';


CREATE TABLE `back_end`.`sys_role`  (
  `id` int(16) NOT NULL COMMENT '主键',
  `role_code` varchar(32) NULL COMMENT '角色编号',
  `role_name` varchar(128) NULL COMMENT '角色名称',
  `remark` varchar(255) NULL COMMENT '描述',
  `creator` varchar(64) NULL COMMENT '添加用户',
  `create_time` datetime(0) NULL COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色表';


CREATE TABLE `back_end`.`sys_role_releation`  (
  `id` int(16) NOT NULL COMMENT '主键',
  `rel_type` varchar(32) NOT NULL COMMENT '关系类型：menu-菜单，permission-权限',
  `role_id` int(16) NOT NULL COMMENT '角色Id',
  `obj_id` int(16) NOT NULL COMMENT '关系对象Id',
  `creator` varchar(64) NULL COMMENT '添加用户',
  `create_time` datetime(0) NULL COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色关系表';


CREATE TABLE `back_end`.`sys_account_releation`  (
  `id` int(16) NOT NULL COMMENT '主键',
  `rel_type` varchar(32) NULL COMMENT '关系类型：role-角色',
  `account_id` int(16) NULL COMMENT '账户Id',
  `obj_id` int(16) NULL COMMENT '关系对象Id',
  `creator` varchar(64) NULL COMMENT '添加用户',
  `create_time` datetime(0) NULL COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '账户关系表';


CREATE TABLE `back_end`.`sys_dict`  (
  `code_type` varchar(64) NOT NULL COMMENT '编码类型',
  `code` varchar(64) NULL COMMENT '编码',
  `code_name` varchar(255) NULL COMMENT '编码名称',
  `code_alias` varchar(128) NULL COMMENT '编码别名',
  `other_sign` varchar(255) NULL COMMENT '其他标识'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '字典代码表';



