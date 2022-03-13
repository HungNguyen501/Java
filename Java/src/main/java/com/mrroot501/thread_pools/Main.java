package com.mrroot501.thread_pools;

import org.apache.log4j.Logger;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.*;

/**
 * @author mrroot501
 */
class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
//        executor();
//        executorService();
//        newFixedThreadPool();
//        newCachedThreadPool();
        newSingleThreadExecutor();

    }

    private static void executor() {
        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> LOGGER.info("Hello World"));
    }

    private static void executorService() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<String> future = executorService.submit(()-> "Hello World");
        // Some operations
        String result = future.get();
        LOGGER.info(result);
    }

    private static void newFixedThreadPool() {
        ThreadPoolExecutor executor =
                (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            Thread.sleep(1000);
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            return null;
        });

        assertEquals(2, executor.getPoolSize());
        assertEquals(1, executor.getQueue().size());

        LOGGER.info(executor.getPoolSize());
        LOGGER.info(executor.getQueue().size());

    }

    private static void newCachedThreadPool() {
        ThreadPoolExecutor executor =
                (ThreadPoolExecutor) Executors.newCachedThreadPool();
        executor.submit(() -> {
            Thread.sleep(1000);
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            return null;
        });

        assertEquals(3, executor.getPoolSize());
        assertEquals(0, executor.getQueue().size());

        LOGGER.info(executor.getPoolSize());
        LOGGER.info(executor.getQueue().size());

    }

    private static void newSingleThreadExecutor() {
        AtomicInteger counter = new AtomicInteger();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            counter.set(1);
        });
        executor.submit(() -> {
            counter.compareAndSet(1, 2);
        });

        LOGGER.info(counter);

    }

}
