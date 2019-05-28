import java.io.File;

public class Exercise_4 {
public static void main(String[] args) {
	File file=new File("temp.txt");
	System.out.println("File exists: "+file.exists());
	System.out.println("File is readable: "+file.canRead());
	System.out.println("File is writable: "+file.canWrite());
	System.out.println("Is a directory: "+file.isDirectory());
	System.out.println("Is a file: "+file.isFile());
	System.out.println("length of the file: "+file.length()+" bytes");
}
}
