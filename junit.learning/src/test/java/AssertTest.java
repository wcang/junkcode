import org.junit.Assert;
import org.junit.Test;

public class AssertTest {

    @Test
    public void testAssertEqualArray() {
        byte[] expected = "hello".getBytes();
        byte[] actual = "hello".getBytes();
        Assert.assertArrayEquals("Array equality test", expected, actual);
    }

    @Test
    public void testSame() {
        MyClass expected = new MyClass("test");
        MyClass actual = new MyClass("test");
        Assert.assertSame(expected, actual);
        //assertSame test for ==
        //Assert.assertSame(expected, expected);
    }

    @Test
    public void testEqual() {
        MyClass expected = new MyClass("test");
        MyClass actual = new MyClass("test");
        Assert.assertEquals(expected, actual);
    }
}
