package website.lizihanglove.designpattern.patterns.java.proxy;

/**
 * @author lizihanglove
 * @date 2018/2/26
 * @email one_mighty@163.com
 * @desc 代理模式-代理类
 */

public class TicketProxy implements DealerInterface {
    DealerInterface dealer;

    public TicketProxy(DealerInterface dealer) {
        this.dealer = dealer;
    }

    @Override
    public void searchTicket() {
        dealer.searchTicket();
        System.out.println("第三方公司查询并显示票类及票数；");
    }

    @Override
    public void bookTicket() {
        dealer.bookTicket();
        System.out.println("第三方公司生成订单；");
    }

    @Override
    public void payTicket() {
        dealer.payTicket();
        System.out.println("第三方公司显示订票成功");
    }
}
