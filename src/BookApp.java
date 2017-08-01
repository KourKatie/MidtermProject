/**
 * Created by Katie on 7/31/2017.
 */

<<<<<<< HEAD
import com.sun.org.apache.xpath.internal.SourceTree;

=======
import java.util.Date;
>>>>>>> 9b6ba8d715023383906824e633f18c4b74edeab1
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class BookApp {

    public static void main(String[] args) {

        ArrayList<Book> bookList = readFile("./booklist.txt");
        if (bookList == null) {
            System.out.println("Issue with file... closing");
            return;
        }

<<<<<<< HEAD
        //now I have a filled ArrayList of Cars
        //  at least in theory...

        //now do the rest of your program using this list

        //output this list
        //enhanced for (foreach) to go through list
        for (Book b : bookList) {
            //toString does the formatting
            System.out.println(b);
        }

=======
>>>>>>> 9b6ba8d715023383906824e633f18c4b74edeab1
        int choice = 0;
        int reset = 0;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to Stanton Island's Public Library!");

        do {
            System.out.println("Main Menu");
            System.out.println("1 - Library Directory");
            System.out.println("2 - Search");
            System.out.println("3 - Return Book");
            System.out.print("Enter menu number: ");
            choice = scnr.nextInt();
            scnr.nextLine();

            int i;
            switch (choice) {
                case 1:
                    System.out.println("Library Directory");
                    for (i = 0; i < bookList.size(); i++) {
<<<<<<< HEAD
                        System.out.println(bookList.get(i) + "\t");
=======
                        System.out.println(bookList.get(i));
>>>>>>> 9b6ba8d715023383906824e633f18c4b74edeab1
                    }
                    System.out.println("\nPlease enter the book ID for the book you would like to checkout: ");
                    int selection = scnr.nextInt();
                    selection = selection - 101;
<<<<<<< HEAD

=======
                    //if (selection == (i)) {
                    //  System.out.println("You selected to check out Book ID " + books.get(selection));
                    // }
>>>>>>> 9b6ba8d715023383906824e633f18c4b74edeab1
                    System.out.println("Congratulations you just checked out " + "'" + bookList.get(selection).getTitle()
                            + "'" + "," + " it is due " + Book.dueDateMethod() + ".");

                    // Updates status and adds a due date to selected book ID
                    for (i = 0; i < bookList.size(); i++) {
                        Date dueDate = Book.dueDateMethod();
                        bookList.set(selection, bookList.get(selection)).setDueDate(dueDate);
                        bookList.get(selection).setStatus("Checked Out");
                    }

<<<<<<< HEAD
                    System.out.println("1 - Main Menu");
                    System.out.println("2 - Exit");
                    reset = scnr.nextInt();
                    if (reset == 1) {
                    } else {
                        break;
=======
                    // for (i = 0; i == selection; i++){
                    // String status = "Checked Out";
                    // books.set(selection, books.get(selection).setStatus(status));
                    //}

                    for (i = 0; i < bookList.size(); i++) {
                        System.out.println(bookList.get(i));
>>>>>>> 9b6ba8d715023383906824e633f18c4b74edeab1
                    }
                case 2:
                    System.out.println("Search ");
                    Scanner scan = new Scanner(System.in);

                    System.out.println("Will you be searching by Author or Title Keyword?");
                    String  userS = scnr.nextLine();

                    if (userS.contains("Author")){
                        System.out.println("Enter an Author");

                        String selAuthor = scnr.nextLine();

                        for(int i = 0; i < books.size(); i++) {

                            if (books.get(i).getAuthor() .contains(selAuthor)){
                                System.out.println(books.get(i));
                            }
                            System.out.println("\nPlease enter the book ID if you would like to check it out ");
                            int selection = scnr.nextInt();
                            selection = selection - 101;

                            System.out.println("Congratulations you just checked out " + "'" + bookList.get(selection).getTitle()
                                    + "'" + "," + " it is due " + Book.dueDateMethod() + ".");

                            for (i = 0; i < bookList.size(); i++) {
                                Date dueDate = Book.dueDateMethod();
                                bookList.set(selection, bookList.get(selection)).setDueDate(dueDate);
                                bookList.get(selection).setStatus("Checked Out");
                            }
                            for (i = 0; i < bookList.size(); i++) {
                                System.out.println(bookList.get(i));
                            }
                        }

                    }

                    else {
                        System.out.println("Enter a keyword in the of the desired Title");

                        String selKeyword = scnr.nextLine();

                        for(int i = 0; i < books.size(); i++) {

                            if (books.get(i).getAuthor() .contains(selKeyword)){
                                System.out.println(books.get(i));
                            }
                            System.out.println("\nPlease enter the book Id if you would like to check it out ");
                            int selection = scnr.nextInt();
                            selection = selection - 101;

                            System.out.println("Congratulations you just checked out " + "'" + bookList.get(selection).getTitle()
                                    + "'" + "," + " it is due " + Book.dueDateMethod() + ".");

                            for (i = 0; i < bookList.size(); i++) {
                                Date dueDate = Book.dueDateMethod();
                                bookList.set(selection, bookList.get(selection)).setDueDate(dueDate);
                                bookList.get(selection).setStatus("Checked Out");
                            }
                            for (i = 0; i < bookList.size(); i++) {
                                System.out.println(bookList.get(i));
                            }
                        }

                    }

                    System.out.println("1 - Main Menu");
                    System.out.println("2 - Exit");
                    reset = scnr.nextInt();
                    if (reset == 1) {
                    } else {
                        break;
                    }

                    break;
                case 3:
                    for (i = 0; i < bookList.size(); i++) {
                        System.out.println(bookList.get(i));
<<<<<<< HEAD

=======
>>>>>>> 9b6ba8d715023383906824e633f18c4b74edeab1
                        for (i = 0; i < bookList.size(); i++) {
                            System.out.println(bookList.get(i));
                        }
                        System.out.println("\n");
                        System.out.print("Select book to return by ID: ");
                        int returnID = scnr.nextInt();

                        //Change status of book to Checked In, Change due date back to 0

                        System.out.println("Your book has been returned. Thank you!\n");
                        System.out.println("1 - Main Menu");
                        System.out.println("2 - Exit");
                        reset = scnr.nextInt();
                        if (reset == 1) {
                        } else {
                            break;
                        }
                    }
            }
<<<<<<< HEAD
            while (reset == 1) ;


//    private static void BookListing() {
//        File myFile = new File("booklist.txt");
//    }

//    private static void writeToFile(File myFile) {
//        try {
//            PrintWriter bookData = new PrintWriter(new FileOutputStream(myFile, true));
//
//            bookData.println(FIXME);
//            bookData.close();
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Sorry, that file was not found.");
//        }
//
//    }

//    private static String readFile() {
//        File myFile = new File("booklist.txt");
//        String output = "";
//
//        try {
//            FileReader reader = new FileReader(myFile);
//            BufferedReader bufferRead = new BufferedReader(reader);
//            String line = bufferRead.readLine();
//            while (line != null) {
//                output = output + line + "\n";
//                line = bufferRead.readLine();
//
//            }
//            bufferRead.close();
//        } catch (Exception e) {
//            System.out.println("Sorry, that file was not found.");
//        }
//
//        return FIXME;


=======
        } while (reset == 1) ;
            // Method call to get due date 14 days (2 weeks) from current date.
            Book.dueDateMethod();


        }

>>>>>>> 9b6ba8d715023383906824e633f18c4b74edeab1

        public static ArrayList<Book> readFile (String"booklist.txt") {

            ArrayList<Book> books = new ArrayList<Book>();
            //add books to ArrayList


<<<<<<< HEAD
<<<<<<< HEAD
            try {
                Path booksPath = Paths.get("./booklist.txt");
                File booksFile = booksPath.toFile();
                FileReader fileRdr = new FileReader(booksFile);
                BufferedReader in = new BufferedReader(fileRdr);
=======

        System.out.println("Welcome to Stanton Island's Public Library!");
        System.out.println("Main Menu");
        System.out.println("1 - Library Directory");
        System.out.println("2 - Search");
        System.out.println("3 - Return Book");
        System.out.print("Enter menu number: ");
        choice = scnr.nextInt();
        scnr.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Library Directory");
                break;
            case 2:

                System.out.println("Search ");
                Scanner scan = new Scanner(System.in);

                System.out.println("Will you be searching by Author or Title Keyword?");
                String  userS = scnr.nextLine();

                if (userS.contains("Author")){
                    System.out.println("Enter an Author");

                    String selAuthor = scnr.nextLine();

                    for(int i = 0; i < books.size(); i++) {

                        if (books.get(i).getAuthor() .contains(selAuthor)){
                            System.out.println(books.get(i));
                        }
                        System.out.println("\nPlease enter the book ID if you would like to check it out ");
                        int selection = scnr.nextInt();
                        selection = selection - 101;

                        System.out.println("Congratulations you just checked out " + "'" + bookList.get(selection).getTitle()
                                + "'" + "," + " it is due " + Book.dueDateMethod() + ".");

                        for (i = 0; i < bookList.size(); i++) {
                            Date dueDate = Book.dueDateMethod();
                            bookList.set(selection, bookList.get(selection)).setDueDate(dueDate);
                            bookList.get(selection).setStatus("Checked Out");
                        }
                        for (i = 0; i < bookList.size(); i++) {
                            System.out.println(bookList.get(i));
                        }
                    }

                }

                else {
                    System.out.println("Enter a keyword in the of the desired Title");

                    String selKeyword = scnr.nextLine();

                    for(int i = 0; i < books.size(); i++) {

                        if (books.get(i).getAuthor() .contains(selKeyword)){
                            System.out.println(books.get(i));
                        }
                        System.out.println("\nPlease enter the book Id if you would like to check it out ");
                        int selection = scnr.nextInt();
                        selection = selection - 101;

                        System.out.println("Congratulations you just checked out " + "'" + bookList.get(selection).getTitle()
                                + "'" + "," + " it is due " + Book.dueDateMethod() + ".");

                        for (i = 0; i < bookList.size(); i++) {
                            Date dueDate = Book.dueDateMethod();
                            bookList.set(selection, bookList.get(selection)).setDueDate(dueDate);
                            bookList.get(selection).setStatus("Checked Out");
                        }
                        for (i = 0; i < bookList.size(); i++) {
                            System.out.println(bookList.get(i));
                        }
                    }

                }

            System.out.println("1 - Main Menu");
            System.out.println("2 - Exit");
            reset = scnr.nextInt();
            if (reset == 1) {
            } else {
                break;
            }

            case 3:
                System.out.println("Return Book");
                break;
>>>>>>> dd27646a52c394737e97362d13a91dfbcae699f5
=======
        try {
            Path booksPath = Paths.get(filename);
            File booksFile = booksPath.toFile();
            FileReader fileRdr = new FileReader(booksFile);
            BufferedReader in = new BufferedReader(fileRdr);
>>>>>>> 9b6ba8d715023383906824e633f18c4b74edeab1

                //read in the first line
                String line = in.readLine();

                //as long as there's another line
                while (line != null) {
                    //break the line apart based on tabs
                    String[] details = line.split("\t");

<<<<<<< HEAD
                    if (details.length < 13) {
                        System.out.println("Bad line format--halting read");
                        break;
                    }

                    //take the first item, turn it into an int, put it into the books's ID
                    int bookID = Integer.parseInt(details[0]);
                    //take the second item and put into book's title
                    String title = details[1];
                    //take the third item and put into book's author
                    String author = details[2];
                    //take the fourth item, turn it to int, put into book's numberOfPages
                    int numberOfPages = Integer.parseInt(details[3]);
                    //take the fifth item and put into book's publicationDate
                    String publicationDate = details[4];
                    //take the sixth item and put into book's status
                    String status = details[5];
                    //take the seventh item, turn it into an int, put into book's dueDate
                    int dueDate = Integer.parseInt(details[6]);

                    //construct a new Car object from this data
                    Book b = new Book(bookID, title, author, numberOfPages, publicationDate, status, dueDate);

                    //add the new Car into ArrayList
                    books.add(b);

                    //read in the next line for the next iteration
                    line = in.readLine();
                }

            } catch (IOException e) {
                System.out.println(e);
                return null;
            }

            return books;
        }


=======
              //  if (details.length > 13) {
              //      System.out.println("Bad line format--halting read");
              //      break;
              //  }

                //take the first item, turn it into an int, put it into the books's ID
                int bookID = Integer.parseInt(details[0]);
                //take the second item and put into book's title
                String title = details[1];
                //take the third item and put into book's author
                String author = details[2];
                //take the fourth item, turn it to int, put into book's numberOfPages
                int numberOfPages = Integer.parseInt(details[3]);
                //take the fifth item and put into book's publicationDate
                String publicationDate = details[4];
                //take the sixth item and put into book's status
                String status = details[5];
                //take the seventh item, turn it into an int, put into book's dueDate
                int dueDate = Integer.parseInt(details[6]);

                //construct a new Car object from this data
                Book b = new Book(bookID, title, author, numberOfPages, publicationDate, status, dueDate);

                //add the new Car into ArrayList
                books.add(b);

                //read in the next line for the next iteration
                line = in.readLine();
            //    in.close();
            }

        } catch (IOException e) {
            System.out.println(e);
        //    return null;
>>>>>>> 9b6ba8d715023383906824e633f18c4b74edeab1
        }

      //  in.close();

        return books;
    }
}
>>>>>>> 9b6ba8d715023383906824e633f18c4b74edeab1







