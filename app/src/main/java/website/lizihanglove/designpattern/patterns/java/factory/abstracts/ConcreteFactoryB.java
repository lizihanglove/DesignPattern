package website.lizihanglove.designpattern.patterns.java.factory.abstracts;

/**
 * @author lizihanglove
 * @date 2018/1/26
 * @email one_mighty@163.com
 * @desc 具体工厂类B
 */

public class ConcreteFactoryB extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
