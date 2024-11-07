package ext;

import Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DaoImpl2 implements IDao {
    @Override
    public double getDATA() {
        System.out.println("version web service ");
        double data=55;
        return data;
    }
}
