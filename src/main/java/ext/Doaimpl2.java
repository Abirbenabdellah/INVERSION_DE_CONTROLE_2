package ext;

import doa.IDao;


public class Doaimpl2 implements IDao {

    @Override
    public double getdata() {
        System.out.println("version capteurs");
        double tmp=1000;
        return tmp;
    }
}
