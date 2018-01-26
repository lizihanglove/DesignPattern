package website.lizihanglove.designpattern.patterns.java.factory.pattern;

/**
 * @author lizihanglove
 * @date 2018/1/15
 * @email one_mighty@163.com
 * @desc 具体产品类A
 */

public class ProductA extends Product {
    @Override
    public void print() {
        System.out.println(this.getClass().getCanonicalName());
    }
}
