package tests.f09_Actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase;

public class F08_KullaniciOlusturma extends TestBase {


    @Test
    public void kullaniciOlusturma() {
        JavascriptExecutor js=(JavascriptExecutor) driver;

        //1- https://www.testotomasyonu.com adresine gidelim
        driver.get("https://www.testotomasyonu.com");
        //2- Account linkine tiklayin
        driver.findElement(By.xpath("(//span[text()='Account'])[1]")).click();
        //ReusableMethods.bekle(2);
        //3- Sign Up linkine basalim
        //js.executeScript("arguments[0].scrollIntoView(true);",firstNmae);

        WebElement deneme = driver.findElement(By.xpath("//*[text()=' Sign Up']"));
        js.executeScript("arguments[0].click();", deneme);
        //4- Ad, soyad, mail ve sifre kutularina deger yazalim ve Sign Up butonuna basalim

        WebElement fistNameKutusu = driver.findElement(By.xpath("//*[@id='firstName']"));

        Actions actions = new Actions(driver);
       ReusableMethods.bekle(1);
        actions.click(fistNameKutusu)
                .sendKeys("Ali")
                .sendKeys(Keys.TAB)
                .sendKeys("Gel")
                .sendKeys(Keys.TAB)
                .sendKeys("ali@gel.com")
                .sendKeys(Keys.TAB)
                .sendKeys("12345")
                .sendKeys(Keys.TAB)
                .sendKeys("12345")
                .perform();
        js.executeScript("arguments[0].scrollIntoView(true);",fistNameKutusu);
        ReusableMethods.bekle(1);
        driver.findElement(By.id("btn-submit-form")).click();

        //5- Kaydin olusturuldugunu test edin
        //   Kayit olusturulunca bizi signIn sayfasina yonlendiriyor
        //   Kaydin olusturuldugunu test etmek icin
        //   girdigimiz bilgilerle login olabildigimizi test edelim

        WebElement emailKutusu= driver.findElement(By.id("email"));
        WebElement passwordKutusu = driver.findElement(By.id("password"));
        WebElement signInButonu = driver.findElement(By.id("submitlogin"));

        emailKutusu.sendKeys("ali@gel.com");
        passwordKutusu.sendKeys("12345");
        signInButonu.click();

        WebElement logoutLinki = driver.findElement(By.xpath("//span[text()='Logout']"));

        Assert.assertTrue(logoutLinki.isDisplayed());

        //ReusableMethods.bekle(2);
        js.executeScript("arguments[0].click();", logoutLinki);

        ReusableMethods.bekle(2);
    }
}