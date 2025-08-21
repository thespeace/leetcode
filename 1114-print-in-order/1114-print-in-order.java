class Foo {
    private CountDownLatch latch1;
    private CountDownLatch latch2;

    public Foo() {
        latch1 = new CountDownLatch(1);
        latch2 = new CountDownLatch(1);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first".
        printFirst.run();
        latch1.countDown(); // 첫 번째 끝남을 알림
    }

    public void second(Runnable printSecond) throws InterruptedException {
        latch1.await(); // first() 끝날 때까지 대기
        printSecond.run();
        latch2.countDown(); // 두 번째 끝남을 알림
    }

    public void third(Runnable printThird) throws InterruptedException {
        latch2.await(); // second() 끝날 때까지 대기
        printThird.run();
    }
}