public class Library {
    //membuat atribut yang berisikan objek dengan memanfaatkan generic class
    private Inventory<Book> inventory;
    public Library() {
        //langsung otomatis membuat objek inventory baru
        this.inventory = new Inventory<>();
    }

    //membuat method menambahkan buku ke inventory
    public void addBook(Book book) {
        //menambahkan buku ke list
        inventory.addItem(book);
    }

    //membuat method menghapus buku dari list inventory
    public void removeBook(Book book) {
        System.out.println("---Removing Books---");
        System.out.println(book.getTitle() + " Removed succesfully !!!");
        //menghapus dari inventory
        inventory.removeItem(book);
        System.out.println("--------------------");
    }
    //membuat method searchBooks untuk mencari buku berdasarkan keywords
    public void searchBooks(String keyword) {
        inventory.searchItems(keyword);
    }

    // membuat updateStock untuk mengubah jumlah stock
    public void updateStock(Book book, int quantity) {
        //looping ke setiap buku untuk mencari title yang sesuai dengan yang ingin diupdate
        for (Book sample : inventory.getItems()) {
            if (sample.getTitle().equals(book.getTitle()) && sample.getAuthor().equals(book.getAuthor())) {
                sample.setStock(quantity);
                break;
            }
        }
        System.out.println("---Updating Stocks---");
        System.out.println("Stocks sucessfully updated!! Current Stock : " + book.getStock());
        System.out.println("---------------------");
    }
    //method untuk menambahkan stock
    public void addStock(Book book, int quantity) {
        for (Book sample : inventory.getItems()) {
            if (sample.getTitle().equals(book.getTitle()) && sample.getAuthor().equals(book.getAuthor())) {
                sample.setStock(sample.getStock() + quantity);
                break;
            }
        }
        System.out.println("---Adding Stocks---");
        System.out.println("Stocks sucessfully added!! Current Stock : " + book.getStock());
        System.out.println("-------------------");
    }
    //method untuk menampilkan informasi tentang buku
    public void displayBook(Book book) {
        System.out.println("Judul Buku: " + book.getTitle() + 
                           "Penulis Buku : " + book.getAuthor() + 
                           "Stok Buku : " + book.getStock());
    }
}