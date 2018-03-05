package website.lizihanglove.designpattern.patterns.java.state;

/**
 * @author lizihanglove
 * @date 2018/3/5
 * @email one_mighty@163.com
 * @描述 开启状态
 */

public class PowerOnState implements State {
    Controller mController;

    public PowerOnState(Controller mController) {
        this.mController = mController;
    }

    @Override
    public void handle() {
        System.out.println(mController.getClass().getCanonicalName()+":在开启状态");
    }
}
