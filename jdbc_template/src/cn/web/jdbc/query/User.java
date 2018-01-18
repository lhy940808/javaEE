package cn.web.jdbc.query;
//这是数据库中的user的对象
public class User {
    private String userName;
    private String passWord;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setPassWord (String passWord) {
        this.passWord = passWord;
    }

    public String getPassWord() {
        return this.passWord;
    }

    @Override
    public String toString() {
        return this.userName + " " + this.passWord;
    }
}
