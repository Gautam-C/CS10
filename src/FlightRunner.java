public class FlightRunner {

    public static void main(String[] Args) {

        Flight flight = new Flight(2222, 21, 4, 21, 4);

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveAdjacentSeats("ex","ex2", false));

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveWindowSeat("likes skies", false));

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveIndividualSeat("loner", false));

        System.out.println(System.lineSeparator());

        flight.digitalSeatReservations();

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveAdjacentSeats("lover1","lover2", false));

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveWindowSeat("likes takeoffs", false));

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveIndividualSeat("businessman's trip", false));

        System.out.println(System.lineSeparator());

        flight.digitalSeatReservations();

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveAdjacentSeats("ex3","ex4", false));

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveWindowSeat("faceAgainstWindow", false));

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveIndividualSeat("gf = null", false));

        System.out.println(System.lineSeparator());

        flight.digitalSeatReservations();

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveAdjacentSeats("aboutToBreakUp0","aboutToBreakUp1", false));

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveWindowSeat("Instagrammer", false));

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveIndividualSeat("sleeps", false));

        System.out.println(System.lineSeparator());

        flight.digitalSeatReservations();

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveAdjacentSeats("dormMate0","dormMate1", false));

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveWindowSeat("onPhone", false));

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveIndividualSeat("died", false));

        System.out.println(System.lineSeparator());

        flight.digitalSeatReservations();

        /**
         * First Class
         */
        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveAdjacentSeats("ex","ex2", true));

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveWindowSeat("likes skies", true));

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveIndividualSeat("loner", true));

        System.out.println(System.lineSeparator());

        flight.digitalSeatReservations();

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveAdjacentSeats("lover1","lover2", true));

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveWindowSeat("likes takeoffs", true));

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveIndividualSeat("businessman's trip", true));

        System.out.println(System.lineSeparator());

        flight.digitalSeatReservations();

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveAdjacentSeats("ex3","ex4", true));

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveWindowSeat("faceAgainstWindow", true));

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveIndividualSeat("gf = null", true));

        System.out.println(System.lineSeparator());

        flight.digitalSeatReservations();

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveAdjacentSeats("aboutToBreakUp0","aboutToBreakUp1", true));

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveWindowSeat("Instagrammer", true));

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveIndividualSeat("sleeps", true));

        System.out.println(System.lineSeparator());

        flight.digitalSeatReservations();

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveAdjacentSeats("dormMate0","dormMate1", true));

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveWindowSeat("onPhone", true));

        System.out.println(System.lineSeparator());

        System.out.println(flight.reserveIndividualSeat("died", true));

        System.out.println(System.lineSeparator());

        flight.digitalSeatReservations();
    }

}
