public abstract class Person {
    private String personName;
    private int age;
    private int postalCode;

    //Default constructor for Person's class
    public Person(){
        this.personName = "Kaai";
        this.age = 23;
        this.postalCode = 3174;
    }

    //Constructor for objects of person's class
    public Person(String personName, int age, int postalCode){
       this.personName = personName;
       this.age = age;
       this.postalCode = postalCode;
    }

    //Method to access the properties
    public int getAge(){
        return age;
    }
    public int getPostalCode() {
        return postalCode;
    }
    public String getPersonName() {
        return personName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public void printPersonDetails(){
        System.out.println("Person name:" + personName);
        System.out.println("Person Age:" + age);
        System.out.println("Person's Address / Postal Code:" + postalCode);
    }
}
