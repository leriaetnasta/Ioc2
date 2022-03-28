package Metier;

import Doa.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImp implements  IMetier{
    @Autowired // injection
    @Qualifier("dao2")
    private IDao dao; //depender les interfaces est non pas les classes
    // injection avec constructeur
    //  constructeur qui reçoit un objet de type IDao
    // CONSTRUCTEUR MIEUX QUE AUTOWIRED
   // public MetierImp(IDao dao){
   //     this.dao=dao;
   // }
    @Override
    public double calcul() {
        double temperature= dao.getData();
        double res=temperature*Math.cos(temperature*Math.PI)*5400;
        return res;
    }
    public void setDao(IDao dao){
        this.dao=dao;
    }

}
