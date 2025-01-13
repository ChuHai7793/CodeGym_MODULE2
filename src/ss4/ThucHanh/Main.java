package ss4.ThucHanh;

public class Main {
    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin();

        // Ép kiểu đối tượng 'dolphin' sang kiểu interface 'Swimmable'
        Animal animal = dolphin;  // Đây là phép ép kiểu hợp lệ

        animal.eat();  // Gọi phương thức swim từ interface Swimmable
    }
}