package maps_HashMap;

// interface k andar interface that is the example of if the building it under construction then
// the flats are also abstract and the rooms in that flats are also abstract.

interface Map1{

    // inner interface
    interface Entry1{
        // method
        void m1();
    }
}

public class MapEntryClass implements  Map1.Entry1 {
    public static void main(String[] args) {
        System.out.println("Start");

        System.out.println("Stops");
    }

    @Override
    public void m1() {

    }
}
