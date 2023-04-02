package EMPLOYEEMANAGEMENT;
public class salesEmployee extends employeeDetail {
private double Target;
private String Deadline;
private double Conversion;

salesEmployee(String eName, String jD, int eID, double sly)

    {
        super(eName, jD, eID, sly);
        }

public double getTarget() {
    return Target;
}

public void setTarget(double target) {
    Target = target;
}

public String getDeadline() {
    return Deadline;
}

public void setDeadline(String deadline) {
    Deadline = deadline;
}

public double getConversion() {
    return Conversion;
}

public void setConversion(double conversion) {
    Conversion = conversion;
}

// public String Performance () {


}




