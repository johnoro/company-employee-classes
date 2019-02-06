package employeeApp;

public class Company {
  private static int currentId = 0;
  public int id;
  public String name;
  public int debt;

  public final static double match401K = 0.05;
  
  public Company(String name, int debt) {
    this.name = name;
    this.debt = debt;
    id = currentId++;
  }

  @Override
  public String toString() {
    String formatted = "id: " + id + "\n" +
                      "name: " + name + "\n" +
                      "debt: " + debt + "\n";
    return formatted;
  }
}
