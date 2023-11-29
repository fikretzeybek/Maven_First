package tests.f10_Actions_faker_file;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class F06_BilgisayardakiDosyayiTestEtme {

    @Test
    public void test01(){

        // Downloads'da logo.png oldugunu test edin
        String dosyaYolu = "C:\\Users\\Z€YB\\Downloads\\logo.png";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

        // Herkeste farkli olan ==> user.home
        //          /Users/Z€YB
        // Herkeste ayni olan
        //          /Downloads/logo.png
        String dinamikDosyaYolu = System.getProperty("user.home") +
                                  "\\Downloads\\logo.png";

    }
}
