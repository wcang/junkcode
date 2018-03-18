import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test2 {
    private static MyClass myClass;

    @BeforeClass
    public static void setupClass() {
        myClass = new MyClass("test");
    }

    @AfterClass
    public static void tearDownClass() {

    }

    @Test
    public void testOnce() {
        myClass.increment();
        Assert.assertEquals(1, myClass.getCounter());
    }

    @Test
    public void testTwice() {
        myClass.increment();
        Assert.assertEquals(2, myClass.getCounter());
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        myClass.divide(10, 0);
    }
}
