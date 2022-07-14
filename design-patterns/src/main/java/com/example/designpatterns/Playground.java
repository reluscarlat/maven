package com.example.designpatterns;

import com.example.designpatterns.behavioral.mediator.Group;
import com.example.designpatterns.behavioral.strategy.BikeRouteStrategy;
import com.example.designpatterns.behavioral.strategy.CarRouteStrategy;
import com.example.designpatterns.behavioral.strategy.Navigator;
import com.example.designpatterns.behavioral.strategy.WalkRouteStrategy;
import com.example.designpatterns.behavioral.template_method.ConcreteHouse;
import com.example.designpatterns.behavioral.template_method.HouseTemplate;
import com.example.designpatterns.behavioral.template_method.WoodHouse;
import com.example.designpatterns.cleancode.datatype.DataTypeContext;
import com.example.designpatterns.creational.builder.User;
import com.example.designpatterns.creational.factory.Animal;
import com.example.designpatterns.creational.factory.AnimalFactory;
import com.example.designpatterns.creational.prototype.HumanCell;
import com.example.designpatterns.structural.adapter.EbayUser;
import com.example.designpatterns.structural.adapter.ExternalUser;
import com.example.designpatterns.structural.adapter.ExternalUserToEbayUserAdapter;
import com.example.designpatterns.structural.bridge.DocumentReaderImpl;
import com.example.designpatterns.structural.bridge.WordParser;
import com.example.designpatterns.structural.decorator.BasicCar;
import com.example.designpatterns.structural.decorator.Car;
import com.example.designpatterns.structural.decorator.LuxuryCar;
import com.example.designpatterns.structural.decorator.SportCar;
import com.example.designpatterns.structural.facade.DocumentReader;
import com.example.designpatterns.structural.proxy.CommandExecutor;
import com.example.designpatterns.structural.proxy.CommandExecutorProxy;

public class Playground {

    public static void play() {
        System.out.println("Start!");
//        Creational Patterns:
//        builderPattern();
//        factoryPattern();
//        prototypePattern();

//        Structural
//        adapterPattern();
//        proxyPattern();
//        facadePattern();
//        bridgePattern();
//        decoratorPattern();

//        Behavioral
//        templateMethodPattern();
//        mediatorPattern();
//        strategyPattern();

//        Clean Code
//        dataTypePattern();

        System.out.println("Stop!");
    }

    private static void dataTypePattern() {
        DataTypeContext dataTypeContext = new DataTypeContext();
        dataTypeContext.prepareCar();
    }

    private static void strategyPattern() {
        String coodrinatesOfA = "Cluj";
        String coodrinatesOfB = "Bucharest";

        CarRouteStrategy carRouteStrategy = new CarRouteStrategy();
        BikeRouteStrategy bikeRouteStrategy = new BikeRouteStrategy();
        WalkRouteStrategy walkRouteStrategy = new WalkRouteStrategy();

        Navigator navigator = new Navigator();
        navigator.setRoute(coodrinatesOfA,coodrinatesOfB);

        navigator.setRouteStrategy(carRouteStrategy);
        navigator.buildRout();
        navigator.setRouteStrategy(bikeRouteStrategy);
        navigator.buildRout();
        navigator.setRouteStrategy(walkRouteStrategy);
        navigator.buildRout();

    }

    private static void mediatorPattern() {
        Group group = new Group();
        com.example.designpatterns.behavioral.mediator.User user1 = new com.example.designpatterns.behavioral.mediator.User("John", group);
        group.addUser(user1);
        com.example.designpatterns.behavioral.mediator.User user2 = new com.example.designpatterns.behavioral.mediator.User("Anne", group);
        group.addUser(user2);

        user1.saySomething("Hello, Anne!");
        user2.saySomething("Hello, John!");
    }

    private static void templateMethodPattern() {
        HouseTemplate concreteHouse = new ConcreteHouse();
        HouseTemplate woodHouse = new WoodHouse();

        concreteHouse.buildHouse();
        System.out.println();
        woodHouse.buildHouse();
    }


    public static void builderPattern() {
        User user = new User.UserBuilder().withFirstName("John").withLastName("Doe").build();
        System.out.println(user.toString());
    }

    public static void factoryPattern() {
        Animal dog = AnimalFactory.createAnimal("dog", "Rex");
        System.out.println(dog.toString());

        Animal cat = AnimalFactory.createAnimal("cat", "Zizi");
        System.out.println(cat.toString());
    }

    public static void prototypePattern() {
        HumanCell cellOne = new HumanCell("1sqs24sdw");
        HumanCell cellTwo = null;
        try {
            cellTwo = (HumanCell) cellOne.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(cellOne != cellTwo);
    }

    public static void adapterPattern() {
        ExternalUser externalUser = new ExternalUser("john");

        EbayUser ebayUser = new ExternalUserToEbayUserAdapter(externalUser).getEbayUser();
    }

    public static void proxyPattern() {
        CommandExecutor executorProxy = new CommandExecutorProxy("john", "my-secret");
        executorProxy.execute("ls -l");
    }

    public static void facadePattern() {
        DocumentReader reader = new DocumentReader();

        String wordText = reader.read("resume.docx");
        String text = reader.read("resume.txt");
    }


    private static void bridgePattern() {
        com.example.designpatterns.structural.bridge.DocumentReader reader = new DocumentReaderImpl(new WordParser("document.docx"));
        String text = reader.getText();
    }

    public static void decoratorPattern() {
        Car mustang = new SportCar(new BasicCar());
        mustang.assemble();

        System.out.println();

        Car laFerrari = new SportCar(new LuxuryCar(new BasicCar()));
        laFerrari.assemble();
    }
}
