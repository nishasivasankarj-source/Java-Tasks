package Learn_threads;

class Demo extends Thread {
	public void run() {
		System.out.println("Hello Nisha");
		System.out.println(Thread.currentThread().getName());
	}
}

class sdRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("Hello poorna");
		System.out.println(Thread.currentThread().getName());
	}
}

class Fire extends Thread {
	public void run() {
		System.out.println("Fire Mode is ON..."+Thread.currentThread().getId());
	}
}

class Jump extends Thread {
	public void run() {
		System.out.println("Jump Mode is ON..."+Thread.currentThread().getId());
	}
}

class Scope extends Thread {
	public void run() {
		System.out.println("Scope Mode is ON..."+Thread.currentThread().getId());
	}
}

class Run extends Thread {
	public void run() {
		System.out.println("Run mode is ON.."+ Thread.currentThread().getName()+"_"+Thread.currentThread().getPriority());
	}
}

class Move extends Thread {
	public void run() {
		System.out.println("Move mode is ON.."+ Thread.currentThread().getName()+"_"+Thread.currentThread().getPriority());
	}
}

class Map extends Thread {
	public void run() {
		System.out.println("Map mode is ON.."+ Thread.currentThread().getName()+"_"+Thread.currentThread().getPriority());
	}
}

public class single_thread {

	public static void main(String[] args) throws InterruptedException {
		
	Demo t = new Demo();
	t.start();
	Demo t1 = new Demo();
	t1.start();
	
	sdRunnable m = new sdRunnable();
	Thread th = new Thread(m);
	th.start();
	
	Fire t11 = new Fire();
	Jump t2 = new Jump();
	Scope t3 = new Scope();
	
	t11.start();
	t11.join();
	t2.start();
	t3.start();
	
	Run t111 = new Run();
	Move t22 = new Move();
	Map t33 = new Map();
	
	t111.setName("Thread_1");
	t22.setName("Thread_2");
    t33.setName("Thread_3");
    
    t111.setPriority(2);
    t22.setPriority(3);
    t33.setPriority(5);
    
    t111.start();
    t22.start();
    t33.start();


	}

	
}


