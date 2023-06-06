package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class RegisterPage extends BasePage {

    //adding  element in cart

    //WebElement click_item_cart_btn = driver.findElement(By.xpath("//html/body/section[2]/div/div/div[2]/div[1]/div[3]/div/div[1]/div[1]/a"));


    //click signup/login button

    WebElement signup_login_btn =driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));





    // click cart btn
    //WebElement cart_btn = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a"));


    //name field of signup
    //WebElement select_name_filed = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));




    public String[] getting_registered() throws InterruptedException {
        String[] strings = new String[2];

        //click_item_cart_btn.click();
        signup_login_btn.click();



        WebElement select_name_filed = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
        select_name_filed.clear();
        select_name_filed.sendKeys("Md. Mukit");

        Thread.sleep(2000);

        WebElement email_address = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));

        email_address.clear();
        email_address.sendKeys("sabbir101.mukit379@gmail.com");

        Thread.sleep(2000);

        WebElement signup_btn = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
        signup_btn.click();

        Thread.sleep(2000);

        WebElement title_select = driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
        title_select.click();

        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("mukit@123");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        //select date

//        Select drop_down = (Select) driver.findElements(By.id("days"));
//        drop_down.selectByValue("2023-06-07");

        //address information

        WebElement first_name = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));

        first_name.sendKeys("Sabbir");

        WebElement last_name = driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
        last_name.sendKeys("Mukit");

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        WebElement company = driver.findElement(By.xpath("//*[@id=\"company\"]"));
        company.sendKeys("Kinetic Healthcare Solution");

        WebElement address1 = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
        address1.sendKeys("Nikunjo-2");

        WebElement address2 = driver.findElement(By.xpath("//*[@id=\"address2\"]"));
        address2.sendKeys("Road No:09, House No:23");

        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        WebElement select_country_btn = driver.findElement(By.xpath("//*[@id=\"country\"]"));
        Select select = new Select(select_country_btn);
        select.selectByIndex(2);

        WebElement state = driver.findElement(By.xpath("//*[@id=\"state\"]"));
        state.sendKeys("Dhaka");

        WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
        city.sendKeys("Khilkhet");

        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        WebElement zip_code = driver.findElement(By.xpath("//*[@id=\"zipcode\"]"));
        zip_code.sendKeys("8200");


        WebElement mobile_number = driver.findElement(By.xpath("//*[@id=\"mobile_number\"]"));
        mobile_number.sendKeys("01643106718");

        WebElement account_create_btn = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button"));

        account_create_btn.click();

        Thread.sleep(3000);

        WebElement account_creation_message = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b"));




        strings[0] = account_creation_message.getText();


        WebElement continue_btn = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));

        continue_btn.click();

        WebElement  user_name = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a"));
        strings[1] = user_name.getText();






        //cart_btn.click();


        return strings;



    }




}
