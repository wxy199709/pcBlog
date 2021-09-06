package com.wxy.pcblog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.Date;

@SpringBootTest
class PcBlogApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	Long getID(){
		Long id=214312421L;



		return id;
	}

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(new Date());
		System.out.println(calendar.getTime());
	}
}
