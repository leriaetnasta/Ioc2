package Metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
    private calcul c;
    @Test
    public void TestSomme(){
        c= new calcul();
        double a=2;
        double b= 3;
        double expected= 5;
        double res= c.somme(a,b);
        Assert.assertTrue(res==expected);

    }
}
