public class LibraryEmployee extends Person implements Librarian, Administrator {

    public LibraryEmployee(String name) {
        super(name);
    }

    @Override
    public void findABook(String title, Reader reader) {
        System.out.println(name + " выдал книгу " + title + " " + reader);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println(name + " уведомил о наличии книжной задолженности " + reader);
    }

    @Override
    public void orderBooks(Supplier supplier) {
        System.out.println(name + " разместил заказ у " + supplier);
    }
}
