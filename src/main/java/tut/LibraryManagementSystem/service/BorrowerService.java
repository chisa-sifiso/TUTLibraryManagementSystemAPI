package tut.LibraryManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tut.LibraryManagementSystem.model.Borrower;
import tut.LibraryManagementSystem.repository.BorrowerRepository;

import java.util.List;

@Service
public class BorrowerService {
    @Autowired
    private BorrowerRepository borrowerRepository;

    // Get all borrowers
    public List<Borrower> getAllBorrowers() {
        return borrowerRepository.findAll();
    }

    // Get a borrower by ID
    public Borrower getBorrowerById(Long id) {
        return borrowerRepository.findById(id).orElseThrow(() -> new RuntimeException("Borrower not found"));
    }

    // Save a new borrower
    public Borrower saveBorrower(Borrower borrower) {
        return borrowerRepository.save(borrower);
    }

    // Update a borrower by ID
    public Borrower updateBorrower(Long id, Borrower borrower) {
        borrower.setId(id);
        return borrowerRepository.save(borrower);
    }

    // Delete a borrower by ID
    public void deleteBorrower(Long id) {
        borrowerRepository.deleteById(id);
    }
}
