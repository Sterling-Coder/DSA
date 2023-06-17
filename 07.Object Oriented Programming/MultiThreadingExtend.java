// class A extends Thread {
//     public void run() {
//         try{
//         for (int i = 0; i<10; i++)
//         System.out.println("Its ME");
//         Thread.sleep(1000);
//         }
//         catch (InterruptedException e) {
            
//         }
//     }
// }

// public class MultiThreadingExtend {
//     public static void main(String[] args) throws InterruptedException {
//         A t = new A();
//         t.start();
//         for (int i = 0; i<10; i++)
//         System.out.println("Main class Working");
//         Thread.sleep(1000);
//     }
// }

class MultiThreadingExtend extends Thread{
    public void run(){
    System.out.println("thread is running...");
    }
    public static void main(String args[]){
    MultiThreadingExtend t1=new MultiThreadingExtend();
    t1.start();
     }
}