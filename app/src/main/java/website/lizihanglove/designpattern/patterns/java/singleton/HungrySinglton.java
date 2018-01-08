package website.lizihanglove.designpattern.patterns.java.singleton;

/**
 * @author lizihanglove
 * @email one_mighty@163.com
 * @date 2018-01-02
 * @time 13:02
 * @desc 恶汉式单例模式
 */

public class HungrySinglton {
    private static HungrySinglton instance = new HungrySinglton();
    private HungrySinglton() {
    }

    public static HungrySinglton getInstance(){
        return instance;
    }
}
