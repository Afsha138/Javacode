//No,Thread will run once and for the second
// time it will throw an exception..
 
 
 public class ThreadTwice extends Thread 
 {
   public void run()
   {
     System.out.println("Thread started running...");
   }
   public static void main(String args[])
   { 
     ThreadTwice tt=new ThreadTwice();
     tt.start();
     tt.start();
 
   }
 }
