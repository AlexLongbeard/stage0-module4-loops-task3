package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int max;
        int nod = 0;
      if (first>=0 && second>=0) {
          if (first>second) {
              max = first;
          }
          else {
              max = second;
          }

          for (int i=1; i<=max; i++ ) {
              if (first%i==0 && second%i==0) {
                  if (i>nod) {
                      nod=i;
                  }
              }
          }
          System.out.println(nod);
      }
    }
}
