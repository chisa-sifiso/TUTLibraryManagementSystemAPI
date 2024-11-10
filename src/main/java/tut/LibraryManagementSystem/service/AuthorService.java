package tut.LibraryManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tut.LibraryManagementSystem.model.Author;
import tut.LibraryManagementSystem.repository.AuthorRepository;

import java.util.List;
@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author getAuthorById(Long id) {
        return authorRepository.findById(id).orElseThrow(() -> new RuntimeException("Author not found"));
    }

    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}