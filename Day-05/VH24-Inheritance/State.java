package com.Da5.Multiinh;

public class State extends Country {
	
	private String statename;
	private String language;
	
	//getter-setter
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	//Tostring(inherited methods-check on it)
	@Override
	public String toString() {
		return "State [statename=" + statename + ", language=" + language + ", getCountryname()=" + getCountryname()
				+ ", getCapital()=" + getCapital() + "]";
	}
	
	
	
	
	
	

}
