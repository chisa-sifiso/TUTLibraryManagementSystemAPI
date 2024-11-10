package tut.LibraryManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tut.LibraryManagementSystem.model.Book;
import tut.LibraryManagementSystem.model.Loan;
import tut.LibraryManagementSystem.repository.BookRepository;
import tut.LibraryManagementSystem.repository.LoanRepository;

import java.time.LocalDate;
import java.util.List;
@Service
public class LoanService {
    @Autowired
    private LoanRepository loanRepository;

    @Autowired
    private BookRepository bookRepository;

    // Get all loans
    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

    // Get a loan by ID
    public Loan getLoanById(Long id) {
        return loanRepository.findById(id).orElseThrow(() -> new RuntimeException("Loan not found"));
    }

    // Borrow a book (Create a loan)
    public Loan borrowBook(Loan loan) {
        Book book = loan.getBook();
        if (!book.isAvailable()) {
            throw new RuntimeException("Book is not available for borrowing");
        }

        book.setAvailable(false); // Mark the book as borrowed
        loan.setBorrowDate(LocalDate.now());
        loan.setReturnDate(null);

        bookRepository.save(book); // Update book availability
        return loanRepository.save(loan);
    }

    // Return a book
    public Loan returnBook(Long loanId) {
        Loan loan = loanRepository.findById(loanId).orElseThrow(() -> new RuntimeException("Loan not found"));

        Book book = loan.getBook();
        book.setAvailable(true); // Mark the book as available

        loan.setReturnDate(LocalDate.now());

        bookRepository.save(book); // Update book availability
        return loanRepository.save(loan);
    }

    // Delete a loan by ID
    public void deleteLoan(Long id) {
        loanRepository.deleteById(id);
    }
}
