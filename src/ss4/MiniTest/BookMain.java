package ss4.MiniTest;

import java.util.Objects;

public class BookMain {

    static public String  findBook(Book[] booksArr,int bookCode){
        for (Book book:booksArr){
            if (book.getBookCode()==bookCode){
                return  book.getName();
            }
        }
        return null;
    }
    public static void main(String[] args) {

        Book book1 = new Book(1,"bookA",123,"Nam");
        Book book2 = new Book(2,"bookB",23,"Cao");
        Book book3 = new Book(3,"bookC",13,"Bang");
        Book book4 = new Book(4,"bookD",153,"Kieu");
        Book book5 = new Book(5,"bookE",113,"Nu");
        Book book6 = new Book(6,"bookF",184,"Minh");

        Book[] booksArr = {book1,book2,book3,book4,book5,book6};


        double sum = 0;
        for (Book book:booksArr){
            sum += book.getPrice();
        }
        System.out.println("Tong 6 cuon sach la:");
        System.out.println(sum);

        System.out.println("Sach co gia tren 100");
        for (Book book: booksArr){
            if( book.getPrice()>100){
                System.out.println(book.getName());
            }
        }

        System.out.println("Sach co tac gia la Minh la:");
        for (Book book: booksArr){
            if(Objects.equals(book.getAuthor(), "Minh")){
                System.out.println(book.getName());
            }
        }

        System.out.println("Tim ten sach co Code 4:");
        System.out.println(findBook(booksArr,4));
    }
}
