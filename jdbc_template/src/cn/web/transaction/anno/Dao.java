package cn.web.transaction.anno;

import org.springframework.jdbc.core.JdbcTemplate;

//实现A向B转钱的操作
public class Dao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

//    这层主要是跟数据库进行交互

//    A少钱的操作
    public void lessMoney() {
        String sql = "update account set money = money - ? where name = ?";
        this.jdbcTemplate.update(sql, 100,  "A");
    }

//    B多钱的操作
    public void moreMoney() {
        String sql = "update account set money = money + ? where name = ?";
        this.jdbcTemplate.update(sql, 100, "B");
    }
}

