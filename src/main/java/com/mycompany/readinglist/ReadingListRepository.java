package com.mycompany.readinglist;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by pomel on 9/27/2017.
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {
	List<Book> findByReader(String reader);
}
