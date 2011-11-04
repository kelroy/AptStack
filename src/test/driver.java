package test;

import AptStack.configuration.ini.INIIO;
import AptStack.exceptions.configuration.ErrorReadingINIFileException;

public class driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			INIIO iniio = new INIIO("config.ini");
		} catch (ErrorReadingINIFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
