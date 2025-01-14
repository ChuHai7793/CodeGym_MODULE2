package ss7.miniTest4;

import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount{
    double quantity;


    public CrispyFlour() {
    }
    public CrispyFlour(String id, String name, LocalDate manufacturingDate, double cost,double quantity) {
        super( id,  name,  manufacturingDate,  cost);
        this.quantity = quantity;
    }



    @Override
    public double getAmount() {
        return quantity*this.getCost();
    }

    @Override
    public LocalDate getExpireDate() {
        return this.getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        return this.getCost()*95/100;
    }
}
