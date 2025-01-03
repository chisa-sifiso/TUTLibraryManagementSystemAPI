package tut.LibraryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tut.LibraryManagementSystem.model.Author;
@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
