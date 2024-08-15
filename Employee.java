public class Employee extends Person {
//The Employee class is used to track the theme park staff who operate rides
//instance variables for the employee class
    private String position;
    private int empID;

    //Creating default constructor
    public Employee(){
        super();
        this.position = "";
        this.empID = 001;
    }

    //Passing parameterized constructor
    public Employee(String personName, int age, int postalCode, int empID, String position){
        super(personName, age, postalCode);
        this.position = position;
        this.empID = empID;
    }

    //Setters and getters
    public int getEmpID() {
        return empID;
    }

    public String getPosition() {
        return position;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void printEmpDetails(){
        System.out.println("Staff ID :" + empID);
        System.out.println("Staff Member Position:" + position);
    }
}


