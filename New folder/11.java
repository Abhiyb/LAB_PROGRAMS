import java.util.Random;

class NumberGeneratorThread extends Thread {
    public void run() {
        Random random = new Random();

        while (true) {
            int num = random.nextInt(100);
            System.out.println("Generated: " + num);

            if (num % 2 == 0) {
                SquareThread squareThread = new SquareThread(num);
                squareThread.start();
            } else {
                CubeThread cubeThread = new CubeThread(num);
                cubeThread.start();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SquareThread extends Thread {
    private int num;

    public SquareThread(int num) {
        this.num = num;
    }

    public void run() {
        int square = num * num;
        System.out.println("Square of " + num + ": " + square);
    }
}

class CubeThread extends Thread {
    private int num;

    public CubeThread(int num) {
        this.num = num;
    }

    public void run() {
        int cube = num * num * num;
        System.out.println("Cube of " + num + ": " + cube);
    }
}

public class MultiThreadApp {
    public static void main(String[] args) {
        NumberGeneratorThread generatorThread = new NumberGeneratorThread();
        generatorThread.start();

        try {
            Thread.sleep(10000); // Let the threads run for 10 seconds
            generatorThread.interrupt();
            generatorThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads finished.");
    }
}
