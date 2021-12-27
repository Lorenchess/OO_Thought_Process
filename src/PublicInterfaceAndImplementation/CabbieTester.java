package PublicInterfaceAndImplementation;

public class CabbieTester {
    public static void main(String[] args) {
        Cab cab1940 = new Cab("myOldCab","chevrolet",1940,"blue");
        Cab myNewCab = new Cab("Toyota","camry",2021,"red");

        Cabbie oldCabbie = new Cabbie("OldUbber", "Ramon",cab1940);
        Cabbie newCabbie = new Cabbie("Ubber", "Michael",myNewCab);

        oldCabbie.giveDestination1940();
        //The cabbie takes a map and follows the route...
        //The cab is turning right...
        //The cab is turning left...

        newCabbie.giveDestination2021();
        //The cabbie turns on the GPS and follows the route...
    }
}
