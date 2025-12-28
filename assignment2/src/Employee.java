public class Employee extends Human implements IWorkable, IStudy {
    private String company;
    private float salary;

    public Employee(int age, String name, boolean isWorking, String company, float salary) {
        super(age, name, isWorking);
        this.company = company;
        this.salary = salary;
    }

    @Override
    public String sayYourPosition() {
        return "I am employee";
    }
    @Override
    public String getSpecificInfo() {
        return "Works at " + company + ", salary: " + salary;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public void increaseSalary(float amount) {
        salary += amount;
        System.out.println(name + "'s salary increased by " + amount + ". New salary: " + salary);
    }

    @Override
    public String workStatus() {
        return isWorking ? "Currently employed" : "Not employed";
    }

    @Override
    public String getUniversity() {
        return "N/A (Employee)";
    }

    @Override
    public float getGpa() {
        return 0.0f;
    }

    @Override
    public void improveGpa(float increment) {
        System.out.println("Employees do not have GPA.");
    }

    public float getSalary() { return salary; }
    public void setSalary(float salary) { this.salary = salary; }
    public void setCompany(String company) { this.company = company; }
}
