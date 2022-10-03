package access.specifier.modifier;

public class SameClassWithoutStatic {
	/*
	 * (Same class) without static 
	 * 1 access instance variable into non static methd -->direct access
	 * 2 access non static method into non static method -->direct access 
	 */
	
	
	
	/*
	 * (Different classes) without static
	 * 1 access instance variable into non static method by using -->(i)extends or (ii)object
	 * 2 access non static method into non static method by using -->(i)extends or (ii)object
	 */
	
	
	/*
	 * with static (same class)
	 * 1 access static varibles into non static method       -->Direct Access
	 * 2 access static variable into static method           -->Direct Access
	 * 3 access static method into non static method         -->Direct Access
	 * 4 access static method into static method             -->Direct Access
	 */
	
	/*
	 * with static (different classes)
	 * 1 access static variable into static method  -->extends
	 * 2 access static variable into static method -->classname.variablename
	 * 3 access static variable into non static method -->extends
	 * 4 access static variable into non static method -->classname.variablename
	 * 
	 * 5 access static method into static method  -->extends
	 * 6 access static method into static method -->classname.methodname
	 * 7 access static method into non static method -->extends
	 * 8 access static method into non static method -->classname.methodname
	 */
	
	 public int a=10;     //instance variable
	 
	 
     public void add() {
	 System.out.println(a); //instance variable into non static method -->direct access
            }
     
      void sub() {
		
                  add();//non static method into non static method -->direct access
	}
	
	 public static void main(String[] args) {


               SameClassWithoutStatic a=new SameClassWithoutStatic();
                 a.add();
	}

}
