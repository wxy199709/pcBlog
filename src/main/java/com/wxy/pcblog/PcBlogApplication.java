package com.wxy.pcblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(value = "com.wxy.pcblog.mapper")
@EnableCaching
public class PcBlogApplication {



	public static void main(String[] args) {
		SpringApplication.run(PcBlogApplication.class, args);
	}

}
