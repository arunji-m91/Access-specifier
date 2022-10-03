package access.specifier.modifier.childpackage;

public class ClassChecking {
int a=10;
 public void m1() {
	a=100;
	System.out.println(a);

}
 public void m2() {
	a=200;

}
 public void m3() {
	 a=300;
	 System.out.println(a);
 }
	public static void main(String[] args) {
		ClassChecking c=new ClassChecking();
		c.m1();
		System.out.println(c.a);
		c.m2();
		System.out.println(c.a);
		c.m3();
		System.out.println(c.a);
		//System.out.println(a);

	}

}
