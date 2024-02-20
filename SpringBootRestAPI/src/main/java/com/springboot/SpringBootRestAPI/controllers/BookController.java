package com.springboot.SpringBootRestAPI.controllers;

import com.springboot.SpringBootRestAPI.entities.Book;
import com.springboot.SpringBootRestAPI.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
//    @RequestMapping(value = "/books",method = RequestMethod.GET)
//    @GetMapping("/books")
//    public Book getBooks(){
//        Book book=new Book();
//        book.setId(101);
//        book.setAuthor("Hero's");
//        book.setTitle("Full Course");
//        return book;
    @Autowired
    private BookService bookService;
    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks(){
        List<Book> list=bookService.getAllBooks();
        if(list.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }
//    @RequestMapping(value = "/books/{id}",method=RequestMethod.GET)
    @GetMapping(value="/books/{id}")
    public ResponseEntity<Book> getBook(@PathVariable("id") int id){
        Book book=bookService.getBookById(id);
        if(book==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
    }
    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        Book b=this.bookService.addBook(book);
            System.out.println(book);
            return b;
    }

    @DeleteMapping("/books/{bookId}")
    public void deleteBook(@PathVariable("bookId") int bookId){
        try {
            this.bookService.deleteBook(bookId);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @PutMapping("/books/{booksId}")
    public void updateBook(@RequestBody Book book,@PathVariable("booksId") int bookId){
        this.bookService.updateBook(book,bookId);
    }


}
