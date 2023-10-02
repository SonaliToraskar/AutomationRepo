package MavenDemoPckage.PriorityExample;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 'a',groups = { "smoke"})
    public void testA() {
        System.out.println("test case A");
    }

    @Test(priority = 1)
    public void testS() {
        System.out.println("test case S");
    }

    @Test(priority = 3)
    public void testD() {
        System.out.println("test case D");
    }

    @Test(priority = 2,groups = { "smoke "})
    public void test5() {
        System.out.println("test case G");
    }

}