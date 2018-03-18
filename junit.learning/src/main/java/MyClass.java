import java.util.Objects;

public class MyClass {
    private String msg;

    public MyClass(String msg) {
        this.msg = msg;
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
