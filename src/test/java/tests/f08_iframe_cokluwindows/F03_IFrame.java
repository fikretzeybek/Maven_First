package tests.f08_iframe_cokluwindows;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.util.List;

public class F03_IFrame extends TestBase {

    @Test
    public void test01() {
        //http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home/");
        //Cookies kabul edin
        // cookies de iframe icinde oldugundan
        // once o iframe'e gecis yapalim


        //3) sayfadaki iframe sayısını bulunuz.

        List<WebElement> iFrameList = driver.findElements(By.tagName("iframe"));
        System.out.println("Sayfadaki iframe sayisi : " + iFrameList.size());

        //4) ilk iframe'deki (Youtube) play butonuna tıklayınız.
        //WebElement playIFrame = driver.findElement(By.xpath("(//iframe)[4]"));
        driver.switchTo().frame(4);
        WebElement playButtonElementi = driver.findElement(By.xpath("//button[@aria-label='Oynat']"));
        playButtonElementi.sendKeys(Keys.PAGE_DOWN);
        playButtonElementi.click();

        //5) ilk iframe'den çıkıp ana sayfaya dönünüz
        driver.switchTo().defaultContent();

        ReusableMethods.bekle(8);
    }
}