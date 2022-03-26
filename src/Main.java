public class Main {
    public static void main(String[] args) {
        String bookTitle = "Три товарища";

        Supplier supplier = new LibrarySupplier("Поставщик Георгий");
        Reader reader = new LibrarySupplier("Читатель Георгий");
        Administrator administrator = new LibraryEmployee("Администратор Михаил");
        Librarian librarian = new LibraryEmployee("Библиотекарь Наташа");
        LibraryEmployee head = new LibraryEmployee("Заместитель директора библиотеки");

        administrator.findABook(bookTitle, reader);
        reader.takeABook(bookTitle, administrator);
        administrator.overdueNotification(reader);
        reader.returnBooks(bookTitle, administrator);
        librarian.orderBooks(supplier);
        supplier.processAnOrder(librarian);
        supplier.deliverBooks(librarian);
        head.orderBooks(supplier);
        head.findABook("Колобок", reader);

    }
}
