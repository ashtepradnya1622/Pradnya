package Testng1;

import org.testng.annotations.Test;

import java.security.acl.Group;

public class day2 {
    @Test(groups = {"Smoke"})
    public  void loan(){
        System.out.println("carloan is heavy");
    }
    @Test
    public void loan2(){
        System.out.println("bikeloan is medium");

    }
    @Test
    public void loan3()
    {
        System.out.println("cycale loan is easy");
    }
    @Test
    public  void set()
    {
        System.out.println("Trainhg ");
    }
}


