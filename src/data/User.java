package data;

import java.io.Serializable;

public abstract class User implements Serializable{

    private static final long serialVersionUID = -7473091290225335770L;
    private String test;
    private String firstName;
    private String lastName;
    private String pesel;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public User(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getFirstName() != null ? !getFirstName().equals(user.getFirstName()) : user.getFirstName() != null)
            return false;
        if (getLastName() != null ? !getLastName().equals(user.getLastName()) : user.getLastName() != null)
            return false;
        return getPesel() != null ? getPesel().equals(user.getPesel()) : user.getPesel() == null;
    }

    @Override
    public int hashCode() {
        int result = getFirstName() != null ? getFirstName().hashCode() : 0;
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + (getPesel() != null ? getPesel().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Użytkownika" +
                " Imie " + firstName + '\'' +
                ", Nazwisko " + lastName + '\'' +
                ", PESEL " + pesel + '\'' +
                '}';
    }
}


