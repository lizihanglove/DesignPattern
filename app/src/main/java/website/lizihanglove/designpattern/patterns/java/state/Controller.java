package website.lizihanglove.designpattern.patterns.java.state;

/**
 * @author lizihanglove
 * @date 2018/3/5
 * @email one_mighty@163.com
 * @描述
 */

public class Controller {
    State mState;

    public Controller() {
        this.mState = new PowerOffState(this);
    }

    /**
     * 切换状态
     */
    public void turnState() {
        if (this.mState instanceof PowerOffState) {
            this.mState = new PowerOnState(this);
        } else if (this.mState instanceof PowerOnState) {
            this.mState = new DormantState(this);
        } else {
            this.mState = new PowerOffState(this);
        }
    }

    public void handle() {
        mState.handle();
    }

}
