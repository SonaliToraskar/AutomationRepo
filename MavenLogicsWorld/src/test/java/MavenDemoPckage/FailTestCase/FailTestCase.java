package MavenDemoPckage.FailTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailTestCase {
    @Test(retryAnalyzer = ReRunFailTestScript.class)
    public void testCaseA() {

        Assert.assertTrue(true);
    }

    @Test(retryAnalyzer = ReRunFailTestScript.class)
    public void testCaseB() {

        Assert.assertTrue(true);
    }

    @Test(retryAnalyzer = ReRunFailTestScript.class)
    public void testCaseC() {

        Assert.assertTrue(true);
    }

    @Test(retryAnalyzer = ReRunFailTestScript.class)
    public void testCaseD() {
        Assert.assertTrue(false);
    }

    @Test(retryAnalyzer = ReRunFailTestScript.class)
    public void testCaseE() {

        Assert.assertTrue(false);
    }
}

