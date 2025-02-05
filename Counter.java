import java.util.Random;

public class Counter implements Runnable {
    int minTime = 500;
    int maxTime = 1500;
    static int counterNumber = 0;
    int threadNumber;

    public Counter() {
      threadNumber = ++counterNumber;
    }

    public void run() {
      for (int i = 0; i <= 50; i++) {
        System.out.println("thread #" + threadNumber + ": " + i);
        try {
          Thread.sleep(new Random().nextInt(maxTime - minTime + 1) + minTime);
        } catch (InterruptedException e) {
          System.out.println("interrupted!");
          return;
        }
      }
    }
  }