package utils;
import data.Book;
import data.LibraryUser;
import data.Magazine;


import java.util.InputMismatchException;
import java.util.Scanner;

public class DataReader {
    private Scanner sc;
    public DataReader()
    {
         sc = new Scanner(System.in);
    }
    public void close()
    {
        sc.close();
    }
    public Book readAndCreateBook() throws InputMismatchException {
        System.out.println("Ttytuł książki: ");
        sc.nextLine();
        String title = sc.nextLine();
        System.out.println("Autor: ");
        String author = sc.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = sc.nextLine();
        System.out.println("ISBN: ");
        String isbn = sc.nextLine();
        System.out.println("Rok wydania: ");
        int year = 0;
        int pages = 0;
        try {
             year = sc.nextInt();
            sc.nextLine();
            System.out.println("Ilość stron: ");
             pages = sc.nextInt();
            sc.nextLine();
        }catch (InputMismatchException e)
        {
            sc.nextLine();
            throw e;
        }


        return new Book(title, author, year, pages, publisher, isbn);
    }

    public Magazine readAndCreateMagazin() throws InputMismatchException
    {
        System.out.println("Ttytuł: ");
        sc.nextLine();
        String title = sc.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = sc.nextLine();
        System.out.println("Język: ");
        String language = sc.nextLine();
        System.out.println("Rok wydania: ");
        int year = 0;
        int month = 0;
        int day = 0;
        try {
             year = sc.nextInt();
            sc.nextLine();
            System.out.println("Miesiąc: ");
             month = sc.nextInt();
            System.out.println("Dzień: ");
             day = sc.nextInt();
            sc.nextLine();
        }catch (InputMismatchException e)
        {
            sc.nextLine();
            throw e;
        }



        return new Magazine(title,publisher,language,year,month,day);
    }
    public LibraryUser readAndCreateLibraryUser()
    {
        System.out.println("Podaj imie użytkownika");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Podaj nazwisko użytkownika");
        String lastName = sc.nextLine();
        System.out.println("Podaj nr PESEL użytkownika");
        String pesel = sc.nextLine();

        return new LibraryUser(name,lastName,pesel);
    }
    public int getInt() throws NumberFormatException
    {
        int number;
        try {
             number = sc.nextInt();
        }catch (InputMismatchException e)
        {
            sc.nextLine();
            throw new NumberFormatException ("Niepoprawna wartość ");

        }
        return number;
    }

}
