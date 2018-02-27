package website.lizihanglove.designpattern.patterns.java.strategy;

/**
 * @author lizihanglove
 * @date 2018/2/27
 * @email one_mighty@163.com
 * @描述
 */

public class Customer {
    StrategyInterface strategyInterface;

    /**
     * 选择支付策略
     *
     * @param strategyInterface 用户选择的支付策略
     */
    public void selectPaymentMode(StrategyInterface strategyInterface) {
        this.strategyInterface = strategyInterface;
    }

    /**
     * 用户支付订单
     */
    public void pay() {
        strategyInterface.pay();
    }
}
