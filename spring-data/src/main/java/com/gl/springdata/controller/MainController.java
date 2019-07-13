package com.gl.springdata.controller;

import com.gl.springdata.model.Author;
import com.gl.springdata.repository.AuthorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private AuthorRepository authorRepository;

    @PostMapping("/save")
    public Author addAuthor(@RequestBody Author author){
        return authorRepository.save(author);
    }

    @GetMapping
    public Author getAuthor(){
        return new Author();
    }
}
