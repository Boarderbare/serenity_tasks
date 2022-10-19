package net.serenity.tutorials.ui;

import net.serenity.tutorials.model.Category;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SelectCategoryNavigationBar extends PageObject {
    public void selectCategory(Category category) {
        $("*[class=hl-cat-nav] *[class=hl-cat-nav__container]").find(By.linkText(category.name())).click();
    }
}
