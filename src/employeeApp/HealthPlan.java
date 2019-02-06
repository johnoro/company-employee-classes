package employeeApp;

public class HealthPlan {
  private static int currentId = 0;
  private int id;
  private String name;

  public HealthPlan(String name) {
    this.name = name;
    id = currentId++;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}