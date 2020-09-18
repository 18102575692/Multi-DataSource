-- auto-generated definition
create table sys_menu
(
    id        int auto_increment comment 'id
'
        primary key,
    name      varchar(60)  null,
    parent_id int          null comment '父级菜单ID',
    url       varchar(200) null comment '接口',
    action    varchar(20)  null comment '请求方式',
    component varchar(100) null comment '前端vue的组件名称',
    `index`   int          null comment '序号 从小到大',
    icon      varchar(100) null comment '图标',
    is_show   int          null comment '0：不显示 1：显示'
);

