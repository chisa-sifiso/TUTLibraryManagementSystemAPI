package tut.LibraryManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tut.LibraryManagementSystem.model.Loan;
import tut.LibraryManagementSystem.service.LoanService;

import java.util.List;
@RestController
@RequestMapping("/api/loans")
public class LoanController {
    @Autowired
    private LoanService loanService;

    @GetMapping
    public List<Loan> getAllLoans() {
        return loanService.getAllLoans();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Loan> getLoanById(@PathVariable Long id) {
        Loan loan = loanService.getLoanById(id);
        return new ResponseEntity<>(loan, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Loan> borrowBook(@RequestBody Loan loan) {
        return new ResponseEntity<>(loanService.borrowBook(loan), HttpStatus.CREATED);
    }

    @PutMapping("/{id}/return")
    public ResponseEntity<Loan> returnBook(@PathVariable Long id) {
        return new ResponseEntity<>(loanService.returnBook(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLoan(@PathVariable Long id) {
        loanService.deleteLoan(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
