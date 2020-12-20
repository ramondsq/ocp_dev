# 删除数据库
drop database if exists ocpdb_cs182group8;

# 创建数据库
create database ocpdb_cs182group8 default charset = UTF8;

# 进入数据库
use ocpdb_cs182group8;

# 创建运营人员登录表
create table operator_login
(
    oplog_user_name varchar(20) NOT NULL PRIMARY KEY, #用户名
    oplog_password  varchar(20) NOT NULL              #密码
) engine = InnoDB
  default charset = UTF8;


# 创建经销商登录表
create table retailer_login
(
    rtlog_user_name varchar(20) NOT NULL PRIMARY KEY, #用户名
    rtlog_password  varchar(8)  NOT NULL              #密码
) engine = InnoDB
  default charset = UTF8;
# 创建经销商信息表
create table retailer
(
    retailer_id           int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY, #经销商编码
    retailer_name         varchar(20),                                 #经销商名称
    retailer_shortname    varchar(20),                                 #经销商简称
    retailer_area         varchar(20),                                 #区域（一级只填省、二级区域填省市、三级区域填省市区）
    retailer_store_name   varchar(20),                                 #店铺名称
    retailer_institute    varchar(20),                                 #机构名称
    retailer_type         varchar(10),                                 #经销商类别（一、二、三级）
    retailer_user_name    varchar(20),                                 #用户名 外键
    retailer_contact_name varchar(10),                                 #联系人
    retailer_email        varchar(30),                                 #电子邮箱
    retailer_phone        varchar(20),                                 #手机号码
    retailer_status       varchar(10),                                 #状态（启用/禁用）
    retailer_remark       varchar(100)                                 #备注
) engine = InnoDB
  default charset = UTF8;
# 添加外键约束
alter table retailer
    add constraint retailer_user_name foreign key (retailer_user_name) references retailer_login (rtlog_user_name);


# 创建运营人员信息表
create table operator
(
    op_user_name varchar(20) NOT NULL PRIMARY KEY, #用户
    op_real_name varchar(10),                      #真实姓名
    op_institute varchar(20),                      #所属机构
    op_role      varchar(10),                      #角色（用户自定义）
    op_gender    varchar(5),                       #性别
    op_email     varchar(30),                      #电子邮箱
    op_phone     varchar(20),                      #手机号码
    op_status    varchar(10)                       #状态（启用/禁用）
) engine = InnoDB
  default charset = UTF8;


# 创建经销商地址表
create table retailer_address
(
    rta_retailer_id   int(10) NOT NULL, #经销商编码 外键
    rta_address       varchar(100),     #收货地址
    rta_receiver_name varchar(20),      #收货人
    rta_phone         varchar(20),      #联系电话
    PRIMARY KEY (rta_retailer_id, rta_address)
) engine = InnoDB
  default charset = UTF8;
# 添加外键约束
alter table retailer_address
    add constraint rta_retailer_id foreign key (rta_retailer_id) references retailer (retailer_id);


# 创建仓库表
create table warehouse
(
    warehouse_id            int(10) NOT NULL PRIMARY KEY, #仓库编号
    warehouse_name          varchar(20),                  #仓库名称
    warehouse_status        varchar(10),                  #状态（启用/禁用）
    warehouse_contact_name  varchar(10),                  #联系人
    warehouse_contact_phone varchar(20),                  #联系电话
    warehouse_address       varchar(100),                 #仓库地址
    warehouse_remark        varchar(100)                  #备注
) engine = InnoDB
  default charset = UTF8;

# 创建产品表
create table product
(
    product_id             int(10) NOT NULL PRIMARY KEY, #产品编码
    product_line           varchar(20),                  #产品线
    product_name           varchar(20),                  #产品名称
    product_qty            int(10),                      #产品库存
    unit_measurement_name  varchar(10),                  #计量单位名称
    product_type           varchar(10),                  #产品类型 （日用、电子、 服饰、化妆品）
    product_model          varchar(20),                  #产品型号 （model-xxx）"
    product_standard_price decimal(8, 2),                #标准价
    product_volume         decimal(8, 2),                #体积（cm^3）
    product_weight         decimal(8, 2),                #重量(kg)
    product_length         decimal(8, 2),                #长(cm)
    product_width          decimal(8, 2),                #宽(cm)
    product_height         decimal(8, 2),                #高(cm)
    is_selling             int(1)  NOT NULL              #"是否正在销售 (只能取0/1)"

) engine = InnoDB
  default charset = UTF8;

# 创建备货订单表
create table stock_order
(
    sto_order_number       int(10)     NOT NULL PRIMARY KEY AUTO_INCREMENT,                    #订单编号
    sto_invoice_title      varchar(50),                                                        #抬头
    sto_retailer_id        int(10),                                                            #经销商编码 外键
    sto_out_warehouse_id   int(10),                                                            #出货仓库编号 外键
    sto_in_warehouse_id    int(10),                                                            #入货仓库编号 外键
    sto_pickup_method      varchar(10)          default '配送' check (sto_pickup_method = '配送'), #提货方式 (仅配送)"
    sto_period_demand      date,                                                               #备货需求时间段_年月日 (上旬：1日 中旬：11日 下旬：20)
    sto_submit_datetime    datetime,                                                           #提交备货订单时间
    sto_remark             varchar(100),                                                       #备注
    sto_product_id         int(10),                                                            #产品编码 外键
    sto_product_qty        decimal(8, 2),                                                      #备货数量
    sto_invoice_price      decimal(8, 2),                                                      #开票价格
    sto_total_price        decimal(8, 2),                                                      #总金额
    sto_volume             decimal(8, 2),                                                      #总体积
    sto_file_path          varchar(50),                                                        #附件文件路径
    sto_status             varchar(20) NOT NULL default '待初审',                                 #审核状态 （待处理、待初审，待复核，已通过，已驳回）
    sto_reason             varchar(100),                                                       #不通过原因
    sto_reviewer_user_name varchar(10)                                                         #审核人用户名 外键
) engine = InnoDB
  default charset = UTF8;
# 添加外键约束
alter table stock_order
    add constraint sto_retailer_id foreign key (sto_retailer_id) references retailer (retailer_id);
alter table stock_order
    add constraint sto_out_warehouse_id foreign key (sto_out_warehouse_id) references warehouse (warehouse_id);
alter table stock_order
    add constraint sto_in_warehouse_id foreign key (sto_in_warehouse_id) references warehouse (warehouse_id);
alter table stock_order
    add constraint sto_product_id foreign key (sto_product_id) references product (product_id);
alter table stock_order
    add constraint sto_reviewer foreign key (sto_reviewer_user_name) references operator (op_user_name);


# 创建批发订单表
create table wholesale_order
(
    wso_order_number       int(10)     NOT NULL PRIMARY KEY AUTO_INCREMENT, #不为空		主键	订单编号
    wso_invoice_title      varchar(50),                                     #抬头
    wso_retailer_id        int(10),                                         #外键	经销商编码
    wso_out_warehouse_id   int(10),                                         #外键	出货仓库编号
    wso_detail_address_id  varchar(100),                                    #详细送货地址
    wso_receiver           varchar(20),                                     #收货人
    wso_phone              varchar(20),                                     #联系电话
    wso_pickup_method      varchar(10)
        check (wso_pickup_method in ('汽运', '海运', '铁运', '快递', '自提')),
    #"提货方式(汽运，海运，铁运，快递和自提)"
    wso_remark             varchar(100),                                    #备注
    wso_product_id         int(10),                                         #外键 产品编码
    wso_product_qty        decimal(8, 2),                                   #批发数量
    wso_invoice_price      decimal(8, 2),                                   #开票价格
    wso_total_price        decimal(8, 2),                                   #总金额
    wso_volume             decimal(8, 2),                                   #总体积
    wso_file_path          varchar(50),                                     #附件文件路径
    wso_status             varchar(20) NOT NULL default '待初审',              #不为空 审核状态（待处理、待初审，待复核，已通过，已驳回）"
    wso_reason             varchar(100),                                    #不通过原因
    wso_reviewer_user_name varchar(10)                                      #外键	审核人姓名
) engine = InnoDB
  default charset = UTF8;
# 添加外键约束
alter table wholesale_order
    add constraint wso_retailer_id foreign key (wso_retailer_id) references retailer (retailer_id);
alter table wholesale_order
    add constraint wso_out_warehouse_id foreign key (wso_out_warehouse_id) references warehouse (warehouse_id);
alter table wholesale_order
    add constraint wso_product_id foreign key (wso_product_id) references product (product_id);
alter table wholesale_order
    add constraint wso_reviewer foreign key (wso_reviewer_user_name) references operator (op_user_name);

# 创建零售订单表
create table retail_order
(
    rto_transaction_id   int(10) NOT NULL PRIMARY KEY, #主键 网上交易订单号
    rto_retailer_id      int(10) NOT NULL,             #外键 所属经销商编号
    rto_source_website   varchar(50),                  #订单来源网站
    rto_source_store     varchar(50),                  #所属网店名称
    rto_order_status     varchar(20),                  #"订单状态 (打开.关闭.取消.完成)"
    rto_shipment_status  varchar(20),                  #"发货状态 (待发货.待收货.已收货)"
    rto_order_date       datetime,                     #订单日期
    rto_paid_date        datetime,                     #付款日期
    rto_shipment_date    datetime,                     #发货日期
    rto_order_price      decimal(8, 2),                #订单金额
    rto_actually_paid    decimal(8, 2),                #实付金额
    rto_weight           decimal(8, 2),                #重量（kg）
    rto_freight          decimal(8, 2),                #运费
    rto_shipping_address varchar(100),                 #收货地址
    rto_receiver_name    varchar(20),                  #收货人姓名
    rto_receiver_phone   varchar(20),                  #收货人电话
    rto_express_company  varchar(10),                  #快递公司
    rto_express_number   int(10)                       #快递单号
) engine = InnoDB
  default charset = UTF8;
# 添加外键约束
alter table retail_order
    add constraint rto_retailer_id foreign key (rto_retailer_id) references retailer (retailer_id);


# 插入运营人员登录表测试数据
insert into operator_login(oplog_user_name, oplog_password)
values ('operator1', '123456');
insert into operator_login(oplog_user_name, oplog_password)
values ('operator2', '123456');
insert into operator_login(oplog_user_name, oplog_password)
values ('operator3', '123456');
insert into operator_login(oplog_user_name, oplog_password)
values ('operator4', '123456');
insert into operator_login(oplog_user_name, oplog_password)
values ('operator5', '123456');
insert into operator_login(oplog_user_name, oplog_password)
values ('operator6', '123456');
insert into operator_login(oplog_user_name, oplog_password)
values ('operator7', '123456');
insert into operator_login(oplog_user_name, oplog_password)
values ('operator8', '123456');
insert into operator_login(oplog_user_name, oplog_password)
values ('operator9', '123456');
insert into operator_login(oplog_user_name, oplog_password)
values ('operator10', '123456');

# 插入经销商登录表测试数据
insert into retailer_login(rtlog_user_name, rtlog_password)
values ('retailer1', '654321');
insert into retailer_login(rtlog_user_name, rtlog_password)
values ('retailer2', '654321');
insert into retailer_login(rtlog_user_name, rtlog_password)
values ('retailer3', '654321');
insert into retailer_login(rtlog_user_name, rtlog_password)
values ('retailer4', '654321');
insert into retailer_login(rtlog_user_name, rtlog_password)
values ('retailer5', '654321');
insert into retailer_login(rtlog_user_name, rtlog_password)
values ('retailer6', '654321');
insert into retailer_login(rtlog_user_name, rtlog_password)
values ('retailer7', '654321');
insert into retailer_login(rtlog_user_name, rtlog_password)
values ('retailer8', '654321');
insert into retailer_login(rtlog_user_name, rtlog_password)
values ('retailer9', '654321');
insert into retailer_login(rtlog_user_name, rtlog_password)
values ('retailer10', '654321');

# 插入经销商信息表测试数据
insert into retailer(retailer_id, retailer_name, retailer_shortname, retailer_area, retailer_store_name,
                     retailer_institute, retailer_type, retailer_user_name, retailer_contact_name, retailer_email,
                     retailer_phone, retailer_status, retailer_remark)
values (null, '经销商1', '经销商简称1', '四川省', '店铺1', '机构1', '一级', 'retailer1', '联系人1', 'retailer1@163.com', '15866678881',
        '启用', null),
       (null, '经销商2', '经销商简称2', '四川省', '店铺2', '机构2', '一级', 'retailer2', '联系人2', 'retailer2@163.com', '15866678882',
        '启用', null),
       (null, '经销商3', '经销商简称3', '四川省成都市', '店铺3', '机构3', '二级', 'retailer3', '联系人3', 'retailer3@163.com', '15866678883',
        '启用', null),
       (null, '经销商4', '经销商简称4', '四川省成都市', '店铺4', '机构4', '二级', 'retailer4', '联系人4', 'retailer4@163.com', '15866678884',
        '启用', null),
       (null, '经销商5', '经销商简称5', '四川省成都市双流区', '店铺5', '机构5', '三级', 'retailer5', '联系人5', 'retailer5@163.com',
        '15866678885', '启用', null),
       (null, '经销商6', '经销商简称6', '四川省成都市双流区', '店铺6', '机构6', '三级', 'retailer6', '联系人6', 'retailer6@163.com',
        '15866678886', '启用', null),
       (null, '经销商7', '经销商简称7', '四川省泸州市', '店铺7', '机构7', '二级', 'retailer7', '联系人7', 'retailer7@163.com', '15866678887',
        '启用', null),
       (null, '经销商8', '经销商简称8', '四川省泸州市', '店铺8', '机构8', '二级', 'retailer8', '联系人8', 'retailer8@163.com', '15866678888',
        '启用', null),
       (null, '经销商9', '经销商简称9', '四川省泸州市江阳区', '店铺9', '机构9', '一级', 'retailer9', '联系人9', 'retailer9@163.com',
        '15866678889', '启用', null),
       (null, '经销商10', '经销商简称10', '四川省泸州市江阳区', '店铺10', '机构10', '一级', 'retailer10', '联系人10', 'retailer10@163.com',
        '15866678810', '启用', null);

# 插入运营人员信息表测试数据
insert into operator(op_user_name, op_real_name, op_institute, op_role, op_gender, op_email, op_phone, op_status)
values ('operator1', '姓名1', '机构1', '角色1', '男', 'operator1@qq.com', '11451411451', '启用'),
       ('operator2', '姓名2', '机构2', '角色2', '男', 'operator2@qq.com', '11451411452', '启用'),
       ('operator3', '姓名3', '机构3', '角色3', '男', 'operator3@qq.com', '11451411453', '启用'),
       ('operator4', '姓名4', '机构4', '角色4', '男', 'operator4@qq.com', '11451411454', '启用'),
       ('operator5', '姓名5', '机构5', '角色5', '男', 'operator5@qq.com', '11451411455', '启用'),
       ('operator6', '姓名6', '机构6', '角色6', '男', 'operator6@qq.com', '11451411456', '启用'),
       ('operator7', '姓名7', '机构7', '角色7', '男', 'operator7@qq.com', '11451411457', '启用'),
       ('operator8', '姓名8', '机构8', '角色8', '男', 'operator8@qq.com', '11451411458', '启用'),
       ('operator9', '姓名9', '机构9', '角色9', '男', 'operator9@qq.com', '11451411459', '启用'),
       ('operator10', '姓名10', '机构10', '角色10', '男', 'operator10@qq.com', '11451411450', '启用');

# 插入经销商地址表测试数据
insert into retailer_address(rta_retailer_id, rta_address, rta_receiver_name, rta_phone)
values (1, '四川省成都市1', '收货人1', '18911451401'),
       (2, '四川省成都市2', '收货人2', '18911451402'),
       (3, '四川省成都市3', '收货人3', '18911451403'),
       (4, '四川省成都市4', '收货人4', '18911451404'),
       (5, '四川省成都市5', '收货人5', '18911451405'),
       (6, '四川省成都市6', '收货人6', '18911451406'),
       (7, '四川省成都市7', '收货人7', '18911451407'),
       (8, '四川省成都市8', '收货人8', '18911451408'),
       (9, '四川省成都市9', '收货人9', '18911451409'),
       (10, '四川省成都市10', '收货人10', '18911451410');

# 插入仓库表测试数据
insert into warehouse(warehouse_id, warehouse_name, warehouse_status, warehouse_contact_name, warehouse_contact_phone,
                      warehouse_address, warehouse_remark)
values (01, '仓库1', '启用', '张一', '11451411111', '四川省双流区1', '备注1'),
       (02, '仓库2', '启用', '张二', '11451411112', '四川省双流区2', '备注2'),
       (03, '仓库3', '启用', '张三', '11451411113', '四川省双流区3', '备注3'),
       (04, '仓库4', '启用', '张四', '11451411114', '四川省双流区4', '备注4'),
       (05, '仓库5', '启用', '张五', '11451411115', '四川省双流区5', '备注5'),
       (06, '仓库6', '启用', '张六', '11451411116', '四川省双流区6', '备注6'),
       (07, '仓库7', '启用', '张七', '11451411117', '四川省双流区7', '备注7'),
       (08, '仓库8', '启用', '张八', '11451411118', '四川省双流区8', '备注8'),
       (09, '仓库9', '启用', '张九', '11451411119', '四川省双流区9', '备注9'),
       (10, '仓库10', '启用', '张十', '11451411110', '四川省双流区10', '备注10');


# 插入产品表测试数据
insert into product(product_id, product_line, product_name, product_qty, unit_measurement_name, product_type,
                    product_model, product_standard_price, product_volume, product_weight, product_length,
                    product_width, product_height, is_selling)
values (1, '产品线1', '产品名称1', 742, '件', '电子', 'model-88', 355, 20, 11, 24, 12, 65, 1),
       (2, '产品线2', '产品名称2', 238, '件', '电子', 'model-02', 528, 37, 40, 86, 69, 48, 1),
       (3, '产品线3', '产品名称3', 220, '件', '日用', 'model-84', 059, 19, 77, 42, 53, 40, 1),
       (4, '产品线4', '产品名称4', 634, '件', '日用', 'model-41', 438, 99, 81, 83, 34, 89, 1),
       (5, '产品线5', '产品名称5', 580, '件', '服饰', 'model-77', 904, 96, 20, 99, 66, 65, 1),
       (6, '产品线6', '产品名称6', 220, '件', '服饰', 'model-83', 091, 90, 68, 56, 48, 08, 1),
       (7, '产品线7', '产品名称7', 130, '件', '化妆品', 'model-18', 524, 28, 28, 91, 71, 07, 1),
       (8, '产品线8', '产品名称8', 613, '件', '化妆品', 'model-60', 309, 18, 75, 83, 90, 14, 1),
       (9, '产品线9', '产品名称8', 455, '件', '电子', 'model-65', 182, 01, 10, 01, 59, 94, 1),
       (10, '产品线10', '产品名称10', 998, '件', '电子', 'model-38', 653, 53, 49, 69, 04, 49, 1);


# 插入备货订单表测试数据
insert into stock_order(sto_order_number, sto_invoice_title, sto_retailer_id, sto_out_warehouse_id, sto_in_warehouse_id,
                        sto_period_demand, sto_submit_datetime, sto_remark, sto_product_id, sto_product_qty,
                        sto_invoice_price,
                        sto_total_price, sto_volume, sto_file_path, sto_reason, sto_reviewer_user_name)
values (null, '抬头1', 1, 5, 5, 20201101, null, '', 7, 53, 920, 920, 98, '', '', 'operator1'),
       (null, '抬头2', 2, 7, 3, 20201101, null, '', 1, 67, 778, 778, 36, '', '', 'operator2'),
       (null, '抬头3', 3, 7, 9, 20201101, null, '', 5, 60, 911, 911, 91, '', '', 'operator3'),
       (null, '抬头4', 4, 2, 7, 20201115, null, '', 6, 30, 430, 430, 98, '', '', 'operator4'),
       (null, '抬头5', 5, 3, 9, 20201115, null, '', 3, 14, 358, 358, 36, '', '', 'operator5'),
       (null, '抬头6', 6, 6, 6, 20201115, null, '', 7, 01, 009, 009, 91, '', '', 'operator6'),
       (null, '抬头7', 7, 5, 8, 20201130, null, '', 1, 80, 866, 866, 69, '', '', 'operator7'),
       (null, '抬头8', 8, 4, 3, 20201130, null, '', 1, 17, 200, 200, 49, '', '', 'operator8'),
       (null, '抬头9', 9, 8, 8, 20201130, null, '', 4, 29, 685, 685, 32, '', '', 'operator9'),
       (null, '抬头10', 10, 1, 7, 20201130, null, '', 8, 17, 788, 788, 09, '', '', 'operator10');

# 插入批发订单表测试数据
insert into wholesale_order(wso_order_number, wso_invoice_title, wso_retailer_id, wso_out_warehouse_id,
                            wso_detail_address_id, wso_receiver, wso_phone, wso_pickup_method, wso_remark,
                            wso_product_id, wso_product_qty, wso_invoice_price, wso_total_price, wso_volume,
                            wso_file_path, wso_reason, wso_reviewer_user_name)
values (null, '抬头1', 1, 5, '详细地址1', '收件人1', '18911451401', '汽运', '', 7, 53, 920, 920, 98, '', '', 'operator1'),
       (null, '抬头2', 2, 7, '详细地址2', '收件人2', '18911451402', '汽运', '', 1, 67, 778, 778, 36, '', '', 'operator2'),
       (null, '抬头3', 3, 7, '详细地址3', '收件人3', '18911451403', '汽运', '', 5, 60, 911, 911, 91, '', '', 'operator3'),
       (null, '抬头4', 4, 2, '详细地址4', '收件人4', '18911451404', '汽运', '', 6, 30, 430, 430, 98, '', '', 'operator4'),
       (null, '抬头5', 5, 3, '详细地址5', '收件人5', '18911451405', '汽运', '', 3, 14, 358, 358, 36, '', '', 'operator5'),
       (null, '抬头6', 6, 6, '详细地址6', '收件人6', '18911451406', '汽运', '', 7, 01, 009, 009, 91, '', '', 'operator6'),
       (null, '抬头7', 7, 5, '详细地址7', '收件人7', '18911451407', '汽运', '', 1, 80, 866, 866, 69, '', '', 'operator7'),
       (null, '抬头8', 8, 4, '详细地址8', '收件人8', '18911451408', '汽运', '', 1, 17, 200, 200, 49, '', '', 'operator8'),
       (null, '抬头9', 9, 8, '详细地址9', '收件人9', '18911451409', '汽运', '', 4, 29, 685, 685, 32, '', '', 'operator9'),
       (null, '抬头10', 10, 1, '详细地址10', '收件人10', '18911451410', '汽运', '', 8, 17, 788, 788, 09, '', '', 'operator10');

# 插入零售订单表测试数据
insert into retail_order(rto_transaction_id, rto_retailer_id, rto_source_website, rto_source_store, rto_order_status,
                         rto_shipment_status, rto_order_date, rto_paid_date, rto_shipment_date, rto_order_price,
                         rto_actually_paid, rto_weight, rto_freight, rto_shipping_address, rto_receiver_name,
                         rto_receiver_phone, rto_express_company, rto_express_number)
VALUES ();

# 提交事务
commit;

# 查询测试数据
select *
from operator_login;
select *
from retailer_login;
select *
from retailer;
select *
from operator;
select *
from retailer_address;
select *
from warehouse;
select *
from product;
select *
from stock_order;
select *
from wholesale_order;
select *
from retail_order;
