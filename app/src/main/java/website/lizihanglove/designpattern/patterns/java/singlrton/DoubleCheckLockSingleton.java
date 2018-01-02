package website.lizihanglove.designpattern.patterns.java.singlrton;

/**
 * @author lizihanglove
 * @email one_mighty@163.com
 * @date 2018-01-02
 * @time 13:10
 * @desc 双重校验锁单例
 */

public class DoubleCheckLockSingleton {
    private static DoubleCheckLockSingleton instance;

    private DoubleCheckLockSingleton() {
    }

    public static DoubleCheckLockSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }
        return instance;
    }
}
