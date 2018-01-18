package cn.web.c3p0;

import org.springframework.jdbc.core.JdbcTemplate;

//这里演示c3p0的作用，service中引用dao
public class Dao {
//    在这里进行数据库crud演示


//    1 首先得到数据源，这里通过配置文件实现

//    2 创建jdbcTemplate对象，也是通过配置文件生成

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jt) {
        this.jdbcTemplate = jt;
    }

//    进行添加操作
    public void add() {
        String sql = "insert into user values(?, ?)";

//        调用jdbctemplate的方法
        int rows = this.jdbcTemplate.update(sql, "test", "c3p0");
        System.out.println("rows  " + rows);
    }
}
