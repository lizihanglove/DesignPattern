package website.lizihanglove.designpattern.patterns.java.state;

/**
 * @author lizihanglove
 * @date 2018/3/5
 * @email one_mighty@163.com
 * @desc 休眠模式
 */

public class DormantState implements State {
    Controller mController;

    public DormantState(Controller mController) {
        this.mController = mController;
    }

    @Override
    public void handle() {
        System.out.println(mController.getClass().getCanonicalName()+":在休眠状态");
    }

}
