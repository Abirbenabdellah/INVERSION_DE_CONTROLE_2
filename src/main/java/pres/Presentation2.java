package pres;

import doa.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static  void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));
        String doaclassname=scanner.nextLine();
        Class cdoa=Class.forName(doaclassname);
        IDao dao=(IDao) cdoa.newInstance();

        String metierclassname=scanner.nextLine();
        Class cmetier=Class.forName(metierclassname);
        IMetier metier=(IMetier) cmetier.newInstance();

        Method method=cmetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);
        System.out.println("res="+metier.calcul());
    }
}
