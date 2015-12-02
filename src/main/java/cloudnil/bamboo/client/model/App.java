package cloudnil.bamboo.client.model;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import cloudnil.bamboo.client.utils.ModelUtils;

import com.fasterxml.jackson.annotation.JsonProperty;

public class App {
	@JsonProperty("Id")
	private String id;
	@JsonProperty("EscapedId")
	private String escapedId;
	@JsonProperty("HealthCheckPath")
	private String healthCheckPath;
	@JsonProperty("Tasks")
	private List<Task> tasks;
	@JsonProperty("ServicePort")
	private Integer servicePort;
	@JsonProperty("ServicePorts")
	private Collection<Integer> servicePorts;
	@JsonProperty("Env")
	private Map<String,String> env;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEscapedId() {
		return escapedId;
	}

	public void setEscapedId(String escapedId) {
		this.escapedId = escapedId;
	}

	public String getHealthCheckPath() {
		return healthCheckPath;
	}

	public void setHealthCheckPath(String healthCheckPath) {
		this.healthCheckPath = healthCheckPath;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public Integer getServicePort() {
		return servicePort;
	}

	public void setServicePort(Integer servicePort) {
		this.servicePort = servicePort;
	}

	public Collection<Integer> getServicePorts() {
		return servicePorts;
	}

	public void setServicePorts(Collection<Integer> servicePorts) {
		this.servicePorts = servicePorts;
	}

	public Map<String, String> getEnv() {
		return env;
	}

	public void setEnv(Map<String, String> env) {
		this.env = env;
	}
	
	@Override
	public String toString() {
		return ModelUtils.toString(this);
	}
}