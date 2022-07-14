import entities.*;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("bean-config.xml");

        User user = (User) ctx.getBean("userOne");
        System.out.println(user.toString());
//
//        Declaring a simple been
//        Performer performer = (Performer) ctx.getBean("duke");
//        performer.perform();
//

//        Injecting trough constructor
//        Sonnet29 sonnet29 = (Sonnet29) ctx.getBean("sonnet29");
//        sonnet29.recite();
//
//        Injecting trough constructor using a bean as constructor argument
//        PoeticJuggler poeticJuggler = (PoeticJuggler) ctx.getBean("poeticDuke");
//        poeticJuggler.perform();

//        Creating beans through factory methods
//        Stage theStage = (Stage) ctx.getBean("theStage");

        ctx.close();
    }
}
