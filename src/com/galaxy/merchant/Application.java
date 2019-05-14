package com.galaxy.merchant;

import java.util.ArrayList;

public class Application {

	
	public static void main(String[] args) {
		
		Utility.println("Welcome to online input");
		
		Paragraph paragraph = new Paragraph();
		
		ArrayList<String> output=paragraph.read();
		
		for(int i=0;i<output.size();i++)
		{
			Utility.println(output.get(i));
		}
		
		
	}

}
