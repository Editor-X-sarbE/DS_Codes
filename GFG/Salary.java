public class Salary {

    private double basicSalary;
    private double da;
    private double hr;

    public Salary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary + da + hr;
    }

    public void setDa(double daPercentage) {
        this.da = basicSalary * (daPercentage / 100);
    }

    public void setHr(double hrPercentage) {
        this.hr = basicSalary * (hrPercentage / 100);
    }

    public static void main(String[] args) {
        Salary employee1 = new Salary(10000);

        employee1.setDa(5);
        employee1.setHr(10);

        double totalSalary = employee1.calculateSalary();
        System.out.println("Total Salary: " + totalSalary);

        Salary employee2 = new Salary(20000);

        employee2.setDa(7);
        employee2.setHr(15);
        double totalSalary2 = employee2.calculateSalary();
        System.out.println("Total Salary of employee 2: " + totalSalary2);

    }
}
