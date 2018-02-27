package website.lizihanglove.designpattern.patterns.java.strategy;

/**
 * @author lizihanglove
 * @date 2018/2/27
 * @email one_mighty@163.com
 * @描述 支付宝支付策略
 */

public class AlipayStrategy implements StrategyInterface {
    @Override
    public void pay() {
        System.out.println("支付宝支付啦！");
    }
}
