package lab_exercise_unit14;

public class LabU14Task1 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t = Thread.currentThread();
		System.out.println("currently exicuting thread:" + t);
		System.out.println("Name of currently exicuting thread:" + t.getName());
		System.out.println("Priority :" + t.getPriority());
		//changing the name of the of the current thread
		t.setName("mythread");
		System.out.println("after name change :" + t);
		t.setPriority(2);
		System.out.println("after priority change :" + t);
		System.out.println("number of active thread :" + t.activeCount());
	}

}
