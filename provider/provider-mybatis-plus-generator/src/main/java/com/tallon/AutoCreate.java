package com.tallon;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 自动生成代码工具
 *
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-28 00:12
 */
public class AutoCreate {
    public static void main(String[] args) {

        /*
        cms
        "cms_help,cms_help_category,cms_member_report," +
                "cms_prefrence_area,cms_prefrence_area_product_relation," +
                "cms_subject,cms_subject_category,cms_subject_comment," +
                "cms_subject_product_relation,cms_topic,cms_topic_category," +
                "cms_topic_comment";
         */

        /*
        ums
        "ums_admin,ums_admin_login_log,ums_admin_permission_relation," +
                "ums_admin_role_relation,ums_growth_change_history," +
                "ums_integration_change_history,ums_integration_consume_setting," +
                "ums_member,ums_member_level,ums_member_login_log,ums_member_member_tag_relation," +
                "ums_member_product_category_relation,ums_member_receive-address," +
                "ums_member_rule_setting,ums_member_statistics_info,ums_member_tag," +
                "ums_member_task,ums_permission,ums_role,ums_role_permission_relation";
         */

        // 表名
        String tables = "ums_admin,ums_admin_login_log,ums_admin_permission_relation," +
                "ums_admin_role_relation,ums_growth_change_history," +
                "ums_integration_change_history,ums_integration_consume_setting," +
                "ums_member,ums_member_level,ums_member_login_log,ums_member_member_tag_relation," +
                "ums_member_product_category_relation,ums_member_receive-address," +
                "ums_member_rule_setting,ums_member_statistics_info,ums_member_tag," +
                "ums_member_task,ums_permission,ums_role,ums_role_permission_relation";

        //1.全局配置
        GlobalConfig config = new GlobalConfig();
        config.setActiveRecord(true)//AR模型
                .setAuthor("Tallon")//作者
                .setOutputDir("provider/provider-mybatis-plus-generator/src/main/java")//生成路径
                .setFileOverride(true)//覆盖
                .setIdType(IdType.AUTO)//主键自增策略
                .setServiceName("%sService")
                .setBaseResultMap(true)//xml
                .setBaseColumnList(true);//xml

        //2.数据源配置
        DataSourceConfig ds = new DataSourceConfig();
        ds.setDbType(DbType.MYSQL)
                //com.mysql.cj.jdbc.Driver
                //com.mysql.jdbc.Driver
                .setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://127.0.0.1:3307/framework")
                .setUsername("root")
                .setPassword("123456");

        //3.策略配置
        StrategyConfig sc = new StrategyConfig();
        sc.setCapitalMode(true)//全局大写命名
                .setNaming(NamingStrategy.underline_to_camel)//驼峰
                .setEntityLombokModel(true)
                //.setTablePrefix("ums_") //前缀
                .setInclude(tables.split(","));

        //4.包名策略配置
        PackageConfig pk = new PackageConfig();
        pk.setParent("com.ums")
                .setMapper("mapper")
                .setService("service")
                .setController("controller")
                .setEntity("domain")
                .setXml("dao");

        //5.整合配置
        AutoGenerator ag = new AutoGenerator();
        ag.setGlobalConfig(config)
                .setDataSource(ds)
                .setStrategy(sc)
                .setPackageInfo(pk);

        //6.执行
        ag.execute();
    }
}
