package MavenDemoPckage.AttributeAnnotation;

import org.testng.annotations.Test;

public class InvocationCountExample {

    @Test(invocationCount = 500,invocationTimeOut = 2)
    public void testInvocation(){
        System.out.println("testInvocation");
    }
}
