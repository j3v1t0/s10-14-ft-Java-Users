package s1014ftjavaangular.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.netflix.eureka.EurekaClientConfigBean;
import org.springframework.context.annotation.Bean;

import java.util.Map;

@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

/*	@Bean
	public EurekaClientConfigBean eurekaInstanceConfig(InetUtils inetUtils) {
		var config = new EurekaClientConfigBean();
		config.setServiceUrl(Map.of("defaultZone", "https://s10-14-ft-eurekaserver.azurewebsites.net/eureka"));
		//config.setServiceUrl(Map.of("defaultZone", "http://localhost:8761/eureka"));

		return config;
	}*/
}
