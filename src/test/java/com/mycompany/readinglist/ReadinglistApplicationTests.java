package com.mycompany.readinglist;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {ReadinglistApplication.class})
public class ReadinglistApplicationTests {

	@Autowired
	ReadingListRepository readingListRepository;


	public void contextLoads() {
	}

	@Test
	public void test() {
		assertNotNull(readingListRepository);
		Book book = new Book();
		book.setAuthor("Pavel");
		readingListRepository.save(book);


		List<Book> loaded = readingListRepository.findAll();
		assertEquals("Pavel", loaded.get(0).getAuthor());
		assertNotNull("Create date should be generated", loaded.get(0).getCreatedDate());
		assertNotNull("Modified date should be generated", loaded.get(0).getModifiedDate());
	}


	public static void main(String[] args) {
		List<String> ss = Arrays.asList("1", "2");

		System.out.println(ss.stream().map(s -> s + " ").collect(Collectors.joining(",")));
	}

}
