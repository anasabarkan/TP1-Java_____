package Person;
import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class persXML {
    public static void main(String[] args) {
        ApplicationContext sprcontext=new ClassPathXmlApplicationContext("config.xml");
        IMetier metier=sprcontext.getBean(IMetier.class);
        System.out.println("res"+metier.calcul());
    }
}
