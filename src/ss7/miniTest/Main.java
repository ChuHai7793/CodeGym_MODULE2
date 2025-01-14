package ss7.miniTest;

public class Main {

    static public double calAvgSalary(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.calculateSalary();
        }
        return sum / employees.length;
    }

    static public Employee[] listUnderpaidFullTimeEmployees(Employee[] employees) {
        double avgSalary = calAvgSalary(employees);
        int underpaidCount = 0;
        for (Employee employee : employees) {
            if (employee instanceof FullTimeEmployee) {
                if (employee.calculateSalary() < avgSalary) {
                    underpaidCount++;
                }
            }
        }
        Employee[] underpaidEmployees = new Employee[underpaidCount];
        int i = 0;
        for (Employee employee : employees) {
            if (employee instanceof FullTimeEmployee) {
                if (employee.calculateSalary() < avgSalary) {
                    underpaidEmployees[i] = employee;
                    i++;
                }
            }
        }

        return underpaidEmployees;
    }

    public static double calcAllPartTimeSalary(Employee[] employees) {
        double partTimeSalary = 0;
        for (Employee employee : employees) {
            if (employee instanceof PartTimeEmployee) {
                partTimeSalary += employee.calculateSalary();
            }
        }
        return partTimeSalary;
    }


    public static Employee[] getFullTimeEmployees(Employee[] employees) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee instanceof FullTimeEmployee) {
                count++;
            }
        }

        Employee[] fullTimeEmployee = new Employee[count];
        int i = 0;
        for (Employee employee : employees) {
            if (employee instanceof FullTimeEmployee) {
                fullTimeEmployee[i] = employee;
                i++;
            }
        }
        return fullTimeEmployee;
    }


    public static Employee[] sortFullTimeSalary(Employee[] employees) {

        Employee[] fullTimeEmployee = getFullTimeEmployees(employees);

        for (int i = 0; i < fullTimeEmployee.length; i++) {
            for (int j = 0; j < fullTimeEmployee.length - i - 1; j++) {
                if (fullTimeEmployee[j].calculateSalary() > fullTimeEmployee[j + 1].calculateSalary()) {
                    Employee temp = fullTimeEmployee[j];
                    fullTimeEmployee[j] = fullTimeEmployee[j + 1];
                    fullTimeEmployee[j + 1] = temp;
                }
            }
        }
        return fullTimeEmployee;
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[7];

        employees[0] = new FullTimeEmployee("A","A","A","A","A",1000,100,10000);
        employees[1] = new FullTimeEmployee("B","A","A","A","A",1000,200,20000);
        employees[2] = new FullTimeEmployee("C","A","A","A","A",1000,300,25000);
        employees[3] = new FullTimeEmployee("D","A","A","A","A",1000,400,15000);
        employees[4]= new PartTimeEmployee("E","A","A","A","A",10);
        employees[5]= new PartTimeEmployee("F","A","A","A","A",20);
        employees[6]= new PartTimeEmployee("G","A","A","A","A",30);


        System.out.println("Ma so nhan vien luong thap la:");
        Employee[] underpaidEmployeeList = listUnderpaidFullTimeEmployees(employees);
        for (Employee employee:underpaidEmployeeList){
            System.out.print(((FullTimeEmployee) employee).getCode()+ " ");
        }
        System.out.println();


        System.out.println("TONG TIEN NHAN VIEN BAN THOI GIAN:"+calcAllPartTimeSalary(employees));

        Employee[] sortEmployees =  sortFullTimeSalary(employees);
        System.out.println("Ma so nhan vien tu be den lon la:");
        for (Employee employee:sortEmployees){
            System.out.print(((FullTimeEmployee) employee).getCode()+ " ");
        }

    }
}
