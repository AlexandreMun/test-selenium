import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    @Test
    public void testTestLink() {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver navegar = new ChromeDriver();

        navegar.get("https://testlink.org");

        // Assets testlink
        Assert.assertTrue(navegar.findElement(By.xpath("/html/body/div/div[3]/div/a[4]")).isDisplayed());
        System.out.println(navegar.findElement(By.xpath("/html/body/div/div[3]/div/a[4]")).isDisplayed());

        Assert.assertTrue(navegar.findElement(By.xpath("/html/body/div/div[3]/div/a[10]/img")).isDisplayed());
        System.out.println(navegar.findElement(By.xpath("/html/body/div/div[3]/div/a[10]/img")).isDisplayed());

        // Clique Github
        navegar.findElement(By.xpath("/html/body/div/div[3]/div/a[3]")).click();

        // Assets Github - testlink
        Assert.assertTrue(navegar.findElement(By.xpath("//*[@id=\"readme\"]/div[2]/article/h1[2]")).isDisplayed());
        System.out.println(navegar.findElement(By.xpath("//*[@id=\"readme\"]/div[2]/article/h1[2]")).isDisplayed());

        Assert.assertTrue(navegar.findElement(By.xpath("//*[@id=\"user-content-testlink-1920-raijin---read-me\"]")).isDisplayed());
        System.out.println(navegar.findElement(By.xpath("//*[@id=\"user-content-testlink-1920-raijin---read-me\"]")).isDisplayed());

        Assert.assertTrue(navegar.findElement(By.xpath("//*[@id=\"repository-container-header\"]/div[1]/div/div/strong/a[text()='testlink-code']")).isDisplayed());
        System.out.println(navegar.findElement(By.xpath("//*[@id=\"repository-container-header\"]/div[1]/div/div/strong/a[text()='testlink-code']")).isDisplayed());
    }

}
