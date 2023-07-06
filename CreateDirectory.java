import java.io.*;
public class CreateDirectory{
	public static void main(String[] args){
		String dir = "C:/Users/sivakumar.DESKTOP-G2TGA3C/OneDrive/Desktop/text";
		File f = new File(dir);
		f.mkdirs();
		System.out.println("The Directory is Created...!!!");
   }
}