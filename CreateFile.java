import java.io.*;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
//			  DataInputStream dis= new DataInputStream(System.in);
//		  FileOutputStream fout=new FileOutputStream("E://myjava.txt");
//	  
//		  BufferedOutputStream bout=new BufferedOutputStream(fout,1024);
//		  
//		  
		  
//		  System.out.println("Enter the data (@ at the end): ");
			  
			 int ch;
			  FileReader fr=null;
			  try {
				  fr=new FileReader("E://myjava.txt");
//				  System.out.println("File is Checked");
			  }catch(FileNotFoundException fe)
			  {
				  System.err.print("File is not found");
			  }
			  while((ch=fr.read())!=-1) {
//				  bout.write(ch);
				  System.out.print((char)ch);
		  }
			  
			  fr.close();
		  

	}

}
