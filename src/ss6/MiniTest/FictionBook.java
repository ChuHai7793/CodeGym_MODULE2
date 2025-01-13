package ss6.MiniTest;

public class FictionBook extends Book{
    private String category;
    public FictionBook(){
    }

    public FictionBook(int bookCode, String name, double price,
                           String author,String category){
        super( bookCode, name, price, author);
        this.category =category;

    }

    @Override
    public double getPrice() {
        return super.getPrice()*93/100;
    }

    public String getCategory() {
        return category;
    }
}