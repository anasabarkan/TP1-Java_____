package Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IdaoImpl implements IDao{
    public double getDATA() {
        System.out.println("version base de donéess");
        double data=25;
        return data;
    }
}
