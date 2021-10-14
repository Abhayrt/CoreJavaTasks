package lab_exercise_unit16;

public class LabU16Task3 extends Thread {

	private int delay;

	LabU16Task3(String name, float seconds) {
		super(name);
		delay = (int) seconds * 1000;// delays are in milliseconds
		start(); // start up ourself!
	}

	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				return;
			}
		}
	}

	public static void main (String argc[ ]) 
	 {
		new LabU16Task3 ("one potato", 1.1F); 
		 new LabU16Task3 ("two potato", 1.3F); 
		 new LabU16Task3 ("three potat", 0.5F); 
		 new LabU16Task3 ("four", 0.7F); 
		}

	public static void request(int i) {
		// TODO Auto-generated method stub
		
	}
}
