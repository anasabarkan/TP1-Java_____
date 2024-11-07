package Person;

import Dao.IdaoImpl;
import metier.Metier;

public class pers1 {
    public static void main(String[] args) {
        IdaoImpl dao=new IdaoImpl();

        Metier metier=new Metier();
        metier.setIdo(dao);
        System.out.println("res= "+metier.calcul());

    }
}

