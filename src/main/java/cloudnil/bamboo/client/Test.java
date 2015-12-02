package cloudnil.bamboo.client;

import cloudnil.bamboo.client.model.Service;

public class Test {

	/**
	 * <p>MethodName: main</p>
	 * <p>Description: (这里用一句话描述这个方法的作用)</p>
	 * @param args
	 */
	public static void main(String[] args) {
		Bamboo b=BambooClient.getInstance("http://192.168.2.91:8000");
		Service service=new Service();
		service.setId("/2553e9c8-820f-11e5-9a33-8c89a50daed8/meikj2grev");
		service.setAcl("hdr(host) -i tiger2.justpaas.com");
		b.bindService("/2553e9c8-820f-11e5-9a33-8c89a50daed8/meikj2grev",service);
	}

}
