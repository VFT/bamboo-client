package cloudnil.bamboo.client.model;

import java.util.List;
import java.util.Map;

import cloudnil.bamboo.client.utils.ModelUtils;

import com.fasterxml.jackson.annotation.JsonProperty;

public class State {
	@JsonProperty("Apps")
	private List<App> apps;
	@JsonProperty("Services")
	private Map<String,Object> services;
	public List<App> getApps() {
		return apps;
	}
	public void setApps(List<App> apps) {
		this.apps = apps;
	}
	public Map<String,Object> getServices() {
		return services;
	}
	public void setServices(Map<String,Object> services) {
		this.services = services;
	}
	@Override
	public String toString() {
		return ModelUtils.toString(this);
	}
}
