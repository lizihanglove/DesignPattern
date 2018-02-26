package website.lizihanglove.designpattern.patterns.java.proxy;

/**
 * @author lizihanglove
 * @date 2018/2/26
 * @email one_mighty@163.com
 * @描述 实际委托方
 */

public class RealDelegate implements DealerInterface {
    @Override
    public void searchTicket() {
        System.out.println("买家点击查询按钮;");
    }

    @Override
    public void bookTicket() {
        System.out.println("买家点击订票按钮;");
    }

    @Override
    public void payTicket() {
        System.out.println("买家付款");
    }
}
