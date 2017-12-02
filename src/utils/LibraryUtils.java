package utils;
import data.*;

import java.util.*;

public class LibraryUtils {


    public static void printBooks(Library lib)
    {
        List<Publication> publications = new ArrayList <>();
        publications.addAll(lib.getPublications().values());
        Collections.sort(publications,new Library.AlphabeticComparator());
        int publicationCount = 0;
        for (Publication p :publications
             ) {
            if (p instanceof Book)
            {
                System.out.println(p);
                publicationCount++;
            }

        }
        if (publicationCount == 0)
        {
            System.out.println("Brak książek w bibliotece");
        }

    }
    public static void printMagazines(Library lib) {
        List<Publication> publications = new ArrayList <>();
        publications.addAll(lib.getPublications().values());
        Collections.sort(publications,new Library.AlphabeticComparator());

        int countMagazines = 0;
        for(Publication p: publications) {
            if(p instanceof Magazine) {
                System.out.println(p);
                countMagazines++;
            }
        }

        if(countMagazines == 0) {
            System.out.println("Brak magazynów w bibliotece");
        }
    }

    public static void printUsers(Library lib)
    {
        List<LibraryUser> users = new ArrayList <>();
        users.addAll(lib.getUsers().values());
        Collections.sort(users, Comparator.comparing(User::getLastName));
        for (LibraryUser u:users
             ) {
            System.out.println(u);

        }
    }
}
