package Assignment8;

import java.util.*;

public class BookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book b1 = new Book(101, "Java", "Nsnathan", 999);
        Book b2 = new Book(102, "Python", "Vinod Kumar", 999);
        Book b3 = new Book(103, "Linux", "Srikanta", 999);
        Book b4 = new Book(104, "SQL", "Raj", 999);

        ArrayList<Book> b = new ArrayList<>();

        // Addition
        b.add(b1);
        b.add(b2);
        b.add(b3);
        b.add(b4);

        // Display All Books
        System.out.println("----- All Books -----");

        for (Book ele : b) {
            ele.displayBook();
        }

        System.out.println("Total Number of Books: " + b.size());

        // Search Book By ID
        System.out.println("\nEnter the Book ID to Search:");
        int id = sc.nextInt();

        boolean search = false;

        for (Book ele : b) {
            if (ele.bookId == id) {
                ele.displayBook();
                search = true;
                break;
            }
        }

        if (!search) {
            System.out.println("Book was Not Found with ID " + id);
        }

        // Update Book Price
        System.out.println("\nEnter the Book ID to Update:");
        int idu = sc.nextInt();

        boolean update = false;

        for (Book ele : b) {
            if (ele.bookId == idu) {

                System.out.println("Enter the Updated Price:");
                double price = sc.nextDouble();

                ele.price = price;

                System.out.println("Book Updated Successfully!");
                ele.displayBook();

                update = true;
                break;
            }
        }

        if (!update) {
            System.out.println("Book was Not Found with ID " + idu);
        }

        // Delete Book
        System.out.println("\nEnter the Book ID to Delete:");
        int idd = sc.nextInt();

        boolean delete = false;

        for (int i = 0; i < b.size(); i++) {

            if (b.get(i).bookId == idd) {

                b.remove(i);

                System.out.println("Book Deleted Successfully!");

                delete = true;
                break;
            }
        }

        if (!delete) {
            System.out.println("Book was Not Found with ID " + idd);
        }

        // Display Remaining Books
        System.out.println("\n----- Remaining Books -----");

        for (Book ele : b) {
            ele.displayBook();
        }

        System.out.println("Total Number of Books Present: " + b.size());

        sc.close();
    }
}
