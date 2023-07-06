import java.io.*;
public class FilesEx{
	public static void main(String args[]) throws IOException{
	DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\sivakumar.DESKTOP-G2TGA3C\\OneDrive\\Desktop\\text.txt"));
	
	DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\sivakumar.DESKTOP-G2TGA3C\\OneDrive\\Desktop\\text1.txt"));
	
	String count;
	while((count = dis.readLine()) !=null){
		String data = count.toUpperCase();
		System.out.println(data);
		dos.writeBytes(data+" ,");
      }
     dis.close();
     dos.close();
   }
}