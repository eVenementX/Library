package data;

import java.time.LocalDate;
import java.util.Objects;

public class Magazine extends Publication {
    private static final long serialVersionUID = -6687916295854360508L;

    private String language;


    public int getMonth() {
        return getLocalDate().getMonthValue();
    }

    public int getDay() {
        return getLocalDate().getDayOfMonth();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    public Magazine(String title,String publisher,String language, int year, int month, int day)
    {

       super(year, title, publisher);
        setLanguage(language);
        setLocalDate(LocalDate.of(year,month,day));


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Magazine)) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return getMonth() == magazine.getMonth() &&
                getDay() == magazine.getDay() &&
                Objects.equals(getLanguage(), magazine.getLanguage());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getMonth(), getDay(), getLanguage());
    }

    @Override
    public String toString() {
        StringBuilder printer = new StringBuilder(32);
        printer.append(super.toString());
        printer.append("; ");
        printer.append(getMonth());
        printer.append("; ");
        printer.append(getDay());
        printer.append("; ");
        printer.append(getLanguage());
        return printer.toString();
    }
}
