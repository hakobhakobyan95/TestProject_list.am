import driver.DriverSettings;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.AssertFor;
import pom.MainPage;
import pom.MyAccount;

import java.util.Iterator;
import java.util.Set;

public class LogInSuit extends DriverSettings {
    MainPage mainPage;
    AssertFor assertFor;
    Cookie cookies;
    MyAccount myAccount;

    public Cookie getAllCookie() {
        Set<Cookie> cookies = webDriver.manage().getCookies();
        Iterator<Cookie> cookieIterator = cookies.iterator();
        while (cookieIterator.hasNext()) {
            Cookie tmp = cookieIterator.next();
            System.out.println(tmp.getName().equals("u"));
            if (tmp.getName().equals("u")) {
                return tmp;
            }
        }
        return null;
    }

    @BeforeMethod
    public void initCookie() throws InterruptedException {
        mainPage = new MainPage(webDriver);
        assertFor = new AssertFor(webDriver);
        myAccount = new MyAccount(webDriver);
        if (cookies != null) {
            Cookie cookie = new Cookie(cookies.getName(), cookies.getValue());
            webDriver.manage().addCookie(cookie);
            System.out.println(cookie);
            webDriver.navigate().refresh();
            Thread.sleep(5000);
        }
//        assertFor = new AssertFor(webDriver);
    }

//    @Test
//    public void signIn() {
//        try {
//            mainPage.settingsPage()
//                    .selectLocation()
//                    .clickSaveButton();
//            Thread.sleep(4000);
//            Assert.assertEquals("Information updated.", assertFor.getInfoAfterSave());
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    @Test(priority = 1)
    public void a() throws InterruptedException {
        mainPage.logIn();
        cookies = new Cookie("", "");
        cookies = getAllCookie();
    }

    //    test case 21
    @Test(priority = 2)
    public void turOffNotification() throws InterruptedException {
        mainPage.settingsPage()
                .changeName()
                .clickSaveButton();
        Thread.sleep(4000);
        Assert.assertEquals("Information updated.", assertFor.getInfoAfterSave());
    }


    //ID 22
    @Test(priority = 3)
    public void AdPost() throws InterruptedException {
        myAccount.invalidTitle();
        Assert.assertEquals("This field is too short", assertFor.getErrorMessage());
    }

    /*Test case ID 23Verify that the ads is being changed*/
    @Test(priority = 4)
    public void adsChangingTest() throws InterruptedException {
        myAccount
                .clickEditButton()
                .selectLocation()
                .clickPreviewButton();
        Thread.sleep(4000);
        Assert.assertEquals("Mercedes E350 restaylingi halogeni zavadskoy nikelThis message is for verification", assertFor.changeVerification());
        Thread.sleep(5000);
    }

    //ID 24
    @Test(priority = 5)
    public void GetFavList() throws InterruptedException {
        mainPage.goToMenShoesSection();
        mainPage.contentGenerate();
        myAccount.FavouriteAdsPage();
        Assert.assertEquals("2", assertFor.getFavAdCount());
    }

    //ID 25
    @Test(priority = 6)
    public void RemoveFromFav() throws InterruptedException {
        myAccount
                .removeFav();
        Assert.assertEquals("1", assertFor.getFavRemovedCount());
    }

    /*Test case ID26 Verify that ads is being deleted*/
    @Test(priority = 7)
    public void inactiveAdsTest() throws InterruptedException {
        myAccount
                .clickDeactivateButton()
                .clickDeactivatePopUp();
        Thread.sleep(3000);
        Assert.assertEquals("Inactive1", assertFor.inactiveAds());
    }

    /*Test case ID27 Verify that Viber number is being added*/
    @Test(priority = 8)
    public void viberNumberTest() throws InterruptedException {
        myAccount
                .clickSettingsButton()
                .clickContactInfo()
                .clickAddButton()
                .inputPopUp();
        Thread.sleep(3000);
        Assert.assertEquals("(091) 66-60-61", assertFor.viberNumberVerification());
    }
}
