
import org.junit.jupiter.api.*;


class SiteTest {

    @Test
    void testResidentialSite(){
        ResidentialSite residentialSite = new ResidentialSite(5, 10.50);
        Assertions.assertEquals(59.325, residentialSite.getBillableAmount());
    }

    @Test
    void testLifelineSite(){
        LifelineSite lifelineSite = new LifelineSite(10, 5.50);
        Assertions.assertEquals(28.215, lifelineSite.getBillableAmount());
    }

}