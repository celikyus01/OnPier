package com.onPier.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage{

    @FindBy(xpath = "(//label[@class='h-auto md:w-full'])[1]")
    public WebElement klasseM1;

    @FindBy(xpath = "(//span[.=' Prämie beantragen '])[1]")
    public WebElement flexPramieBentragen;

}
