package employeeApp;

public class Employee {
  private static int currentId = 0;
  private int id;
  private String firstName;
  private String lastName;
  private double salary;
  private int companyId;
  private int healthPlanId;

  public Employee (String firstName, String lastName, double salary, int companyId, int healthPlanId) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
    this.companyId = companyId;
    this.healthPlanId = healthPlanId;
    id = currentId++;
  }

  // getters and setters
  public int getId() {
    return id;
  }

  public String getName() {
    return firstName + " " + lastName;
  }

  public void setFirstName(String name) {
    firstName = name;
  }

  public void setLastName(String name) {
    lastName = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}
