package RujanLABjava;

class q13 {
    // a) Runnable
    static class A implements Runnable {
        public void run(){ System.out.println("Runnable Thread running"); }
    }

    // b) Extending Thread
    static class B extends Thread {
        public void run(){ System.out.println("Thread Class running"); }
    }

    // e) Sync method
    static class Sync {
        synchronized void show(String msg){ 
            for(int i=0;i<3;i++) System.out.println(msg+" "+i); 
        }
    }

    public static void main(String[] args) throws Exception {
        // a
        new Thread(new A()).start();
        // b
        new B().start();

        // c) isAlive + join
        Thread t = new Thread(() -> System.out.println("Alive test"));
        t.start(); System.out.println("isAlive: "+t.isAlive());
        t.join();  System.out.println("isAlive after join: "+t.isAlive());

        // d) Priority
        Thread p = new Thread(() -> System.out.println("Priority test"));
        p.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Priority: "+p.getPriority()); p.start();

        // e) synchronized method
        Sync s = new Sync();
        new Thread(() -> s.show("One")).start();
        new Thread(() -> s.show("Two")).start();

        // f) synchronized block
        new Thread(() -> { synchronized(s){ System.out.println("Block sync"); } }).start();

        // g) 100→1 every 3s
        new Thread(){
            public void run(){ for(int i=100;i>=1;i--){ 
                System.out.println(i); try{ sleep(3000);}catch(Exception e){} 
            }}
        }.start();

        // h) 1→10 every 2s
        new Thread(new Runnable(){
            public void run(){ for(int i=1;i<=10;i++){ 
                System.out.println(i); try{ Thread.sleep(2000);}catch(Exception e){} 
            }}
        }).start();

        System.out.println("\nLab No.: 13");
        System.out.println("Name: Rujan Rajlawat");
        System.out.println("Roll No./Section: 22081013");
    }
}
