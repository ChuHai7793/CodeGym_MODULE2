package ss6.MiniTest;
import java.util.Objects;

public class BookTest {
    public static void main(String[] args) {

        Book pBook1 = new ProgrammingBook(1,"bookA",123,"Nam","C","AAA");
        Book pBook2 = new ProgrammingBook(2,"bookB",183,"Nom","Java","AAB");
        Book pBook3 = new ProgrammingBook(3,"bookC",143,"Nem","C++","AAC");
        Book fBook1 = new FictionBook(4,"bookD",23,"Ma","Vientuong");
        Book fBook2 = new FictionBook(5,"bookE",28,"Mi","Vientuong");
        Book fBook3 = new FictionBook(6,"bookF",193,"Mu","medium");


        Book[] booksArr = {pBook1,pBook2,pBook3,fBook1,fBook2,fBook3};


        double sum = getSum(booksArr);
        System.out.println("Tong 6 cuon sach la:");
        System.out.println(sum);


        System.out.println("So sach lap trinh ngon ngu Java la:");
        System.out.println( getProgramBookByLanguage(booksArr,"Java"));

        System.out.println("So sach fiction thuoc category Vien tuong la:");
        System.out.println( getFictionBookByCategory(booksArr,"Vientuong"));

        System.out.println("So sach Fiction co gia it hon 100 la:");
        System.out.println(countFictionWithPriceLessThan100(booksArr));

    }

    private static double getSum(Book[] booksArr) {
        double sum = 0;
        for (Book book: booksArr){
            sum += book.getPrice();
        }
        return sum;
    }

    private static int getProgramBookByLanguage(Book[] booksArr, String language) {
        int count = 0;
        for (Book book: booksArr){
            if (book instanceof ProgrammingBook){
                if (Objects.equals(((ProgrammingBook) book).getLanguage(), language)){
                    count++;
                }
            }
        }
        return count;
    }

    private static int getFictionBookByCategory(Book[] booksArr, String category) {
        int count = 0;
        for (Book book: booksArr){
            if (book instanceof FictionBook){
                if (Objects.equals(((FictionBook) book).getCategory(), category)){
                    count++;
                }
            }
        }
        return count;
    }

    private static int countFictionWithPriceLessThan100(Book[] booksArr) {
        int count = 0;
        for (Book book : booksArr) {
            if (book instanceof FictionBook) {
                if (((FictionBook) book).getPrice() < 100) {
                    count++;
                }
            }
        }
        return count;
    }
}
