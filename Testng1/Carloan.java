package Testng1;

import org.testng.annotations.*;

public class Carloan {
    @Test
    public  void loan(){
        System.out.println("carloan is heavy");
    }
    @AfterSuite
    public void loan2(){
        System.out.println("bikeloan is medium");

    }
    @BeforeMethod
    public void loan5()
    {
        System.out.println("bicycle is small");
    }
    @Test
    public void loan3() {
        System.out.println("cycale loan is easy");
    }
    @BeforeSuite
    public void loan4()
    {
        System.out.println("i am the first");
    }
}

