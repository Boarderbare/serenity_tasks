package net.serenity.tutorials.steps;

import net.serenity.tutorials.model.Category;
import net.serenity.tutorials.ui.CurrentPage;
import net.serenity.tutorials.ui.EbayHomePage;
import net.serenity.tutorials.ui.SelectCategoryNavigationBar;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class NavigationUser {

    EbayHomePage ebayHomePage;
    CurrentPage currentPage;
    SelectCategoryNavigationBar selectCategoryNavigationBar;

    @Step
    public void isOnHomePage(){
        ebayHomePage.open();
    }
    @Step
    public void shouldBeSeePageTitleContaining(String expectedTitle) {
        assertThat(currentPage.getTitle()).containsIgnoringCase(expectedTitle);
    }
    @Step
    public void navigatesToCategory(Category category){
        selectCategoryNavigationBar.selectCategory(category);
    };
}
