package EMPLOYEEMANAGEMENT;

public class techEmployee extends employeeDetail {
private String shift;
private String skill;

techEmployee(String eName, String jD, int eID, double sly)
{
super(eName, jD, eID, sly);
}

public String getShift() {
    if (shift == "Day"){
    return "Day Shift";
    } else if (shift == "Night") {
    return "Night Shift";    
    } else { 
    return "Invalid input";
}
}

public void setShift(String shift) {
    this.shift = shift;
}

public String getSkill() {
    return skill;
}

public void setSkill(String skill) {
    this.skill = skill;
}


}

