public class FactorialFunction {
    public static int factorialInt(int n) throws IllegalArgumentException{
        if (n < 0)
            throw new IllegalArgumentException();
        else if (n == 0)
            return 1;
        else
            return n * factorialInt(n-1);

    }
}
