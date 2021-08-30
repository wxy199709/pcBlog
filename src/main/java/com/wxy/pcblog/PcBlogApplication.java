package com.wxy.pcblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.wxy.pcblog.mapper")
public class PcBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcBlogApplication.class, args);
	}

}
