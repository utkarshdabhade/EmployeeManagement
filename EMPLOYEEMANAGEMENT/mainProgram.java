package EMPLOYEEMANAGEMENT;

public class mainProgram {
public static void main(String[] args) {
    techEmployee TE = new techEmployee("Utkarsh", "1st April", 101, 50000);
    TE.setShift("Day");
    TE.setSkill("Java");
 
    salesEmployee SE = new salesEmployee("Utkarsh", "1st April", 101, 50000);
    SE.setTarget(100000);
    SE.setDeadline("31-Mar-2023");
    SE.setConversion(50000);


    System.out.println(TE.getName());
    System.out.println(TE.getEmployeeID());
    System.out.println(TE.getJoiningDate());
    System.out.println(TE.getSalary());
    System.out.println(TE.getShift());
    System.out.println(TE.getSkill());



    System.out.println(SE.getName());
    System.out.println(SE.getEmployeeID());
    System.out.println(SE.getJoiningDate());
    System.out.println(SE.getSalary());
    System.out.println(SE.getConversion());
    System.out.println(SE.getDeadline());
    System.out.println(SE.getTarget());

}


}

