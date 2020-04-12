import driver.DriverSettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.AssertFor;
import pom.MainPage;

public class FirstTest extends DriverSettings {

    MainPage mainPage;
    AssertFor assertFor;

    @BeforeMethod
    public void setUp() {
        mainPage = new MainPage(webDriver);
        assertFor = new AssertFor(webDriver);
    }


    /*ID.1
    Verify that when user selects "NEW" condition, it will be only visible "NEW" condition shoes.*/
    @Test
    public void test1() {
        try {
            mainPage.goToMenShoesSection()
                    .setNewCondition()
                    .contentGenerate();
            Thread.sleep(5000);
            Assert.assertEquals("New", assertFor.getCondition());
        } catch (InterruptedException e) {
            System.err.println("TEST 1 IS FAILD");
        }

    }

    /*ID.2
    Verify that when the user selects the size, it will be only visible that size that the user is select.*/
    @Test
    public void test2() throws InterruptedException {
        mainPage.goToMenShoesSection()
                .setSelectSize()
                .contentGenerate();
        Thread.sleep(5000);
        Assert.assertEquals("43", assertFor.getNumberOfShoes());
    }

    /*ID.3
    Verify that if user choose"cloth and fashion" then
    "Men's shoes" it will be only visible "Men's shoes" located in Yerevan*/
    @Test
    public void test3() {
        try {
            mainPage.goToMenShoesSection()
                    .setLocation()
                    .contentGenerate();
            Thread.sleep(5000);
            Assert.assertEquals("Yerevan › Arabkir", assertFor.getLocation());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    // Check construction type
// Case 4
    @Test
    public void CheckApartmentConstructionType() throws InterruptedException {
        mainPage.goToRealEstateSection()
                .setStoneType()
                .contentGenerate();
        Thread.sleep(5000);
        Assert.assertEquals("Stone", assertFor.getConstructionType());
    }

    //Check room count
//Case 5
    @Test
    public void CheckApartmentRoomCount() throws InterruptedException {
        mainPage.goToRealEstateSection()
                .setRoomCount()
                .contentGenerate();
        Thread.sleep(5000);
        Assert.assertEquals("5", assertFor.getApartmentRoom());
    }

    //Check apartment floor
//Case 6
    @Test
    public void CheckApartmentFloor() throws InterruptedException {
        mainPage.goToRealEstateSection()
                .setFloor()
                .contentGenerate();
        Thread.sleep(5000);
        Assert.assertEquals("4", assertFor.getApartmentFloor());
    }

    //Check apartment living space
//Case 7
    @Test
    public void CheckApartmentLivingSpace() throws InterruptedException {
        mainPage.goToRealEstateSection()
                .setLivingSpace()
                .contentGenerate();
        Thread.sleep(5000);
        Assert.assertEquals("60 m2", assertFor.getApartmentSpace());
    }

    //Case 8
    @Test
    public void vehicleMarkTest() throws InterruptedException {
        mainPage.goToVehicleSection()
                .chooseCarType()
                .contentGenerate();
        Thread.sleep(3000);
        Assert.assertEquals("Subaru", assertFor.getMarkName());
    }

    //    case 9
    @Test
    public void vehicleBodyTypeTest() throws InterruptedException {
        mainPage.goToVehicleSection()
                .chooseBodyType()
                .contentGenerate();
        Thread.sleep(3000);
        Assert.assertEquals("Coupe", assertFor.getBodyType());
    }

    //    case 10
    @Test
    public void vehicleYearTest() throws InterruptedException {
        mainPage.goToVehicleSection()
                .chooseYear()
                .contentGenerate();
        Thread.sleep(3000);
        Assert.assertEquals("2016", assertFor.getYear());
    }

    //    case 11
    @Test
    public void vehicleEngineTypeTest() throws InterruptedException {
        mainPage.goToVehicleSection()
                .engineType()
                .contentGenerate();
        Thread.sleep(3000);
        Assert.assertEquals("Hybrid", assertFor.getEngineType());
    }

    //    case 12
    @Test
    public void redirectedF() throws InterruptedException {
        mainPage.redirectToHousePlants()
                .goToJobsOther();
        Thread.sleep(4000);
        Assert.assertEquals("Home › Jobs › Other", assertFor.getPagePath());

    }

    //case 13
    @Test
    public void agencyType() throws InterruptedException {
        mainPage.jobsSection()
                .clickToAgency()
                .contentGenerate();
        Thread.sleep(5000);
        Assert.assertEquals("Agency", assertFor.getAgencyType());
    }


    //    case 14
    @Test
    public void carRentalsTest() throws InterruptedException {
        mainPage.rental()
                .locationYerevan()
                .contentGenerate();
        Assert.assertEquals("Yerevan › Kentron", assertFor.locationVerify());


    }


    //Check empty result page
//CAse 15
    @Test
    public void CheckApartmentWrongFloor() throws InterruptedException {
        mainPage.goToRealEstateSection()
                .setWrongFloor();
        Thread.sleep(5000);
        Assert.assertEquals("Your search did not match any postings.", assertFor.getApartmentWrongFloor());
    }

    //Check employment type
//Case 16
    @Test
    public void CheckEmploymentType() throws InterruptedException {
        mainPage.goToJobsSection()
                .setEmploymentType()
                .contentGenerate();
        Thread.sleep(5000);
        Assert.assertEquals("Permanent", assertFor.getemploymentType());
    }

    //Check Job Schedule
//Case 17
    @Test
    public void CheckJobSchedule() throws InterruptedException {
        mainPage.goToJobsSection()
                .setJobSchedule()
                .contentGenerate();
        Thread.sleep(5000
        );
        Assert.assertEquals("Full time", assertFor.getJobSchedule());
    }

    //case 18
    @Test
    public void translatedInfoTest() throws InterruptedException {
        mainPage.translatedInfo();
        Assert.assertEquals("Ընդհանուր տեղեկություններ", assertFor.translatedInfo());
    }

    //    case 19
    @Test
    public void crumbVerification() throws InterruptedException {
        mainPage.crumbName();
        Assert.assertEquals("Home › All Categories", assertFor.getCrumbName());
    }

    //    test case 30
//ID 30
    @Test
    public void checkCurrentPage() throws InterruptedException {
        mainPage.moveToOtherPage();
        Assert.assertEquals("5", assertFor.getCurrentPage());
    }

}