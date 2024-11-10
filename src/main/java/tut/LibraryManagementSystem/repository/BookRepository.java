package tut.LibraryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tut.LibraryManagementSystem.model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
