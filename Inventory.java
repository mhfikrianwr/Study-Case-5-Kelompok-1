import java.util.ArrayList;
import java.util.List;
public class Inventory<T> {
    //membuat generic class untuk mempermudah di library
    private List<T> items = new ArrayList<>();

    //membuat method menambahkan item ke Inventory
    public void addItem(T item){
        items.add(item);
    }

    //membuat method menghapus item dari inventory
    public void removeItem(T item){
        items.remove(item);
    }
    //method mengembalikan item yang telah dimasukkan
    public List<T> getItems(){
        return this.items;
    }
    //method untuk mencari item berdasarkan keyword yang akan dipanggil di library
    public void searchItems(String keyword) throws ClassCastException {
        List<T> findingItems = new ArrayList<>();
        for (T item : items) {
            Book book = (Book) item;
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) || 
                book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                findingItems.add(item);
            }
        }
        System.out.println("----- Pencarian Buku -----");
        if(findingItems.isEmpty()) System.out.println("Tidak ditemukan buku dengan keyword " + keyword + " !!!");
        else{
            System.out.println("Hasil pencarian Keyword : " + keyword);
            int counter = 1;
            for(T item : findingItems){
                System.out.println(counter + ". " + item.toString());
                counter++;
            }
            System.out.println("--------------------------\n");
        }
        System.out.println("--------------------------\n");
    }
}
