package mycalcpkg;

public class maincalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalc obj = new MyCalc();
		int sum = obj.addition(67,34);
		int sub= obj.substraction(78,45);
		int mul = obj.multiplication(67, 5);
		
		System.out.println(sum);
		System.out.println(sub);	
        System.out.println(mul);
	}
}
	
