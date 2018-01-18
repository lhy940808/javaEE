package cn.web.jdbc.query;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


//这里面ishijdbcTemplate的查询的几种情况的实现
public class QueryDemo {

//    测试一：查询数据库中有多少条记录
    @Test
    public void testCount() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.gjt.mm.mysql.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring?useUnicode=true&characterEncoding=UTF-8");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        String sql = " select count(*) from user";

        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println("couonts " + count);
    }

//    测试二：返回单个对象的情况
    @Test
    public void testSingalObeject() {
        //设置数据库信息
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.gjt.mm.mysql.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring?useUnicode=true&characterEncoding=UTF-8");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

//        设置数据库源
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

//        写sql语句
        String sql = "select * from user where user_name= ?";

//        调用jdbc中的方法实现
//        参数解释：sql为sql语句，第二个为一个RowMapper接口的一个实现类，第三个为sql中的参数
        User user = jdbcTemplate.queryForObject(sql, new MyRowMapper(), "root");
        System.out.println(user);
    }

//    测试三：返回多个对象
    @Test
    public void testManyObject() {
//        设置数据库信息
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring?useUnicode=true&characterEncoding=UTF-8");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

//        设置数据库源
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        String sql = "select * from user";
        List<User> list = jdbcTemplate.query(sql, new MyRowMapper());

        System.out.println(list);
    }
}


class MyRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int num) throws SQLException {
//        1 从结果中得到数据，跟jdbc原始方法很像
        String name = resultSet.getString("user_name");
        String pwd = resultSet.getString("pass_word");

//        2 把结果封装成对象
        User user = new User();
        user.setUserName(name);
        user.setPassWord(pwd);
        System.out.println("num" + num);
        return user;
    }
}