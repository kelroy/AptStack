package AptStack.configuration.ini;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import AptStack.exceptions.configuration.*;

public class INIIO{
	
	File file;
	
	FileLine lines;
	FileLine header;
	
	public INIIO(String fileName) throws ErrorReadingINIFileException{
		this.file = new File(fileName);
		
		try {
			if(this.file.createNewFile()){
				this.setHeader();
				this.writeHeader();
			}else{
				System.out.println(this.file.getAbsolutePath());
				this.loadFile();
			}
		} catch (IOException e) {
			throw new ErrorReadingINIFileException();
		}
	}
	
	private void writeHeader(){
		try {
			FileLine pointer = header;
			BufferedWriter out = new BufferedWriter(new FileWriter(this.file));
			while(pointer != null){
				out.write(pointer.line);
				System.out.println(pointer.line);
				out.newLine();
				pointer = pointer.nextLine;
			}
			out.close();
		}catch (IOException e){}
	}
	
	private void loadFile(){
		
	}
	
	private void setHeader(){
		FileLine pointer = new FileLine("#############################################################################################################################################");
		this.header = pointer;
		
		pointer.nextLine = new FileLine("# Application Configuration                                                                                                                 #");
		pointer = pointer.nextLine;
		pointer.nextLine = new FileLine("#                                                                                                                                           #");
		pointer = pointer.nextLine;
		pointer.nextLine = new FileLine("# Santax:                                                                                                                                   #");
		pointer = pointer.nextLine;
		pointer.nextLine = new FileLine("#    Pound symbol \"#\" acts as a single line comment                                                                                         #");
		pointer = pointer.nextLine;
		pointer.nextLine = new FileLine("#    equal sign \"=\" defines an attribute and its associated value                                                                           #");
		pointer = pointer.nextLine;	
		pointer.nextLine = new FileLine("#    lines containing no \"=\" and or no no associated value represent Widget headers or names                                                #");
		pointer = pointer.nextLine;		
		pointer.nextLine = new FileLine("#    lines containing no \"=\" and or no no associated value and a colon \":\" followed by the name represent an attribute list or collection.  #");
		pointer = pointer.nextLine;		
		pointer.nextLine = new FileLine("#    lists are delimited and terminated by whitespace e.g., spaces, tabs, ect.                                                              #");
		pointer = pointer.nextLine;		
		pointer.nextLine = new FileLine("#    backslash \"/\" is the escape character if special characters are required in strings                                                    #");
		pointer = pointer.nextLine;
		pointer.nextLine = new FileLine("#                                                                                                                                           #");
		pointer = pointer.nextLine;		
		pointer.nextLine = new FileLine("#                                                                                                                                           #");
		pointer = pointer.nextLine;		
		pointer.nextLine = new FileLine("#############################################################################################################################################");
	}
	
	private class FileLine{
		private String line;
		private FileLine nextLine;
		
		private FileLine(){}
		private FileLine(String line){
			this.line = line;
		}
		
	}
	
	

}