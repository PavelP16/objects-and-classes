public class App {

    public static void main(String[] args) {

        Author king = new Author("Stephen", "King");
        Author rowling = new Author("Joanne","Rowling");
        Book book=new Book("11/22/63",king,1963);
        Book book1=new Book("Harry Potter and the Philosopher s Stone",rowling,1997);
        book.setYearOfPublishing(1970);


        System.out.println(book);
        System.out.println(book1);


    }

}
