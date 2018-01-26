package website.lizihanglove.designpattern.patterns.java.factory.pattern;


/**
 * @author lizihanglove
 * @date 2018/1/15
 * @email one_mighty@163.com
 * @desc 具体工厂方法类
 */

public class ConcreteFactory extends Factory {
    @Override
    public <T extends Product> T createProduct(Class<T> product) {
        T newInstance = null;
        try {
            newInstance = product.newInstance();
            return newInstance;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
