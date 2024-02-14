package com.rfaeljr.bookstoremanager.repository;

import com.rfaeljr.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
