import java.util.Objects;

public class Author {

    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }


    @Override
    public boolean equals(Object a) {
        if (this == a) {
            return true;
        }
        if (a == null || this.getClass() != a.getClass()) {
            return false;
        }
        Author author = (Author) a;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
    }


    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
