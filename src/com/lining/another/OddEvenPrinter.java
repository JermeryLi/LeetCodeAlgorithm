package com.lining.another;

/**
 * @author lining
 * @date 2021/2/25 14:24
 */
public class OddEvenPrinter {

    private final Object monitor = new Object();
    private final int limit;
    private volatile int count;

    public OddEvenPrinter(int limit, int initCount) {
        this.limit = limit;
        this.count = initCount;
    }

    public void print() {
        synchronized (monitor) {
            while (count < limit) {
                try {
                    System.out.println(String.format("线程[%s]打印数字:%d", Thread.currentThread().getName(), ++count));
                    monitor.notifyAll();
                    monitor.wait();
                } catch (InterruptedException e) {
                    //
                } finally {
                    //
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        OddEvenPrinter printer = new OddEvenPrinter(10, 0);
        Thread thread1 = new Thread(printer::print, "thread-1");
        Thread thread2 = new Thread(printer::print, "thread-2");
        thread2.start();
        Thread.sleep(Integer.MAX_VALUE);
    }
}
