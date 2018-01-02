package website.lizihanglove.designpattern.patterns.java.singlrton;

/**
 * @author lizihanglove
 * @email one_mighty@163.com
 * @date 2018-01-02
 * @time 13:06
 * @desc 懒汉式单例
 */

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    private static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
