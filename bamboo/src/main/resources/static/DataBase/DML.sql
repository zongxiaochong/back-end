INSERT INTO `sys_menu`
       (`id`, `menu_code`, `menu_name`, `icon_font`, `path`, `url`, `parent_id`, `menu_level`, `sort`, `creator`, `create_time`) 
VALUES (1, 'sys', '系统设置', 'layui-icon-set', NULL, NULL, 0, 1, 99, 'admin', NOW());
       
INSERT INTO `sys_menu`
       (`id`, `menu_code`, `menu_name`, `icon_font`, `path`, `url`, `parent_id`, `menu_level`, `sort`, `creator`, `create_time`) 
VALUES (2, 'sys-menu', '菜单管理', 'layui-icon-component', '/sys/menu/index', NULL, 1, 2, 1, 'admin', NOW());
       
INSERT INTO `sys_menu`
       (`id`, `menu_code`, `menu_name`, `icon_font`, `path`, `url`, `parent_id`, `menu_level`, `sort`, `creator`, `create_time`) 
VALUES (3, 'sys-role', '角色管理', 'layui-icon-auz', '/sys/role/index', NULL, 1, 2, 2, 'admin', NOW());
       
INSERT INTO `sys_menu`
       (`id`, `menu_code`, `menu_name`, `icon_font`, `path`, `url`, `parent_id`, `menu_level`, `sort`, `creator`, `create_time`) 
VALUES (4, 'sys-account', '用户管理', 'layui-icon-user', '/sys/user/index', NULL, 1, 2, 3, 'admin', NOW());
       
INSERT INTO `sys_menu`
       (`id`, `menu_code`, `menu_name`, `icon_font`, `path`, `url`, `parent_id`, `menu_level`, `sort`, `creator`, `create_time`) 
VALUES (5, 'sys-dict', '数据字典', 'layui-icon-template-1', '/sys/dict', NULL, 1, 2, 4, 'admin', NOW());


INSERT INTO `sys_role`
	(`id`, `role_code`, `role_name`, `mark`, `creator`, `create_time`) 
VALUES (1, 'admin', '超级管理员', '超级系统管理员，系统初始化时创建', 'admin', NOW());


INSERT INTO `sys_user`
	(`id`, `account`, `password`, `last_login_time`, `use_status`, `acc_type`, `login_set`, `is_deleted`, `creator`, `create_time`, `operator`, `modify_time`) 
VALUES (1, 'admin', '123123', NULL, 1, '', 's', 1, 'admin', NOW(), NULL, NULL);


INSERT INTO `sys_role_releation`(`id`, `rel_type`, `role_id`, `obj_id`, `creator`, `create_time`) VALUES (1, 'menu', 1, 1, 'admin', NOW());
INSERT INTO `sys_role_releation`(`id`, `rel_type`, `role_id`, `obj_id`, `creator`, `create_time`) VALUES (2, 'menu', 1, 2, 'damin', NOW());
INSERT INTO `sys_role_releation`(`id`, `rel_type`, `role_id`, `obj_id`, `creator`, `create_time`) VALUES (3, 'menu', 1, 3, 'admin', NOW());
INSERT INTO `sys_role_releation`(`id`, `rel_type`, `role_id`, `obj_id`, `creator`, `create_time`) VALUES (4, 'menu', 1, 4, 'admin', NOW());
INSERT INTO `sys_role_releation`(`id`, `rel_type`, `role_id`, `obj_id`, `creator`, `create_time`) VALUES (5, 'menu', 1, 5, 'admin', NOW());


INSERT INTO `sys_user_role`(`id`, `user_id`, `role_id`, `creator`, `create_time`) VALUES (1, 1, 1, 'admin', NOW());


INSERT INTO `sys_user_info`(`id`, `user_id`, `real_name`, `sex`, `birthday`, `id_type`, `id_number`, `phone`, `mail`, `address`, `head_photo`, `is_deleted`, `creator`, `create_time`, `operator`, `modify_time`) 
VALUES (1, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'https://www.psjia.com/uploads/allimg/190724/14-1ZH41624370-L.png', 1, NULL, NULL, NULL, NULL);




INSERT INTO `t_dict`(`code_type`, `code_name`, `code_value`, `code_alias`, `other_sign`) VALUES ('login_set', 's', '单站点登录', 'single', NULL);
INSERT INTO `t_dict`(`code_type`, `code_name`, `code_value`, `code_alias`, `other_sign`) VALUES ('login_set', 'm', '多站点登录', 'multie', NULL);
INSERT INTO `t_dict`(`code_type`, `code_name`, `code_value`, `code_alias`, `other_sign`) VALUES ('sex', 'M', '男', 'male', NULL);
INSERT INTO `t_dict`(`code_type`, `code_name`, `code_value`, `code_alias`, `other_sign`) VALUES ('sex', 'F', '女', 'female', NULL);
INSERT INTO `t_dict`(`code_type`, `code_name`, `code_value`, `code_alias`, `other_sign`) VALUES ('sex', 'other', '其他', 'other', NULL);




