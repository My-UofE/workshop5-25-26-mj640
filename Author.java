public class Author {

    // attributes
    private String name;
    private String email;
    private char gender;

    // constructors
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // 'getter' methods
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // 'setter' methods
    public void setEmail(String email) {
        this.email = email;
    }

    // 'misc' methods
    public String toString() {
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }
}
