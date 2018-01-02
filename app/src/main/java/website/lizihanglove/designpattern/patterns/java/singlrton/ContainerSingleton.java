package website.lizihanglove.designpattern.patterns.java.singlrton;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lizihanglove
 * @email one_mighty@163.com
 * @date 2018-01-02
 * @time 13:22
 * @desc 容器式单例,可忽略
 */

public class ContainerSingleton {
    private static Map<String, Object> objectMap = new HashMap<String, Object>();

    private ContainerSingleton() {
    }

    public static void registerInstance(String key, Object value) {
        if (!objectMap.containsKey(key)) {
            objectMap.put(key, value);
        }
    }

    public static ContainerSingleton getInstance(String key) {
        return (ContainerSingleton) objectMap.get(key);
    }
}
