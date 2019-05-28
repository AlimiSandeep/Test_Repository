

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise_2 {
public static void main(String[] args) throws IOException {
	File file=new File("temp.txt");
	FileWriter fw=new FileWriter(file);
	fw.write("Hello\n");
	fw.write("Good\n");
	fw.write("Morning");
	
	fw.close();
	FileReader fr=new FileReader(file);
	BufferedReader br=new BufferedReader(fr);
	String str=null;
	int lines=1;
	while((str=br.readLine())!=null)
	{
		System.out.println(lines+" "+str);
		lines++;
	}
	br.close();
}
}
