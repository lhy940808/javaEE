package cn.web.jdbc;

import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//这里是关于jdbcTemplate的基础操作
public class BaseDemo {

//    测试添加操作
    @Test
    public void testAdd() {
        // 1 创建对象 设置数据库信息
        DriverManagerDataSource dataRource = new DriverManagerDataSource();
        dataRource.setDriverClassName("org.gjt.mm.mysql.Driver");
        dataRource.setUrl("");

        // 2 创建jdbcTemplate对象，设置数据库源

        // 3 调用jdbcTemplate里面的方法实现操作
    }
}
