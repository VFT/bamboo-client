package cloudnil.bamboo.client.model;

import java.util.Collection;

import cloudnil.bamboo.client.utils.ModelUtils;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Task {
	@JsonProperty("Host")
	private String host;
	@JsonProperty("Port")
	private Integer port;
	@JsonProperty("Ports")
	private Collection<Integer> ports;
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public Collection<Integer> getPorts() {
		return ports;
	}
	public void setPorts(Collection<Integer> ports) {
		this.ports = ports;
	}
	@Override
	public String toString() {
		return ModelUtils.toString(this);
	}
}
