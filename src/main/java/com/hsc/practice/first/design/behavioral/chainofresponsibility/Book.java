package com.hsc.practice.first.design.behavioral.chainofresponsibility;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.chainofresponsibility.Book
 * @auther: 侯森川
 * @Date: 2020-6-23 17:00
 **/

public class Book {
    private String name;
    private String content;
    private String author;

    public Book(String name, String content, String author) {
        this.name = name;
        this.content = content;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
