
package data;

import java.io.Serializable;



public abstract class Publication implements Serializable, Comparable<Publication>{
    private static final long serialVersionUID = 7910452641164094454L;
    private int year;
    private String title;
    private String publisher;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
        this.setYear(year);
        this.setTitle(title);
        this.setPublisher(publisher);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publication)) return false;

        Publication that = (Publication) o;

        if (getYear() != that.getYear()) return false;
        if (!getTitle().equals(that.getTitle())) return false;
        return getPublisher().equals(that.getPublisher());
    }

    @Override
    public int hashCode() {
        int result = getYear();
        result = 31 * result + getTitle().hashCode();
        result = 31 * result + getPublisher().hashCode();
        return result;
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

