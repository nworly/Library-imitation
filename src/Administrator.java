public interface Administrator {

    void findABook(String title, Reader reader);
    void overdueNotification(Reader reader);
}
