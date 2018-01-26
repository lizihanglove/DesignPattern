package website.lizihanglove.designpattern.patterns.java.factory.pattern;


/**
 * @author lizihanglove
 * @date 2018/1/15
 * @email one_mighty@163.com
 * @desc 工厂方法设计模式
 */

public abstract class Factory {

    public abstract <T extends Product> T createProduct(Class<T> product);
}
