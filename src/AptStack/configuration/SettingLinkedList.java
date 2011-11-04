package AptStack.configuration;

public class SettingLinkedList{
	
	private Setting setting;
	private Setting nextSetting;
	
	public SettingLinkedList(){}
	public SettingLinkedList(Setting setting, Setting nextSetting){
		this.setting = setting;
		this.nextSetting = nextSetting;
	}

	public Setting getSetting() {
		return setting;
	}

	public void setSetting(Setting setting) {
		this.setting = setting;
	}

	public Setting getNextSetting() {
		return nextSetting;
	}

	public void setNextSetting(Setting nextSetting) {
		this.nextSetting = nextSetting;
	}
	
	
	
}
