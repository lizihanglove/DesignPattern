package website.lizihanglove.designpattern.patterns.java.state;

/**
 * @author lizihanglove
 * @date 2018/3/5
 * @email one_mighty@163.com
 * @描述 关机状态
 */

public class PowerOffState implements State {
    Controller mController;
    public PowerOffState(Controller controller) {
        mController = controller;
    }

    @Override
    public void handle() {
        System.out.println(mController.getClass().getCanonicalName()+":在关闭状态");
    }
}
