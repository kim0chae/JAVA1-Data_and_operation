
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		
		double b = 1;
		double b2 = (double) 1; // b와 b2는 같다. 자동으로 double로 변환됨.
		
		System.out.println(b);

//		int c = 1.1; // error
		double d = 1.1;
		int e = (int) 1.1;
		System.out.println(e); // 1
		
		// 1 to string
		String f = Integer.toString(1);
		System.out.println(f.getClass());
		
	}

}
