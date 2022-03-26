public class LibrarySupplier extends Person implements Supplier, Reader {
    private static int finishedOrders = 0;

    public LibrarySupplier(String name) {
        super(name);
    }


    @Override
    public void takeABook(String title, Administrator administrator) {
        System.out.println(name + " получил книгу " + title + " от " + administrator);
    }

    @Override
    public void returnBooks(String title, Administrator administrator) {
        System.out.println(name + " вернул книгу " + title + " в библиотеку сотруднику " + administrator);
    }

    @Override
    public void processAnOrder(Librarian librarian) {
        System.out.println("Заказ от " + librarian + " был упакован и передан в доставку");
    }

    @Override
    public void deliverBooks(Librarian librarian) {
        finishedOrders++;
        System.out.println(name + " доставил заказ от " + librarian);
    }
}
