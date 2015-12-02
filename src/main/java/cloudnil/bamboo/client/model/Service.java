package cloudnil.bamboo.client.model;

import cloudnil.bamboo.client.utils.ModelUtils;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Service {
	@JsonProperty("Id")
	private String id;
	@JsonProperty("Acl")
	private String acl;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAcl() {
		return acl;
	}
	public void setAcl(String acl) {
		this.acl = acl;
	}
	@Override
	public String toString() {
		return ModelUtils.toString(this);
	}
}
