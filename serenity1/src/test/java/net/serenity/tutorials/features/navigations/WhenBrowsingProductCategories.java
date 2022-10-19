package net.serenity.tutorials.features.navigations;

import net.serenity.tutorials.model.Category;
import net.serenity.tutorials.steps.NavigationUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WhenBrowsingProductCategories {
    @Steps
    NavigationUser mark;

    @Managed
    WebDriver browser;

    @Test
    public void shouldBeAbleToElectronics (){
        //Given
        mark.isOnHomePage();
        //When
        mark.navigatesToCategory(Category.Electronics);
        //Then
        mark.shouldBeSeePageTitleContaining("Electronics products for sale | eBay");

    }

}
