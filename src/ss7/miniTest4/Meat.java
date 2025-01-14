package ss7.miniTest4;
import java.time.LocalDate;

public class Meat extends Material implements Discount{
    double weight;

    public Meat() {
    }

    public Meat(String id, String name, LocalDate manufacturingDate, double cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return this.getCost()*this.weight;
    }

    @Override
    public LocalDate getExpireDate() {
        return this.getManufacturingDate().plusYears(7);
    }

    @Override
    public double getRealMoney() {
        return this.getCost()*90/100;
    }
}
