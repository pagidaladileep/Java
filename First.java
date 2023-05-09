
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	 int a=10;
	 try {
		int n=10/0;
			System.out.println(n); 
		 }
	 catch (ArithmeticException e) {
		// TODO: handle exception
		 e.printStackTrace();
			System.err.println("Hey Give this a value in float if it is not showing any decimal ");
	}
	
//        System.out.println(a);
	}

}
