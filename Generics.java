import java.lang.*;
class TwoGen<T,V>
{

	T ob1;
	V ob2;
	
	TwoGen(T o1,V o2){
	
		ob1 = o1;
		ob2 = o2;
		
	}
	
	void showtypes(){
	
		System.out.println("Type of T is " + ob1.getClass().getName());
		System.out.println("Type of V is" + ob2.getClass().getName());
	}
	
	T getob1(){
		return ob1;
		
	}
	
	
	V getob2(){
		return ob2;
		
	}
}

class Gen{
	public static void main(String args[]){
	
		TwoGen<Integer,String> tg = new TwoGen<Integer,String>(98,"Apple");
		tg.showtypes();
		int v = tg.getob1();
			System.out.println("ob1 is :" + v);
		String  u = tg.getob2();
			System.out.println("ob2 is : " + u);
		
		
		
	}
}
