public class AssignmentTwo {
    public static void main(String[] args) {

        //set up the default constructor for the person class
        Person P1 = new Person();
        P1.printPersonDetails();

        //Creating an instance using the constructor with parameters
        Person P2 = new Person("Sandun", 24, 3168);
        P2.printPersonDetails();

        //Create an employee
        Employee employee = new Employee("Malsha", 25, 3124, 002, "Water Slide Operator");
        employee.printEmpDetails();

        //Create a visitor
        Visitor visitor = new Visitor("Asela",35, 3748, "Operating Days: Thursday - Sunday", "GOLD");
        System.out.println("Person's Name: " + visitor.getPersonName());
        System.out.println("Ticket type: " + visitor.getPassesstype());
        System.out.println("Park Information: " + visitor.getParkInfo());

        //Create a Ride
        Ride rollerCoaster = new Ride("Green Lanter Coaster",20,employee);
        rollerCoaster.assignOperator(employee);

        System.out.println("List of Ride : " + rollerCoaster.getListOfRides());
        System.out.println("How many persons per ride?" + rollerCoaster.getPeoplePerRide());
        System.out.println("Ride Operator: " + rollerCoaster.getOperator().getPersonName());

        Visitor visitor1 = new Visitor("Ash",28,3008,"","VIP");
        Visitor visitor2 = new Visitor("Max",30,3174,"","SILVER");
        Visitor visitor3 = new Visitor("Perry",19,3589,"","VIP");
        Visitor visitor4 = new Visitor("Zack",27,3465,"","GOLD");
        Visitor visitor5 = new Visitor("Luke",35,3308,"","BRONZE");


        //add visitors to the queue
        Ride.addVisitorToQueue(visitor1);
        Ride.addVisitorToQueue(visitor2);
        Ride.addVisitorToQueue(visitor3);
        Ride.addVisitorToQueue(visitor4);
        Ride.addVisitorToQueue(visitor5);

        //Remove visitor from the queue
        Ride.removeVisitorFromQueue(visitor2);

        //Print all the visitors in the queue
        Ride.printQueue();


    }
}
