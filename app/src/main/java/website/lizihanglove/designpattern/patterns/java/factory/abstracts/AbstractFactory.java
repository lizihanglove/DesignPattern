package website.lizihanglove.designpattern.patterns.java.factory.abstracts;

/**
 * @author lizihanglove
 * @date 2018/1/26
 * @email one_mighty@163.com
 * @desc 抽象工厂类
 */

public abstract class AbstractFactory {
    /**
     * 生产A产品的方法
     */
    public abstract AbstractProductA createProductA();

    /**
     * 生产B产品的方法
     */
    public abstract AbstractProductB createProductB();
}
