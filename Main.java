public class Main {
    public static void main(String[] args){
        //Membuat objek library untuk mengakses method-method dalam class Library
        Library library = new Library();
        //membuat beberapa objek buku
        Book book1 = new Book("Atomic Habits","James",2009,10);
        Book book2 = new Book("Money","Morgan",1998,20);
        Book book3 = new Book("Subtle","Manson",2007,5);
        Book book4 = new Book("Atomic","Fikri",20012,10);

        //Menambahkan objek-objek tadi ke library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        //menggunakan method untuk mencari buku berdasarkan keywords
        library.searchBooks("Atomic");
        library.searchBooks("Morgan");
        library.searchBooks("adasbdiasjdhas");

        //mencoba menghapus buku dari library
        library.removeBook(book4);

        //mencoba mengupdate stocks
        library.updateStock(book1, 10);
        library.updateStock(book2, 20);
        library.updateStock(book2, 30);

        //mencoba menambah stock
        library.addStock(book1, 10);
        library.addStock(book2, 20);
        library.addStock(book3, 30);

        //mencoba menampilkan info buku
        library.displayBook(book1);
        library.displayBook(book2);
        library.displayBook(book3);
    }
}

