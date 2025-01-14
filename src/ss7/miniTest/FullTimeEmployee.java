package ss7.miniTest;

public class FullTimeEmployee extends Employee {
    private String code, name, age, tel, email;
    private double bonus, fine, salary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String code,
                            String name,
                            String age,
                            String tel,
                            String email,
                            double bonus,
                            double fine,
                            double salary) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.email = email;
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public FullTimeEmployee(String a, String a1, String a2, String a3, String a4, Object o) {
        super();
    }

    @Override
    public double calculateSalary() {
        return salary + bonus - fine;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public double getBonus() {
        return bonus;
    }

    public double getFine() {
        return fine;
    }

    public double getSalary() {
        return salary;
    }
}
