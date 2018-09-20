package com.localaccount.localaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages= {"com.localaccount"})
@EnableTransactionManagement
public class LocalaccountApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(LocalaccountApplication.class, args);
	}
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(LocalaccountApplication.class);
    }
}
