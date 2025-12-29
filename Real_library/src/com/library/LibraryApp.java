package com.library;

import java.util.*;
import com.library.models.Book;
import com.library.models.Category;
import com.library.services.LibraryService;
import com.library.utils.InputHelper;

public class LibraryApp {

    public static void main(String[] args) {

        LibraryService libraryService = new LibraryService();

        System.out.println("\n📚 Welcome to the Virtual Library!\n");

        while (true) {
            System.out.println("Select a category:");
            Category[] categories = Category.values();
            for (int i = 0; i < categories.length; i++) {
                System.out.println((i + 1) + ". " + categories[i].getName());
            }
            System.out.println((categories.length + 1) + ". Exit");

            int choice = InputHelper.getIntInput(1, categories.length + 1);

            if (choice == categories.length + 1) {
                System.out.println("Thank you for visiting!");
                break;
            }

            Category selected = categories[choice - 1];
            browseCategory(libraryService, selected);
        }
    }

    private static void browseCategory(LibraryService libraryService, Category category) {
        List<Book> books = libraryService.getBooksByCategory(category);

        while (true) {
            System.out.println("\n📖 Books in " + category.getName() + ":");
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
            System.out.println((books.size() + 1) + ". Back");

            int choice = InputHelper.getIntInput(1, books.size() + 1);

            if (choice == books.size() + 1) return;

            Book book = books.get(choice - 1);
            if (!book.isIssued()) {
                book.setIssued(true);
                System.out.println("✅ Book issued: " + book.getTitle());
            } else {
                System.out.println("❌ Book already issued.");
            }
        }
    }
}
