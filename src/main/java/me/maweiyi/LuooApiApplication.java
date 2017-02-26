package me.maweiyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@MapperScan("me.maweiyi.mapper")
public class LuooApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuooApiApplication.class, args);
	}
}
