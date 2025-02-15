package tut.LibraryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tut.LibraryManagementSystem.model.Borrower;
@Repository
public interface BorrowerRepository extends JpaRepository<Borrower, Long> {
}
