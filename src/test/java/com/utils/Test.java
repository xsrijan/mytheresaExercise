package com.utils;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test {
	
	

	public static void main(String[] args) throws IOException {
		
		
		// TODO Auto-generated method stub
		findHyperlinks();

	}
	  public static void findHyperlinks() throws IOException
	    {
	    	
	    	
	    	System.out.println("Connecting");
	    	 Document doc = Jsoup.connect("https://github.com/appwrite/appwrite/pulls").get();  
	    	 String title = doc.title();  
	    	 System.out.println("Title description : " + title);
				/*
				 * Elements links = doc.select("a[href]");
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * String keywords = doc.select("meta[name=keywords]").first().attr("content");
				 * System.out.println("Meta keyword : " + keywords); String description =
				 * doc.select("meta[name=description]").get(0).attr("content");
				 * System.out.println("Meta description : " + description);
				 */
	    	
	    	
	    	
	    	
	    	
		
	    }
}
