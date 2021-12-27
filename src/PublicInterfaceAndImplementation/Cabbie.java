package PublicInterfaceAndImplementation;

//Defines a class for a cabbie

public class Cabbie {
    private String companyName;
    private String name;
    private Cab myCab;

    public Cabbie(String companyName, String name, Cab myCab) {
        this.companyName = companyName;
        this.name = name;
        this.myCab = myCab;
    }
    //Accessor Methods (Public Interface)
    public String getCompanyName() {
        return companyName;
    }

    public String getName() {
        return name;
    }

    public Cab getMyCab() {
        System.out.println(myCab);
        return myCab;
    }
    //Public Interface Method
    public void giveDestination1940 () {
        useAMap();
        turnRight();
        turnLeft();
    }
    public void giveDestination2021 () {
        useGPS();
    }

    @Override
    public String toString() {
        return "Cabbie{" +
                "companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", myCab=" + myCab +
                '}';
    }

    //Private Implementation
    private void turnRight () {
        System.out.println("The cab is turning right...");
    }
    private void turnLeft () {
        System.out.println("The cab is turning left...");
    }
    private void useAMap () {
        System.out.println("The cabbie takes a map and follows the route...");
    }
    private void useGPS () {
        System.out.println("The cabbie turns on the GPS and follows the route...");
    }
}
