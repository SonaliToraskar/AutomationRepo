package MavenDemoPckage.Dependson;

import org.testng.annotations.Test;

public class DisableTest {
    @Test
    public void verifyLogin() {
        System.out.println("verify login");
    }
    @Test(enabled = true)
    public void verifySendRequest() {
        System.out.println("verify sendrequest");
    }
    @Test
    public void verifyHomepage() {
        System.out.println("verify Homepage");
    }
}

