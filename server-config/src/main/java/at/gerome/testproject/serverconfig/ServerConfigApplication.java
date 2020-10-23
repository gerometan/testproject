package at.gerome.testproject.serverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
@EnableAutoConfiguration
public class ServerConfigApplication {

	public static void main(String[] args) {
		try{
			SpringApplication.run(ServerConfigApplication.class, args);
		}catch (Exception e){
			e.printStackTrace();
		}

	}

}
