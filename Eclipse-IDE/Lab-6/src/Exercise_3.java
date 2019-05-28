

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise_3 {
	
	
public static void main(String[] args) throws IOException {
	FileReader file=new FileReader("temp.txt");
	BufferedReader br=new BufferedReader(file);
	String str=null;
	int lines=0,words=0,characters=0;
	while((str=br.readLine())!=null)
	{
		lines++;
		String word[]=str.split("\\s");
		words+=word.length;
		
		for(String temp:word)
		{
			characters+=temp.length();
		}
		
		
	}
	System.out.println("Lines="+lines);
	System.out.println("Words="+words);
	System.out.println("Characters="+characters);
	
			
			
			
	br.close();
	file.close();
	
}
}
