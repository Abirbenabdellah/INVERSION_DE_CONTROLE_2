package doa;

import org.springframework.stereotype.Component;

@Component("dao")
public class DoaImp implements IDao{
    @Override
    public double getdata() {
        System.out.println("version base de donnee");
        double t=Math.random()*40;
        return  t;
    }
}
