package Property;

import java.util.List;
import java.util.Map;
import java.util.Properties;

//这里显示复杂类型属性的注入，如数组、map、list等
public class ComplexObeject {
    private String[] arr;
    private List<String> list;
    private Map<String, String> map;
    private Properties property;

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperty(Properties pro) {
        this.property = pro;
    }
    public void test () {
        System.out.println("arr:=" + arr);
        System.out.println("list:=" + list);
        System.out.println("map:=" + map);
        System.out.println("preperties:=" + property);
    }
}
