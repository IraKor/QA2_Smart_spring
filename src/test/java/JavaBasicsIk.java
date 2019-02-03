import org.junit.jupiter.api.Test;

public class JavaBasicsIk {
    @Test
    public void javaBasics() {
        int a = 12;
        int b = 10;

        int c = sumDigits(12, 10);
        int d = sumDigits(a, b);
        System.out.println("Sum is: " + d);
        System.out.println("Sum is: " + c);
    }

    private Integer sumDigits(int a, int b) {
        return a + b;
    }
}