package com.springboot.SpringBootRestAPI.services;

import com.springboot.SpringBootRestAPI.entities.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookService {
    private static List<Book> list=new ArrayList<>();
    static {
        list.add(new Book(105,"Pyhton","Aall"));
        list.add(new Book(104,"C","aja"));
        list.add(new Book(155,"C++","yaya"));
    }
    public List<Book> getAllBooks(){
        return list;
    }
    public Book getBookById(Integer id) {
//        Book book=null;
//        book=list.stream()
//                .filter(a->a.getId()==id)
//                .findFirst()
//                .get();
//        return book;
        Book book = null;
        try {
            for (Book b : list) {
                if (b.getId() == id) {
                    book = b;
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return book;
    }

    public Book addBook(Book b){
        list.add(b);
        return b;
    }
    // delete book
    public void deleteBook(int bId){
//        list=list.stream()
//                .filter(e->{
//                    if (e.getId()!=bId){
//                        return true;
//                    }
//                    return false;
//                }).collect(Collectors.toList());
        List<Book> bookList=new ArrayList<>();
        for(Book b:list){
            if(b.getId()!=bId){
                bookList.add(b);
            }
        }
        list=bookList;
    }
    public void updateBook(Book book,int bookId){
//        list=list.stream()
//                .map(e->{
//                    if(e.getId()==bookId){
//                        e.setTitle(book.getTitle());
//                        e.setAuthor(book.getAuthor());
//                    }
//                    return e;
//                }).collect(Collectors.toList());
//    }
        for(Book b:list){
            if(b.getId()==bookId){
                b.setTitle(book.getTitle());
                b.setAuthor(book.getAuthor());
            }
        }

    }
}