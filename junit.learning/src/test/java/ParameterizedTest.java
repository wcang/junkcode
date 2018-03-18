import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;

@RunWith(Parameterized.class)
public class ParameterizedTest {
    private static Concatenator concatenator;
    private String prefix;
    private String postfix;
    private String expected;
    private static int count = 0;
    private static int previous = 0;

    @BeforeClass
    public  static void setup() {
        concatenator = new Concatenator();
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Parameterized tear down");
        Assert.assertThat(count, is(2));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"The", "End", "The End"},
                {"It", "begins", "It begins"}
        });
    }

    public ParameterizedTest(String prefix, String postfix, String expected) {
        System.out.println("Parameterized constructor");
        count++;
        this.prefix = prefix;
        this.postfix = postfix;
        this.expected = expected;
    }

    @Test
    public void testParameterized() {
        Assert.assertThat(concatenator.join(prefix, postfix), is(expected));
    }

    @Ignore
    @Test
    public void testSomething() {
        Assert.assertThat(previous + 1, is(count));
        previous++;
    }
}
