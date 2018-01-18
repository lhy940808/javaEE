package cn.web.jdbc;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//这里是关于jdbcTemplate的基础操作
public class BaseDemo {

//    测试添加操作
    @Test
    public void testAdd() {
        // 1 创建对象 设置数据库信息
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.gjt.mm.mysql.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring?useUnicode=true&characterEncoding=UTF-8");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        // 2 创建jdbcTemplate对象，设置数据库源
        JdbcTemplate jdbcTemplate  = new JdbcTemplate(dataSource);

        // 3 调用jdbcTemplate里面的方法实现操作

//        首先，创建出添加操作的sql语句
        String sql = "insert into user  values(?, ?)";
        jdbcTemplate.update(sql, "huge", "huge");
    }


//    测试更改操作
    @Test
    public void testUpdate() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.gjt.mm.mysql.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring?useUnicode=true&characterEncoding=UTF-8");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        String sql = "update user set pass_word = ? where user_name = ?";

        int rows = jdbcTemplate.update(sql, "920", "huge");
        System.out.println("update rows " + rows);
    }
//    测试删除操作
    @Test
    public void testDelete() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.gjt.mm.mysql.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring?useUnicode=true&characterEncoding=UTF-8");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        String sql = "DELETE FROM user  where user_name = ?";

        int rows = jdbcTemplate.update(sql, "huge");
        System.out.println("update rows " + rows);
    }
}
