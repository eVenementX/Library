package data;

public class Book extends Publication{

    private static final long serialVersionUID = 619087687127137888L;
    private String author;
    private int pages;
    private String isbn;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Book(String title, String author, int year, int pages, String publisher, String isbn)
    {
        super(year, title, publisher);
        this.setAuthor(author);
        this.setPages(pages);
        this.setIsbn(isbn);
    }
   public Book(Book book){
        this(book.getTitle(),book.getAuthor(),book.getYear(),book.getPages(),book.getPublisher(),book.getIsbn());
    }

    @Override
    public String toString() {
       StringBuilder printer = new StringBuilder(32);
       printer.append(super.toString());
       printer.append("; ");
       printer.append(getAuthor());
       printer.append("; ");
       printer.append(getPages());
       printer.append("; ");

       printer.append(getIsbn());
       printer.append("; ");

        return printer.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        if (!super.equals(o)) return false;

        Book book = (Book) o;

        if (getPages() != book.getPages()) return false;
        if (getAuthor() != null ? !getAuthor().equals(book.getAuthor()) : book.getAuthor() != null) return false;
        return getIsbn() != null ? getIsbn().equals(book.getIsbn()) : book.getIsbn() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
        result = 31 * result + getPages();
        result = 31 * result + (getIsbn() != null ? getIsbn().hashCode() : 0);
        return result;
    }

}
