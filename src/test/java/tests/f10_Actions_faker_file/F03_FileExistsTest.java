package tests.f10_Actions_faker_file;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class F03_FileExistsTest extends TestBase {

    @Test
    public void test() {
        //2. https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");
        //3. logo.png dosyasını indirelim
        driver.findElement(By.xpath("//a[text()='spectrum-logo.png']"))
                .click();
        ReusableMethods.bekle(5);
        //4. Dosyanın başarıyla indirilip indirilmediğini test edelim

        String dosyaYolu = "C:\\Users\\Z€YB\\Downloads\\spectrum-logo.png";

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

        /*
        C:\Users\breyh\         Downloads\logo.png
        C:\\Users\\ADMİN\\      Downloads\\logo.png
        C:\\Users\\HUAWEI\\     Downloads\\logo.png
        /Users/ahmetbulutluoz/  Downloads/logo.png

         */

    }

}

