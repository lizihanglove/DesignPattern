package website.lizihanglove.designpattern.patterns.java.builder;

/**
 * @author lizihanglove
 * @date 2018/1/8
 * @email one_mighty@163.com
 * @desc 构建者模式
 */

public class ComputerBuilder {
    private String display;
    private String mainUnit;
    private String mouse;
    private String keyboard;

    private ComputerBuilder() {
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getMainUnit() {
        return mainUnit;
    }

    public void setMainUnit(String mainUnit) {
        this.mainUnit = mainUnit;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "ComputerBuilder{" +
                "display='" + display + '\'' +
                ", mainUnit='" + mainUnit + '\'' +
                ", mouse='" + mouse + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }

    public static class Builder{
        private ComputerBuilder target =new ComputerBuilder();

        public Builder installDisplayer(String display){
            target.setDisplay(display);
            return this;
        }

        public Builder installMainUnit(String mainUnit){
            target.setMainUnit(mainUnit);
            return this;
        }

        public Builder installMouse(String mouse){
            target.setMouse(mouse);
            return this;
        }

        public Builder installKeybord(String keyboard){
            target.setKeyboard(keyboard);
            return this;
        }

        public ComputerBuilder build(){
            return target;
        }
    }
}
