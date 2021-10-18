package pageObjects;

import pageObjects.googleSearchPage.GoogleSearchPage;
import pageObjects.googleSearchPage.GoogleSearchResultsPage;
import pageObjects.googleTranslatePage.GoogleTranslatePage;

public class Pages {

    public GoogleSearchPage googleSearchPage;
    public GoogleSearchResultsPage googleSearchResultsPage;
    public GoogleTranslatePage googleTranslatePage;

    public Pages() {
        googleSearchPage = new GoogleSearchPage();
        googleSearchResultsPage = new GoogleSearchResultsPage();
        googleTranslatePage = new GoogleTranslatePage();
    }
}