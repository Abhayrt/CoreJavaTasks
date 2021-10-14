package lab_exercise_unit_6;

interface A
{
	void meth1();
	void meth2();
}
// B now includes meth1() and meth2()–it adds meth3().
interface B extends A
{
void meth3();
}
// This class must implement all of A and B
class MyClass implements B{
	public void meth1 ( ){
System.out.println("meth1");
}
public void meth2(){
	System.out.println("meth2");
}
public void meth3(){
	System.out.println("meth3");
}
}
class LabU6Task1IfExtend
{
public static void main(String arg[])
{
MyClass ob = new MyClass();
ob.meth1();
ob.meth2();
ob.meth3();
}
}
