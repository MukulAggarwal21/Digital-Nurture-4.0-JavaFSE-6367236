import React from "react";

function BookDetails() {
  const books = [
    { id: 1, title: "React in Action", author: "Mark T." },
    { id: 2, title: "Learning JavaScript", author: "John D." },
    { id: 3, title: "Web Development", author: "Emma P." }
  ];

  return (
    <div>
      <h2>Book Details</h2>
      <ul>
        {books.map((book) => (
          <li key={book.id}>
            {book.title} by {book.author}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default BookDetails;
