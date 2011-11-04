package AptStack;

import java.util.ArrayList;
import AptStack.configuration.Setting;

public abstract class Application{
	
	ArrayList<Setting> defaultSettings;
	ArrayList<Setting> settings;
	ArrayList<Module> modules;
	
	public Application(ArrayList<Module> modules, ArrayList<Setting> defaultSettings){
		this.defaultSettings = defaultSettings;
		this.modules = modules;
	}
	


}
