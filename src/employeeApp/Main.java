package employeeApp;

// 'Main' is just convention.
public class Main {
  private static void workWithData() {
    HealthPlan h1 = new HealthPlan("Plan #1");
    HealthPlan h2 = new HealthPlan("Plan #2");

    Company c1 = new Company("Company #1", 100);
    Company c2 = new Company("Company #2", 100);

    Employee e1 = new Employee("John", "Foo", 45000, c1.id, h1.getId());
    Employee e2 = new Employee("Julia", "Bar", 80000, c2.id, h2.getId());

    System.out.println("*** Query Data ***");
    System.out.println(c1);

    System.out.println("Original divided by 5: " + c1.debt / 5);
    System.out.println("Original divided by 7: " + c1.debt / 7);
  }

  public static void main(String[] args) {
    workWithData();
  }
}