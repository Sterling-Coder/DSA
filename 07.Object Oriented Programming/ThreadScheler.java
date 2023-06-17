class A extends Thread {
    public void run() {
        String n = Thread.currentThread().getName();
    System.out.println(n);
    }
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("threead 1");
        t2.setName("threead 2");
        t3.setName("threead 3");

        t1.start();
        t2.start();
        t3.start();
    }
}