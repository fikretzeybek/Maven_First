package tests.Practice;

import org.junit.Test;

public class f01 {
    /*
     @BeforeClass---> Tüm Method'dan önce 1 kere çalışır
     @AfterClass---> Tüm Method'dan sonra 1 kere çalışır
     @Before---> Her Method'dan önce  1 kere çalışır
     @After---> Her Method'dan sonra  1 kere çalışır
     @Test---> Methodlarımızı çalıştırır

  */
    @Test
    public void ayca01(){
        System.out.println("ayça");
    }


    @Test
    public void nevfel05(){
        System.out.println("nevfel");
    }


    @Test
    public void zeybek(){
        System.out.println("zeybek");
    }

    @Test
    public void samet(){
        System.out.println("samet");
    }

    @Test
    public void zehra(){
        System.out.println("zehra");
    }
}