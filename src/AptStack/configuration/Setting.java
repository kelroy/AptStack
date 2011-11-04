package AptStack.configuration;

public class Setting<T> {
	
	private String tag;
	private T value;
	boolean configurable;
	
	public Setting(){}
	public Setting(String tag, T value, boolean configurable){
		this.tag = tag;
		this.value = value;
		this.configurable = configurable;
	}
	
	
	
}
