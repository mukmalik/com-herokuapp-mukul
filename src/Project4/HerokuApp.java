package Project4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuApp {

    public static void main(String[] args) {

        String str = "http://the-internet.herokuapp.com/login";
        // 1. setup the browser
        WebDriver webDr = new ChromeDriver();

        // 2. open url
        webDr.get(str);

        // 3. print the title of the page
        System.out.println("Print title of the page :\t"+webDr.getTitle());

        // 4. print the current url
        System.out.println("Print current url :\t"+webDr.getCurrentUrl());

        // 5. print the page source
        System.out.println("Print the page source :\t"+webDr.getPageSource());

        // 6. enter email to email field
        WebElement userEl = webDr.findElement(By.id("username"));
        userEl.sendKeys("prime@prime.com");


        // 7. enter the password to password field
        WebElement passEl = webDr.findElement(By.id("password"));
        passEl.sendKeys("password123");

        // 8. click on login button
        //webDr.findElement(By.cssSelector("fa fa-2x fa-sign-in")).click();
        WebElement but =  webDr.findElement(By.cssSelector("button[type=\"submit\"]"));
        but.click();


        // 9. print the current url
        System.out.println("Print current url\t"+webDr.getCurrentUrl());

        // 10. refresh page
        webDr.navigate().refresh();

        // 11. close browser
        webDr.close();

    }


}
