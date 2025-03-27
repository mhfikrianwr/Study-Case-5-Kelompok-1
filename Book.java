public class Book{
    //membuat atribut
    private String title, author;
    private int year, stock;
    //membuat constructor dengan parameter yang akan dimasukkan ke atribut dengan memanggil setter getter
    public Book(String title, String author, int year, int stock){
        setTitle(title);
        setStock(stock);
        setYear(year);
        setAuthor(author);
    }
    //dibawah ini kita membuat setter dan getter yang kita gunakan untuk mengakses atribut dari Book
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getYear(){
        return this.year;
    }
    public int getStock(){
        return this.stock;
    }
    //kita membuat method yang dioverride untuk digunakan menampilkan hasil dari pencarian yang kita simpan ke list, kalau tidak pakai ini saat mengakses element list, outputnya adalah Book@hashcode
    @Override
    public String toString() {
        return title + " by " + author + " (" + year + ") - Stock: " + stock;
    }
}