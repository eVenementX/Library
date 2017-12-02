
package data;

import java.util.ArrayList;
import java.util.List;





public class LibraryUser extends User {
    private static final long serialVersionUID = -6618420628837790549L;

   private List<Publication> publicationsHistory;
   private  List<Publication> borrowedPublications;



    public List <Publication> getPublicationsHistory() {
        return publicationsHistory;
    }

    public List <Publication> getBorrowedPublications() {
        return borrowedPublications;
    }

    public LibraryUser(String firstName, String lastName, String pesel) {
        super(firstName, lastName, pesel);
        publicationsHistory = new ArrayList<>();
        borrowedPublications = new ArrayList<>();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryUser)) return false;
        if (!super.equals(o)) return false;

        LibraryUser that = (LibraryUser) o;

        if (getPublicationsHistory() != null ? !getPublicationsHistory().equals(that.getPublicationsHistory()) : that.getPublicationsHistory() != null)
            return false;
        return getBorrowedPublications() != null ? getBorrowedPublications().equals(that.getBorrowedPublications()) : that.getBorrowedPublications() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getPublicationsHistory() != null ? getPublicationsHistory().hashCode() : 0);
        result = 31 * result + (getBorrowedPublications() != null ? getBorrowedPublications().hashCode() : 0);
        return result;
    }

    private void addPublicationToHistory (Publication pub)
    {
        publicationsHistory.add(pub);
    }
    public void borrowPublication (Publication pub)
    {
        borrowedPublications.add(pub);
    }
    public boolean returnPublication (Publication pub)
    {
        boolean result = false;
        if (borrowedPublications.remove(pub))
        {
            result = true;
            publicationsHistory.add(pub);
        }
        return result;
    }
}


