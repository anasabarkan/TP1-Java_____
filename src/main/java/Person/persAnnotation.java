package Person;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class persAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("Dao","metier");
        IMetier metier=context.getBean(IMetier.class);
        System.out.println("res => "+metier.calcul());
    }
}
