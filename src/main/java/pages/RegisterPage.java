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

    public String address_verify;

    WebElement signup_login_btn =driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));





    // click cart btn
    //WebElement cart_btn = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a"));


    //name field of signup
    //WebElement select_name_filed = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));




    public String[] getting_registered() throws InterruptedException {
        String[] strings = new String[4];


        //click_item_cart_btn.click();
        signup_login_btn.click();



        WebElement select_name_filed = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
        select_name_filed.clear();
        select_name_filed.sendKeys("Md. Mukit");

        Thread.sleep(2000);

        WebElement email_address = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));

        email_address.clear();
        email_address.sendKeys("sabbir17700.mukit379@gmail.com");

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


        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        //add item to cart

        WebElement add_item_cart = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a"));
        add_item_cart.click();


        WebElement card_btn_click = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a"));
        card_btn_click.click();


        //proceed to checkoutpage

        WebElement checkout_btn = driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a"));
        checkout_btn.click();


        WebElement address = driver.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[4]"));
        strings[2] = address.getText();

        address_verify = strings[2];


        WebElement description = driver.findElement(By.xpath("//*[@id=\"ordermsg\"]/textarea"));
        description.sendKeys(" please take a note about that oreder.My location is khilkhet, Nikunjo-2, Road No:09, House No: 23");


        WebElement place_order_btn = driver.findElement(By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a"));
        place_order_btn.click();


        WebElement name_on_card = driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[1]/div/input"));
        name_on_card.sendKeys("Md Sabbir");

        WebElement card_number = driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[2]/div/input"));
        card_number.sendKeys("2222 3333 4444 6645");

        WebElement cvc = driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[1]/input"));
        cvc.sendKeys("344");

        WebElement expiration_month = driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[2]/input"));
        expiration_month.sendKeys("05");

        WebElement expiration_year = driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[3]/input"));
        expiration_year.sendKeys("2030");

        WebElement pay_and_order_confirm = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        pay_and_order_confirm.click();




        WebElement order_success_message = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/p"));

        strings[3] = order_success_message.getText();





        //cart_btn.click();


        return strings;



    }

    public  String orederConfirm() throws InterruptedException {

       String location[] = getting_registered();

       String address = location[2];


        return address;

    }




}
