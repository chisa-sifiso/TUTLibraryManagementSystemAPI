
<body>
  <h1>📚 Library Management System</h1>
  <p>
    A Spring Boot REST API application for managing a library system. The application allows CRUD operations on 
    <strong>Authors</strong>, <strong>Books</strong>, <strong>Borrowers</strong>, and <strong>Loans</strong>.
    It provides functionality to manage library resources and borrowing/returning books.
  </p>

  <h2>✨ Features</h2>
  <ul>
    <li>Manage Authors (Create, Read, Delete)</li>
    <li>Manage Books (Create, Read, Update, Delete)</li>
    <li>Manage Borrowers (Create, Read, Update, Delete)</li>
    <li>Borrow and Return Books</li>
  </ul>

  <h2>🛠️ Setup Instructions</h2>

  <h3>Prerequisites</h3>
  <ul>
    <li>Java 11 or higher</li>
    <li>Spring Boot</li>
    <li>Postman or any HTTP client</li>
  </ul>

  <h3>Steps to Run</h3>
  <ol>
    <li>Open the project in your IDE (e.g., IntelliJ IDEA or Eclipse).</li>
    <li>Run the application:
      <pre><code>mvn spring-boot:run</code></pre>
    </li>
    <li>Access the H2 console at:
      <a href="http://localhost:8080/h2-console" target="_blank">http://localhost:8080/h2-console</a>.
    </li>
    <li>Use Postman or CURL to test the endpoints.</li>
  </ol>

  <h2>🔗 API Endpoints</h2>

  <h3>Authors</h3>
  <ul>
    <li>GET /api/authors - Get all authors</li>
    <li>POST /api/authors - Add a new author</li>
    <li>DELETE /api/authors/{id} - Delete an author by ID</li>
  </ul>

  <h3>Books</h3>
  <ul>
    <li>GET /api/books - Get all books</li>
    <li>POST /api/books - Add a new book</li>
    <li>PUT /api/books/{id} - Update an existing book</li>
    <li>DELETE /api/books/{id} - Delete a book by ID</li>
  </ul>

  <h3>Borrowers</h3>
  <ul>
    <li>GET /api/borrowers - Get all borrowers</li>
    <li>POST /api/borrowers - Add a new borrower</li>
    <li>PUT /api/borrowers/{id} - Update an existing borrower</li>
    <li>DELETE /api/borrowers/{id} - Delete a borrower by ID</li>
  </ul>

  <h3>Loans</h3>
  <ul>
    <li>GET /api/loans - Get all loans</li>
    <li>POST /api/loans - Borrow a book</li>
    <li>PUT /api/loans/{id}/return - Return a borrowed book</li>
    <li>DELETE /api/loans/{id} - Delete a loan by ID</li>
  </ul>

  <h2>💾 H2 Database Console</h2>
  <p>
    Access the H2 database console at:
    <a href="http://localhost:8080/h2-console" target="_blank">http://localhost:8080/h2-console</a>.
  </p>
  <p>
    Use the following credentials:
    <ul>
      <li>JDBC URL: <code>jdbc:h2:mem:librarydb</code></li>
      <li>Username: <code>sa</code></li>
      <li>Password: <code>password</code></li>
    </ul>
  </p>

  <h2>📄 License</h2>
  <p>This project is licensed under the MIT License.</p>

</body>
</html>
