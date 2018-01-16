package cn.web.anno;

import org.springframework.stereotype.Service;

@Service(value="book")
public class Book {
    public void test() {
        System.out.println("book----------");
    }
}
