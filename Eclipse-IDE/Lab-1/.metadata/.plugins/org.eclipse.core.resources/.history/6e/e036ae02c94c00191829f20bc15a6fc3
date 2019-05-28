package com.cg.vo;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {
	private static Map<String,Item> imap;
	
	
	static
	{
		imap=new HashMap<>();
		imap.put("book", new Book());
		imap.put("journal", new JournalPaper());
		imap.put("video", new Video());
		imap.put("cd", new CD());
		
		
		
		
	}
public static Item getItem(String str)
{
	return imap.get(str);
}


}
