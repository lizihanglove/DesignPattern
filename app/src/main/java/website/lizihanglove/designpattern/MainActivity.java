package website.lizihanglove.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import website.lizihanglove.designpattern.patterns.java.builder.ComputerBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ComputerBuilder.Builder builder = new ComputerBuilder.Builder();
        ComputerBuilder computerBuilder = builder.installDisplayer("显示器")
                .installMainUnit("主机")
                .installMouse("鼠标")
                .installKeybord("键盘")
                .build();
        System.out.println(computerBuilder.toString());
    }
}
