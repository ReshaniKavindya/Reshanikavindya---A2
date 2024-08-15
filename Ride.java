import java.util.LinkedList;
import java.util.Queue;

public interface RideInterface(){
    void addVisitorToQueue(Visitor visitor);
    void removeVisitorFromQueue();
    void printQueue();
}
public class Ride implements RideInterface {
//The Ride class is used to track the rides available at the theme park, e.g., roller coaster, water riders, etc.
    private String listOfRides;
    private int peoplePerRide;
    private Employee operator;
    private Queue<Visitor> visitorQueue;


    //create default constructor
    public Ride(){
        this.listOfRides = "Roller coaster";
        this.peoplePerRide = 14;
        this.operator = null;
        this.visitorQueue = new LinkedList<>();

    }

    //Constructor for parameterized objects of Ride class
    public Ride(String listOfRides, int peoplePerRide, Employee operator){
        this.listOfRides = listOfRides;
        this.peoplePerRide = peoplePerRide;
        this.operator = operator;
        this.visitorQueue = new LinkedList<>();
    }

    //Getters and Setters
    public void setListOfRides(String listOfRides) {
        this.listOfRides = listOfRides;
    }

    public String getListOfRides() {
        return listOfRides;
    }

    public void setPeoplePerRide(int peoplePerRide) {
        this.peoplePerRide = peoplePerRide;
    }

    public int getPeoplePerRide() {
        return peoplePerRide;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public Employee getOperator() {
        return operator;
    }

    //To assign an Employee to operate the ride
    public void assignOperator(Employee newOperator){
        this.operator = newOperator;
    }

    public void addVisitorToQueue(Visitor visitor){
        visitorQueue.add(visitor);
        System.out.println("Visitor Name: " + visitor.getPersonName() + "added to the queue.");
    }
    public void removeVisitorFromQueue(Visitor visitor){
        if (visitorQueue.remove((visitor))){
            System.out.println("Visitor" + visitor.getPersonName() + "removed!");
            } else {
            System.out.println("Visitor" + visitor.getPersonName() + "Not found!");
        }
    }

    public void printQueue(){
        System.out.println("Visitors are waiting in the queue:");
        for (Visitor visitor : visitorQueue){
            System.out.println(" Name : " + visitor.getPersonName() + "Visitor Pass Type: " + visitor.getPassesstype());
        }
    }
}
