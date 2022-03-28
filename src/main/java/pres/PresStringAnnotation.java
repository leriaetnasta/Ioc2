package pres;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresStringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext("Doa", "Metier", "ext");
        IMetier metier= context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
