public class DemoThreadString {
  private String s = "";

  public synchronized void add(String str){
    this.s += str;
  }


  public static void main(String[] args) {
    //task
    //add"a 100000 times
    //2 threads
    //->200000 "a"

    DemoThreadString d1 = new DemoThreadString();
    Runnable task = () -> {
      for(int i = 0; i < 100000; i++){
        d1.add("a");
      }
    };

    Thread t1 = new Thread(task);
    Thread t2 = new Thread(task);

    t1.start();
    t2.start();

    try {
        t1.join();
        t2.join();
    } catch (InterruptedException e) {
    }

    System.out.println(d1.s.length());//200000, no synchronized ~ 103529
  }
}
