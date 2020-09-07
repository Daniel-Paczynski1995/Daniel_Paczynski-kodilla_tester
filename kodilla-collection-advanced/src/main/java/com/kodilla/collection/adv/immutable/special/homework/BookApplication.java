package com.kodilla.collection.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookMenager bookMenager = new BookMenager();
        Book book1 = bookMenager.createBook("Zawod Tester", "Radoslaw Smiling");
        Book book2 = bookMenager.createBook("The Galaxy", "Isaac Asimov");
        Book book3 = bookMenager.createBook("Wory", "Mark Galeotti");
        Book book4 = bookMenager.createBook("Zawod Tester", "Radoslaw Smiling");

        if (book1 == book4)

            System.out.println("Adres jest taki sam");
        if (book1.equals(book4))
        System.out.println("Obiekty sa takie same");
    }
}