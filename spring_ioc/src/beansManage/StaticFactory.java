package beansManage;

import entity.UserService;

// 这是方法二 静态工厂
public class StaticFactory {
    public static UserService  getUser() {
        return new UserService();
    }
}
