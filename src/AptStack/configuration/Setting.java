package AptStack.configuration;

public class Setting<T> {
	
	private String tag;
	private T value;
	private boolean configurable;
	
	public Setting(){}
	public Setting(String tag, T value, boolean configurable){
		this.tag = tag;
		this.value = value;
		this.configurable = configurable;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public boolean isConfigurable() {
		return configurable;
	}
	public void setConfigurable(boolean configurable) {
		this.configurable = configurable;
	}
	
	
	
}
