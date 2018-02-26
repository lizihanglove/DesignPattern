package website.lizihanglove.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import website.lizihanglove.designpattern.patterns.java.builder.ComputerBuilder;
import website.lizihanglove.designpattern.patterns.java.factory.abstracts.AbstractProductA;
import website.lizihanglove.designpattern.patterns.java.factory.abstracts.AbstractProductB;
import website.lizihanglove.designpattern.patterns.java.factory.abstracts.ConcreteFactoryA;
import website.lizihanglove.designpattern.patterns.java.factory.abstracts.ConcreteFactoryB;
import website.lizihanglove.designpattern.patterns.java.factory.pattern.ConcreteFactory;
import website.lizihanglove.designpattern.patterns.java.factory.pattern.ProductA;
import website.lizihanglove.designpattern.patterns.java.factory.pattern.ProductB;
import website.lizihanglove.designpattern.patterns.java.prototype.UrlPrototype;
import website.lizihanglove.designpattern.patterns.java.proxy.DealerInterface;
import website.lizihanglove.designpattern.patterns.java.proxy.RealDelegate;
import website.lizihanglove.designpattern.patterns.java.proxy.TicketProxy;
import website.lizihanglove.designpattern.patterns.kotlin.singleton.Singleton;

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

        System.out.println("--------------------------------------");

        UrlPrototype original = new UrlPrototype();
        original.setHost("www.lizihanglove.website");
        original.setPort("8080");
        original.setProtocol("https");
        original.printUrl();
        System.out.println("--------------------------------------");
        UrlPrototype reborn = original.clone();
        reborn.printUrl();
        System.out.println("--------------------------------------");
        reborn.setPort("80");
        reborn.setProtocol("http");
        original.printUrl();
        reborn.printUrl();
        System.out.println("--------------------------------------");

        //工厂方法
        ConcreteFactory factory = new ConcreteFactory();
        ProductA productA = factory.createProduct(ProductA.class);
        productA.print();
        ProductB productB = factory.createProduct(ProductB.class);
        productB.print();

        //抽象工厂方法
        ConcreteFactoryA concreteFactoryA = new ConcreteFactoryA();
        AbstractProductA abstractProductA1 = concreteFactoryA.createProductA();
        AbstractProductB abstractProductB1 = concreteFactoryA.createProductB();
        abstractProductA1.method();
        abstractProductB1.method();

        ConcreteFactoryB concreteFactoryB = new ConcreteFactoryB();
        AbstractProductA abstractProductA2 = concreteFactoryB.createProductA();
        AbstractProductB abstractProductB2 = concreteFactoryB.createProductB();
        abstractProductA2.method();
        abstractProductB2.method();

        //代理模式
        DealerInterface dealerInterface = new RealDelegate();
        TicketProxy proxy = new TicketProxy(dealerInterface);
        proxy.searchTicket();
        proxy.bookTicket();
        proxy.payTicket();

        //Kotlin单例
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        Singleton instance3 = Singleton.INSTANCE;
        instance1.print();
        instance2.print();
        instance3.print();
    }
}
