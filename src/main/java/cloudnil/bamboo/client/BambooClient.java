package cloudnil.bamboo.client;

import cloudnil.bamboo.client.utils.BambooException;
import cloudnil.bamboo.client.utils.ModelUtils;
import feign.Feign;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.Response;
import feign.codec.ErrorDecoder;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
/**
 * <p>ClassName: BambooClient</p>
 * <p>Description: Bamboo REST接口的实例工具类</p>
 * @author 史绍虎
 * <p>Date: 2015-11-16 下午5:28:33</p>
 */
public class BambooClient {
	static class BambooHeadersInterceptor implements RequestInterceptor {
		@Override
		public void apply(RequestTemplate template) {
			template.header("Accept", "application/json");
			template.header("Content-Type", "application/json");
		}
	}

	static class BambooErrorDecoder implements ErrorDecoder {
		@Override
		public Exception decode(String methodKey, Response response) {
			return new BambooException(response.status(), response.reason());
		}
	}

	public static Bamboo getInstance(String endpoint) {
		JacksonDecoder decoder = ModelUtils.decoder();
		JacksonEncoder encoder = ModelUtils.encoder();
		return Feign.builder().encoder(encoder).decoder(decoder).errorDecoder(new BambooErrorDecoder())
				.requestInterceptor(new BambooHeadersInterceptor()).target(Bamboo.class, endpoint);
	}
}
