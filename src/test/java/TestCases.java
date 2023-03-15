import org.testng.annotations.Test;

public class TestCases {

    @Test(priority = 2)
    void test1(){
        System.out.println("test1");
    }

    @Test(priority = 1)
    void test2(){
        System.out.println("test2");
    }
}
