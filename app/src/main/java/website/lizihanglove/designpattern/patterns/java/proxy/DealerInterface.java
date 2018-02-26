package website.lizihanglove.designpattern.patterns.java.proxy;

/**
 * @author lizihanglove
 * @date 2018/2/26
 * @email one_mighty@163.com
 * @描述 委托代理接口
 */

public interface DealerInterface {
    /**
     * 查票
     */
    void searchTicket();

    /**
     * 订票
     */
    void bookTicket();

    /**
     * 付钱
     */
    void payTicket();
}
