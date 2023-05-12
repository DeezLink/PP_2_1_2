import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        System.out.println("Пременные ссылаются на один и тот же объект? - " + (bean1 == bean2));

        ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(AppConfig.class);
        Cat cat1 = (Cat) applicationContext2.getBean("cat");
        Cat cat2 = (Cat) applicationContext2.getBean("cat");
        System.out.println(cat1.getMessage());
        System.out.println(cat2.getMessage());

        System.out.println("Пременные ссылаются на один и тот же объект? - " + (cat1 == cat2));
    }
}