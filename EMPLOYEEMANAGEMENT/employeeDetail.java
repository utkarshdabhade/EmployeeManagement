package EMPLOYEEMANAGEMENT;

public class employeeDetail {
    private String name;
    private String joiningDate;
    private int employeeID;
    private double salary;

    public employeeDetail (String eName, String jD, int eID, double sly) {
        this.name = eName;
        this.joiningDate = jD;
        this.employeeID = eID;
        this.salary = sly;

}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
