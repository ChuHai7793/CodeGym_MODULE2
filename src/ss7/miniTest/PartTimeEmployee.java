package ss7.miniTest;

public class PartTimeEmployee extends Employee {
    String code, name, age, tel, email;
    double workHours;

    public PartTimeEmployee() {

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

    public double getWorkHours() {
        return workHours;
    }

    public PartTimeEmployee(String code, String name, String age, String tel, String email, double workHours) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.email = email;
        this.workHours = workHours;
    }


    @Override
    public double calculateSalary() {
        return workHours * 100000;
    }
}
