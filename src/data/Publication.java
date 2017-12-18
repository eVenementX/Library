
package data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;


public abstract class Publication implements Serializable, Comparable<Publication>{
    private static final long serialVersionUID = 7910452641164094454L;

    private String title;
    private String publisher;
    private LocalDate localDate;

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public int getYear() {
        return localDate.getYear();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    protected Publication(int year, String title, String publisher)
    {
        setLocalDate(LocalDate.of(year,1,1));
        setTitle(title);
        setPublisher(publisher);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publication)) return false;
        Publication that = (Publication) o;
        return Objects.equals(getTitle(), that.getTitle()) &&
                Objects.equals(getPublisher(), that.getPublisher()) &&
                Objects.equals(getLocalDate(), that.getLocalDate());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getTitle(), getPublisher(), getLocalDate());
    }

    @Override
    public String toString() {
        StringBuilder printer = new StringBuilder(32);
        printer.append(getTitle());
        printer.append("; ");
        printer.append(getPublisher());
        printer.append("; ");
        printer.append(getYear());

        return printer.toString() ;
    }

    @Override
    public int compareTo(Publication o) {
        return title.compareTo(o.getTitle());
    }
}

