package ss6.MiniTest;

public class ProgrammingBook extends Book{
    private String language, framework;
    public ProgrammingBook(){
    }

    public ProgrammingBook(int bookCode, String name, double price,
                           String author,String language, String framework){
        super( bookCode, name, price, author);
        this.framework =framework;
        this.language = language;
    }

    @Override
    public double getPrice() {
        return super.getPrice()*95/100;
    }

    public String getLanguage() {
        return language;
    }

    public String getFramework() {
        return framework;
    }
}
