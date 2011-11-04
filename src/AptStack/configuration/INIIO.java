package AptStack.configuration;

import java.io.File;
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
				this.loadFile();
			}
		} catch (IOException e) {
			throw new ErrorReadingINIFileException();
		}
	}
	
	private void writeHeader(){
		
	}
	
	private void loadFile(){
		
	}
	
	private void setHeader(){
		FileLine pointer = new FileLine("#############################################################################################################################################");
		this.header = pointer;
		pointer.nextLine = new FileLine("# Application Configuration                                                                                                                 #");
		pointer = pointer.nextLine;
		
		
		while(pointer.nextLine != null){
			System.out.println(pointer.line);
			pointer = pointer.nextLine;
		}
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
