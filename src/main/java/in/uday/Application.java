package in.uday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.uday.service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ct = SpringApplication.run(Application.class, args);
		EmpService as = ct.getBean(EmpService.class);
		as.saveemp();
	}

}
