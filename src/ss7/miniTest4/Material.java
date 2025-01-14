package ss7.miniTest4;

import java.time.LocalDate;

public abstract class Material {
    private String id,name;
    private LocalDate manufacturingDate;
    private double cost;

    public Material(){};

    public Material(String id, String name, LocalDate manufacturingDate, double cost) {
        this.id = id;
        this.name = name;
        this.manufacturingDate = manufacturingDate;
        this.cost = cost;
    }

    public abstract double getAmount();
    public abstract LocalDate getExpireDate();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Material{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost +
                '}';
    }
}
