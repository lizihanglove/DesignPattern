package website.lizihanglove.designpattern.patterns.java.singlrton;

/**
 * @author lizihanglove
 * @email one_mighty@163.com
 * @date 2018-01-02
 * @time 13:14
 * @desc 静态内部类单例
 */

public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
    }

    public static StaticInnerClassSingleton getInstance(){
        return SingletonHolder.instance;
    }

    private static class SingletonHolder{
        private static final StaticInnerClassSingleton instance= new StaticInnerClassSingleton();
    }
}
