package lab_exercise_unit13;

public class LabU13Test1 implements Runnable {

	
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Thread"+i+" is running !!");
		}
	}
	public static void main(String[] args) {
		LabU13Test1 t1=new LabU13Test1();
		Thread th=new Thread(t1);
		th.start(); 
	}

}
