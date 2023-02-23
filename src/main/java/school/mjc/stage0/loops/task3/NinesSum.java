package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int x=1;
        if (lengthOfLastNumber<0) {
            System.out.println("0");
        }
        else {
            for (int i=0; i<=lengthOfLastNumber; i++) {
                sum = sum+(x-1);
                x=x*10;
            }
            System.out.println(sum);
        }

    }
}
