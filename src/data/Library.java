
package data;


import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;






public class Library implements Serializable {
    private static final long serialVersionUID = -1942727499318789886L;

    private Map <String, Publication> publications;
    private Map <String, LibraryUser> users;


    public Library() {
        publications = new HashMap <>();
        users = new HashMap <>();
    }

    public int getPublicationNumber()
    {
        return publications.size();
    }

    public Map <String, Publication> getPublications() {
        return publications;
    }

    public Map <String, LibraryUser> getUsers() {
        return users;
    }
    public void addUser(LibraryUser user)
    {
        users.put(user.getPesel(),user);
    }

    public void addBook(Book book){
        addPublication(book);

        }
    public void addMagazine(Magazine magazine){
        addPublication(magazine);

    }


    public void addPublication(Publication pub)
    {
      publications.put(pub.getTitle(),pub);

    }

    public void removePublication(Publication pub) {
       if (publications.containsValue(pub))
       {
           publications.remove(pub.getTitle());
       }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Publication p: publications.values()
             ) {
            sb.append(p);
            sb.append("\n");

        }
        return sb.toString();
    }
public static class AlphabeticComparator implements Comparator<Publication>
{
    @Override
    public int compare(Publication o1, Publication o2) {
        if (o1 == null && o2 == null)
        {
            return 0;
        }
        if (o1 == null)
        {
            return 1;
        }
        if (o2 == null)
        {
            return -1;
        }
        String t1 = o1.getTitle();
        String t2 = o2.getTitle();
        return t1.compareTo(t2);
    }
}
    public static class DataComparator implements Comparator<Publication>
    {
        @Override
        public int compare(Publication o1, Publication o2) {
            if (o1 == null && o2 == null)
            {
                return 0;
            }
            if (o1 == null)
            {
                return 1;
            }
            if (o2 == null)
            {
                return -1;
            }
            Integer i1 = o1.getYear();
            Integer i2 = o2.getYear();
            return -(i1.compareTo(i2));
        }
    }
}

