package com.library.services;

import java.util.*;
import com.library.models.*;

public class LibraryService {

    private final Map<Category, List<Book>> library = new HashMap<>();

    public LibraryService() {
        loadBooks();
    }

    public List<Book> getBooksByCategory(Category category) {
        return library.get(category);
    }

    private void loadBooks() {

        library.put(Category.BUSINESS, Arrays.asList(
            new Book("Rich Dad Poor Dad", "Robert Kiyosaki", Category.BUSINESS),
            new Book("The Lean Startup", "Eric Ries", Category.BUSINESS),
            new Book("Zero to One", "Peter Thiel", Category.BUSINESS),
            new Book("Good to Great", "Jim Collins", Category.BUSINESS),
            new Book("Think and Grow Rich", "Napoleon Hill", Category.BUSINESS),
            new Book("The 4-Hour Workweek", "Tim Ferriss", Category.BUSINESS),
            new Book("The E-Myth Revisited", "Michael Gerber", Category.BUSINESS),
            new Book("The Intelligent Investor", "Benjamin Graham", Category.BUSINESS),
            new Book("Blue Ocean Strategy", "W. Chan Kim", Category.BUSINESS),
            new Book("Start With Why", "Simon Sinek", Category.BUSINESS)
        ));

        library.put(Category.PSYCHOLOGY, Arrays.asList(
            new Book("Thinking, Fast and Slow", "Daniel Kahneman", Category.PSYCHOLOGY),
            new Book("Influence", "Robert Cialdini", Category.PSYCHOLOGY),
            new Book("Man’s Search for Meaning", "Viktor Frankl", Category.PSYCHOLOGY),
            new Book("The Power of Habit", "Charles Duhigg", Category.PSYCHOLOGY),
            new Book("Behave", "Robert Sapolsky", Category.PSYCHOLOGY),
            new Book("Grit", "Angela Duckworth", Category.PSYCHOLOGY),
            new Book("Emotional Intelligence", "Daniel Goleman", Category.PSYCHOLOGY),
            new Book("Flow", "Mihaly Csikszentmihalyi", Category.PSYCHOLOGY),
            new Book("Atomic Habits", "James Clear", Category.PSYCHOLOGY),
            new Book("The Paradox of Choice", "Barry Schwartz", Category.PSYCHOLOGY)
        ));

        library.put(Category.SCIENCE, Arrays.asList(
            new Book("A Brief History of Time", "Stephen Hawking", Category.SCIENCE),
            new Book("The Selfish Gene", "Richard Dawkins", Category.SCIENCE),
            new Book("The Gene", "Siddhartha Mukherjee", Category.SCIENCE),
            new Book("The Innovators", "Walter Isaacson", Category.SCIENCE),
            new Book("Astrophysics for People in a Hurry", "Neil deGrasse Tyson", Category.SCIENCE),
            new Book("The Emperor of All Maladies", "Siddhartha Mukherjee", Category.SCIENCE),
            new Book("Surely You’re Joking, Mr. Feynman!", "Richard Feynman", Category.SCIENCE),
            new Book("The Code Breaker", "Walter Isaacson", Category.SCIENCE),
            new Book("The Body", "Bill Bryson", Category.SCIENCE),
            new Book("Life 3.0", "Max Tegmark", Category.SCIENCE)
        ));

        library.put(Category.SELF_HELP, Arrays.asList(
            new Book("How to Win Friends", "Dale Carnegie", Category.SELF_HELP),
            new Book("7 Habits of Highly Effective People", "Stephen Covey", Category.SELF_HELP),
            new Book("The Power of Now", "Eckhart Tolle", Category.SELF_HELP),
            new Book("Think and Grow Rich", "Napoleon Hill", Category.SELF_HELP),
            new Book("You Are a Badass", "Jen Sincero", Category.SELF_HELP),
            new Book("Mindset", "Carol Dweck", Category.SELF_HELP),
            new Book("Grit", "Angela Duckworth", Category.SELF_HELP),
            new Book("The Four Agreements", "Don Miguel Ruiz", Category.SELF_HELP),
            new Book("Deep Work", "Cal Newport", Category.SELF_HELP),
            new Book("Miracle Morning", "Hal Elrod", Category.SELF_HELP)
        ));
    }
}
