package org.springframework.boot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.app.swagger.SwaggerConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

//Prueba
@EnableDiscoveryClient 
@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaServer
@Import(SwaggerConfiguration.class)
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
 
           registry.addResourceHandler("swagger-ui.html")
                    .addResourceLocations("classpath:/META-INF/resources/");
 
    }
}
