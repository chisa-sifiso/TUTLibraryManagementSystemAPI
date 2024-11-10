package tut.LibraryManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tut.LibraryManagementSystem.model.Borrower;
import tut.LibraryManagementSystem.service.BorrowerService;

import java.util.List;
@RestController
@RequestMapping("/api/borrowers")

public class BorrowerController {
    @Autowired
    private BorrowerService borrowerService;

    @GetMapping
    public List<Borrower> getAllBorrowers() {
        return borrowerService.getAllBorrowers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Borrower> getBorrowerById(@PathVariable Long id) {
        Borrower borrower = borrowerService.getBorrowerById(id);
        return new ResponseEntity<>(borrower, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Borrower> saveBorrower(@RequestBody Borrower borrower) {
        return new ResponseEntity<>(borrowerService.saveBorrower(borrower), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Borrower> updateBorrower(@PathVariable Long id, @RequestBody Borrower borrower) {
        return new ResponseEntity<>(borrowerService.updateBorrower(id, borrower), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBorrower(@PathVariable Long id) {
        borrowerService.deleteBorrower(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
