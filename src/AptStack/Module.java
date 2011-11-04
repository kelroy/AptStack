package AptStack;

import java.util.ArrayList;
import AptStack.configuration.Setting;

public abstract class Module{
	
	private String name;
	private String author;
	private String verson;
	private ArrayList<Setting> defaultSettings;
	private ArrayList<Setting> settings;
	
	protected Module(){}
	protected Module(String name, String author, String verson){
		this.name = name;
		this.author = author;
		this.verson = verson;
	}
}
