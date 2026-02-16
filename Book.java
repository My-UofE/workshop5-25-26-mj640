public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    // constructor
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    // 'getter' methods
    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    // 'setter' methods
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // 'misc' methods
    public String toString() {

        String authorDetails = "";

        for (int i = 0; i < authors.length; i++) {
            authorDetails += authors[i].toString();

            if (i < authors.length - 1) {
                authorDetails += ",";
            }
        }

        return "Book[name=" + name +
               ",authors={" + authorDetails + "}" +
               ",price=" + price +
               ",qty=" + qty + "]";
    }
}