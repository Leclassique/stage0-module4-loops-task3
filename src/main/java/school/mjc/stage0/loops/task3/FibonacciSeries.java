package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int firstNum = 0;
        int secondNum = 1;
        int nextNum;
        System.out.println(firstNum);
        System.out.println(secondNum);
        for (int i = 2; i < lastFibonacci; i++) {
            nextNum = firstNum + secondNum;
            System.out.println(nextNum);
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}