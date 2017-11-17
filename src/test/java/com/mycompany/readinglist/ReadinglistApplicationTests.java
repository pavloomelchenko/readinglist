package com.mycompany.readinglist;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReadinglistApplicationTests {

	@Test
	public void contextLoads() {
	}


	public static void main(String[] args) {
		List<String> ss= Arrays.asList("1","2");

		System.out.println(ss.stream().map(s->s + " ").collect(Collectors.joining(",")));
	}

}
