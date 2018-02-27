package website.lizihanglove.designpattern.patterns.java.strategy;

/**
 * @author lizihanglove
 * @date 2018/2/27
 * @email one_mighty@163.com
 * @描述 微信支付策略
 */

public class WeChatStrategy implements StrategyInterface {
    @Override
    public void pay() {
        System.out.println("微信支付啦！");
    }
}
