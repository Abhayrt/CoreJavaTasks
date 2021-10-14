package lab_exercise_unit_4;

class emp {
	int emp_id;
	int salary;
	static String ceo;
	
	public void show(){
		System.out.println("ID: "+emp_id+" Salary: "+salary+" CEO: "+ceo);
	}
}

public class LabU4Task1 {
	public static void main(String[] args) {
		
		emp Hrishikesh=new emp();
		Hrishikesh.emp_id=2;
		Hrishikesh.salary=1200000;
		emp.ceo="Imtiyaz";
		
		
		emp Abhishek=new emp();
		Abhishek.emp_id=4;
		Abhishek.salary=320000;
		emp.ceo="Imtiyaz";
		
		Hrishikesh.show();
		Abhishek.show();
	}
}
