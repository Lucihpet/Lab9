public class RunnableLab implements Runnable {
    String storedString;

    public RunnableLab (String str) {
        this.storedString = str;
    }

    @Override
    public void run() {
        System.out.println("This thread's String: " + this.storedString);
        System.out.println("5 + 2 - 3 = " + (5+2-3));
    }

    public static void main (String[] args) {
        Thread t1 = new Thread(new RunnableLab("thread 1"));
        Thread t2 = new Thread(new RunnableLab("thread 2"));

        t1.start();
        t2.start();
    }
}
