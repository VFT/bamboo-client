package cloudnil.bamboo.client;
import java.util.Map;

import cloudnil.bamboo.client.model.Service;
import cloudnil.bamboo.client.model.State;
import feign.Param;
import feign.RequestLine;
/**
 * <p>ClassName: Bamboo</p>
 * <p>Description: Bamboo REST接口</p>
 * @author 史绍虎
 * <p>Date: 2015-11-16 下午5:27:40</p>
 */
public interface Bamboo {
	/**
	 * <p>MethodName: getState</p>
	 * <p>Description: 获取全部应用及服务</p>
	 * @return State[Json]
	 */
	@RequestLine("GET /api/state")
	State getState();
	/**
	 * <p>MethodName: getServices</p>
	 * <p>Description: 获取服务列表</p>
	 * @return Map<String,Service>
	 */
	@RequestLine("GET /api/services")
	Map<String,Service> getServices();
	/**
	 * <p>MethodName: createService</p>
	 * <p>Description: 创建路由服务</p>
	 * @param Service
	 * @return Service
	 */
	@RequestLine("POST /api/services")
	Service createService(Service service);
	/**
	 * <p>MethodName: modifyService</p>
	 * <p>Description: 修改路由服务</p>
	 * @param id
	 * @param Service
	 */
	@RequestLine("PUT /api/services/{id}")
	Service bindService(@Param("id")String id,Service service);
	/**
	 * <p>MethodName: removeService</p>
	 * <p>Description: 移除对应应用的路由服务</p>
	 * @param id
	 */
	@RequestLine("DELETE /api/services/{id}")
	void removeService(@Param("id") String id);
	/**
	 * <p>MethodName: getStatus</p>
	 * <p>Description: 查看bamboo服务的运行状态</p>
	 * @return OK
	 */
//	@RequestLine("GET /status")
//	String getStatus();
}
