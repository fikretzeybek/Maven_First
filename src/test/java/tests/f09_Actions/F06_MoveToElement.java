package tests.f09_Actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase;

public class F06_MoveToElement extends TestBase {

    @Test
    public void mutaElement(){
        //1- https://www.testotomasyonu.com/ adresine gidin
        driver.get("https://www.testotomasyonu.com/");
        ReusableMethods.bekle(2);
        //2- “Kids Wear” menusunun acilmasi icin mouse’u bu menunun ustune getirin
        WebElement kidsWearElementi = driver.findElement(By.xpath("(//*[@class='has-sub'])[7]"));
        Actions actions = new Actions(driver);

        actions.moveToElement(kidsWearElementi).perform();

        ReusableMethods.bekle(2);
        //3- “Boys” linkine basin
        WebElement boysLinki = driver.findElement(By.xpath("(//ul[@class='submenu-link'])[2]"));
        ReusableMethods.bekle(2);
        boysLinki.click();
        ReusableMethods.bekle(2);
        //4- Acilan sayfadaki ilk urunu tiklayin
        driver.findElement(By.xpath("(//div[@class='product-box mb-2 pb-1'])[1]")).click();
        //4- Acilan sayfada urun isminin “Boys Shirt White Color” oldugunu test edin
        WebElement isimElementi = driver.findElement(By.xpath("//div[@class=' heading-sm mb-4']"));

        String expectedIsim = "Boys Shirt White Color";
        String actualIsim = isimElementi.getText();
        System.out.println(isimElementi.getText());
        System.out.println(expectedIsim);
        ReusableMethods.bekle(2);
        Assert.assertEquals(expectedIsim,actualIsim);

        ReusableMethods.bekle(1);
    }
}