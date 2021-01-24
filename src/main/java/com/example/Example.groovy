package com.example

import com.example.lib.Book

class Example {
    static void main(String[] args) {
        Book book = new Book(title: 'Romeo and Juliet')

        String title = book.getTitle()

        println(title)
    }
}
