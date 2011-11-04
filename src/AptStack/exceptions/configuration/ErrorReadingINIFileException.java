package AptStack.exceptions.configuration;

public class ErrorReadingINIFileException extends Exception{

private String message;
	
	public ErrorReadingINIFileException(){
		super();
		String message = "Failed to read/load config file.";
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
