package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IframeUtilities {

    public static int getIframeCount(WebDriver driver) {
        return driver.findElements(By.tagName("iframe")).size();
    }

    public static int getIframeIndex(WebDriver driver, String iframeSrc) {
        int index = 1; // İlk sıradan başlıyoruz

        for (WebElement iframe : driver.findElements(By.tagName("iframe"))) {
            if (iframe.getAttribute("src").contains(iframeSrc)) {
                return index;
            }
            index++;
        }

        return -1; // Eğer iframe bulunamazsa -1 döndürülür
    }

    public static void clickPlayButtonInIframe(WebDriver driver, String iframeSrc, String playButtonLocator) {
        int iframeIndex = getIframeIndex(driver, iframeSrc);

        if (iframeIndex != -1) {
            driver.switchTo().frame(iframeIndex - 1); // Sıra 1'den başladığı için -1 çıkarılır

            // Bekleme ekleyin
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement playButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(playButtonLocator)));

            playButton.click();
            driver.switchTo().defaultContent();
        } else {
            System.out.println("Belirtilen src değerine sahip iframe bulunamadı.");
        }
    }
}