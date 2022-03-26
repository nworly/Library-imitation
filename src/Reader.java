public interface Reader {

    void takeABook(String title, Administrator administrator);
    void returnBooks(String title, Administrator administrator);
}
