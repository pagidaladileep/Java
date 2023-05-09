
public class Demo_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Open Files");
			int n=args.length;
			System.out.println(n);
			int a=45/n;
			System.out.println("a= "+a);
			int b[]= {10,20,30};
			b[50]=100;
			
		}catch(ArithmeticException ae) {
			System.out.println(ae);
			System.out.println("Please pass data while running this program");
		}
		catch (ArrayIndexOutOfBoundsException aie) {
			// TODO: handle exception
			aie.printStackTrace();
			System.out.println("Please see that the array index is within the range");
		}
		finally {
			System.out.println("Close the file");
		}

	}

}
