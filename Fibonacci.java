public class Fibonacci {
    public static void main(String[] args) {
        long Sum = 0;
        long first = 0;
        long second = 1;
        for (int i = 0; i<=100; i++){
            Sum = first + second;
            first = second;
            second = Sum;
            System.out.println(Sum);
        }
    }
}