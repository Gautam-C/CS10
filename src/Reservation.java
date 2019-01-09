public class Reservation {

    private String name;

    private int flightNumber;

    private boolean fClass;

    public Reservation(int flightNumber1, String name1, boolean fClass1) {

        name = name1;
        flightNumber = flightNumber1;
        fClass = fClass1;

    }

    public Reservation() {

        name = "Not Registered";
        flightNumber = 0000;
        fClass = false;

    }

    public void changeNumber(int newNumber) {

        flightNumber = newNumber;

    }

    public int getNumber() {

        return flightNumber;
    }

    public String getName() {

        return name;
    }

    public void switchName(String newName) {

        name = newName;
    }

    public void switchFClass(boolean newClass) {

        fClass = newClass;
    }

    public boolean getFClass() {

        return fClass;
    }

    public String toString() {

        return "Name : " + name + ", " + flightNumber;

    }

    public String modToString() {

        return name;

    }

}
