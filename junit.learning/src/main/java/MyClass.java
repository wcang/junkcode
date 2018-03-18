import java.util.Objects;

public class MyClass {
    private String msg;
    private int counter = 0;

    public MyClass(String msg) {
        this.msg = msg;
    }

    public void increment()
    {
        counter++;
    }

    public int getCounter() {
        return counter;
    }



    public int divide(int numerator, int denominator) {
        return numerator / denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MyClass))
            return false;

        if (Objects.equals(((MyClass) obj).msg, this.msg))
            return true;

        return false;
    }
}
