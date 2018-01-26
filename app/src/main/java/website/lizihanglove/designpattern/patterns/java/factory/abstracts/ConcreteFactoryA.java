package website.lizihanglove.designpattern.patterns.java.factory.abstracts;

/**
 * @author lizihanglove
 * @date 2018/1/26
 * @email one_mighty@163.com
 * @desc  具体工厂类A
 */

public class ConcreteFactoryA extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
