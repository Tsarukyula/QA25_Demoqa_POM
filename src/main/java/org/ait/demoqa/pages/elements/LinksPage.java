package org.ait.demoqa.pages.elements;

import org.ait.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.List;

public class LinksPage extends BasePage {

    public LinksPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(tagName = "a")
    List<WebElement> allLinks;
    public LinksPage getAllLinks() {
        System.out.println("Total number oflinks on the psge: " + allLinks.size());
        String url;
        // loop through elements
        Iterator<WebElement> iterator = allLinks.iterator();
        while (iterator.hasNext()) {
            url = iterator.next().getText();
            System.out.println(url);
        }
        return this;
    }


    @FindBy(css = "[href]")
    WebElement attr;

    public LinksPage checkBrokenLinks() {
        for (int i = 0; i < allLinks.size(); i++) {
            WebElement el = allLinks.get(i);
            String url = getValueAttribute(el, "href");
            verifyLinks(url);
        }
        return this;
    }

}
