package MavenDemoPckage.PriorityExample;

import org.testng.annotations.Test;

public class NewPriorityExample {
    @Test(priority = 1)
    public void testA() {
        System.out.println("test case A");
    }

    @Test(priority = 4)
    public void test0() {
        System.out.println("test case S");
    }

    @Test(priority = 3)
    public void testD() {
        System.out.println("test case Z");
    }

    @Test(priority = 2)
    public void test5() {
        System.out.println("test case G");
    }

    @Test(groups = {"smoke"})
    public void verifyReviewProfile() {
        System.out.println("verify Review Profile");
    }
}

