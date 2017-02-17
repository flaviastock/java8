package java8.cap1;

import org.junit.Test;

import java8.Exercise;

public class C1E6 implements Exercise {
    @Test
    @Override
    public void perform() {
        new Thread(
                uncheck(
                        () -> {
                            System.out.println("Zzz");
                            Thread.sleep(1000);
                        }
                )
        ).start();
    }

    public static Runnable uncheck(RunnableEx runner) {
        return () -> {
            try {
                runner.run();
            } catch (Exception ignored) {
            }
        };
    }
}