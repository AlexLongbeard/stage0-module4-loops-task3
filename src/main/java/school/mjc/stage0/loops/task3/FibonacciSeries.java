package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int fib_1 = 0;
        int fib_2 = 1;
        int fibNext;
        System.out.println("0");
        System.out.println("1");
        for (int i=3; i<=lastFibonacci; i++) {
            fibNext = fib_1+fib_2;
            System.out.println(fibNext);
            fib_1=fib_2;
            fib_2=fibNext;
        }
    }
}
