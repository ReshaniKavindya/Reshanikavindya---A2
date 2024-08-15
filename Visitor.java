public class Visitor extends Person{
//The Visitor class is used to track the theme park visitors.
private String parkInfo;
private String Passesstype;

//Default constructor
public Visitor(){
    super();
    this.parkInfo = "Operating Days: Thursday - Sunday ";
    this.Passesstype = "VIP / GOLD / BRONZE / SILVER ";
}
//Passing parameterized constructor
    public Visitor(String personName, int age, int postalCode, String parkInfo, String passesstype){
    super(personName, age, postalCode);
    this.parkInfo = parkInfo;
    this.Passesstype = passesstype;
    }

//Getters and setters


    public String getParkInfo() {
        return parkInfo;
    }

    public String getPassesstype() {
        return Passesstype;
    }

    public void setParkInfo(String parkInfo) {
        this.parkInfo = parkInfo;
    }

    public void setPassesstype(String passesstype) {
        Passesstype = passesstype;
    }


}

