package sayhello;

public class MyTest {

    public static int calFactorial(int no) {

        int fact = 1;

        for(int i = 1; i <= no; i++) {
            fact = fact * i;
        }

        return fact;
    }
}