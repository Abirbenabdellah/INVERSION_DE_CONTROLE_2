package pres;

import doa.DoaImp;
import doa.IDao;
import metier.MetierImpl;

public class Presentation {
     public static void main(String[] args) {
         //couplage fort
         DoaImp d=new DoaImp();
         MetierImpl i=new MetierImpl(d);
         i.setDao(d);
         System.out.println("res ="+i.calcul());
    }
}
