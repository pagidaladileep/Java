import java.util.Scanner;
public class ArrayUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[]= {1,2,3,4,5};
//		System.out.println(a.length);
//		
//		System.out.println(a[0]);
//		a[6]=15;
		Scanner in=new Scanner(System.in);
        System.out.print("Enter the Size of an Array: ");
        int size=in.nextInt();
        
        int arr[]=new int[size];
        
        for(int i=0;i<size;i++)
        {
        	System.out.print("Enter the value of "+i+"th index: ");
        	arr[i]=in.nextInt();
        }
        
        for(int i=0;i<size;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        
//        int arr[]=new int[8];

	}

}
