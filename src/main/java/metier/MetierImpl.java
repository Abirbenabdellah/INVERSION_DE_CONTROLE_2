package metier;

import doa.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    //@Autowired
    private IDao d;
    public MetierImpl(IDao d) {
        this.d = d;
    }
    @Override
    public double calcul() {
        double t=d.getdata()*23;
        double res=t*22/Math.cos(t*Math.PI);
        return res;
    }
    public void setDao(IDao d) {
        this.d = d;
    }
}
