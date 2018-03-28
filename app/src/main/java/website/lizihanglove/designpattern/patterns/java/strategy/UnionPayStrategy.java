package website.lizihanglove.designpattern.patterns.java.strategy;

/**
 * @author lizihanglove
 * @date 2018/2/27
 * @email one_mighty@163.com
 * @desc 银联支付策略
 */

public class UnionPayStrategy implements StrategyInterface {
    @Override
    public void pay() {
        System.out.println("银联支付啦！");
    }
}
