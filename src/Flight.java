public class Flight {

    private Reservation [][] fPlane;

    private Reservation [][] ePlane;

    private int number;

    public Flight(int number1, int fRows, int fColumns, int eRows, int eColumns) {

        number = number1;
        ePlane = new Reservation [eRows][eColumns];
        fPlane = new Reservation [fRows][fColumns];

    }

    public boolean reserveAdjacentSeats(String name1, String name2, boolean fClass) {

        if (fClass) {

            for (int r = 0; r < fPlane.length; r++) {
                for (int c = 0; c < fPlane[r].length - 1; c++) {

                    if (fPlane[r][c] == null && fPlane[r][c+1] == null) {

                        Reservation yes = new Reservation(number, name1, fClass);
                        Reservation no = new Reservation(number, name2, fClass);

                        fPlane[r][c] = yes;
                        fPlane[r][c + 1] = no;

                        return true;
                    }

                }

            }
            return false;
        } else {

            for (int r = 0; r < ePlane.length; r++) {
                for (int c = 0; c < ePlane[r].length - 1; c++) {

                    if (ePlane[r][c] == null && ePlane[r][c+1] == null) {

                        Reservation yes = new Reservation(number, name1, fClass);
                        Reservation no = new Reservation(number, name2, fClass);

                        ePlane[r][c] = yes;
                        ePlane[r][c + 1] = no;

                        return true;
                    }

                }

            }
            return false;
        }
    }

    public boolean reserveWindowSeat(String name, boolean fClass) {

        if (fClass) {

            for (int r = 0; r < fPlane.length; r++) {

                if (fPlane[r][0] == null) {

                    Reservation yes = new Reservation(number, name, fClass);

                    fPlane [r][0] = yes;

                    return true;

                } else if (fPlane[r][fPlane[0].length - 1] == null) {

                    Reservation yes = new Reservation(number, name, fClass);

                    fPlane [r][fPlane[0].length - 1] = yes;

                    return true;
                }
            }
            return false;
        } else {

            for (int r = 0; r < ePlane.length; r++) {

                if (ePlane[r][0] == null) {

                    Reservation yes = new Reservation(number, name, fClass);

                    ePlane [r][0] = yes;

                    return true;

                } else if (ePlane[r][ePlane[0].length - 1] == null) {

                    Reservation yes = new Reservation(number, name, fClass);

                    ePlane [r][ePlane[0].length - 1] = yes;

                    return true;
                }

            }
            return false;

        }
    }

    public boolean reserveIndividualSeat(String name, boolean fClass) {

        if (fClass) {

            for (int r = 0; r < fPlane.length; r++) {
                for (int c = 0; c < fPlane[0].length; c++) {

                    if (fPlane[r][c] == null) {

                        Reservation yes = new Reservation(number, name, fClass);

                        fPlane [r][c] = yes;

                        return true;
                    }

                }
            }
            return false;
        } else {

            for (int r = 0; r < ePlane.length; r++) {
                for (int c = 0; c < ePlane[0].length; c++) {

                    if (ePlane[r][c] == null) {

                        Reservation yes = new Reservation(number, name, fClass);

                        ePlane [r][c] = yes;

                        return true;
                    }

                }
            }
            return false;
        }
    }

    public void digitalSeatReservations() {

        System.out.println("First Class Plane Reservations");
        for (int r = 0; r < fPlane.length; r++) {

            System.out.println();
            System.out.print("[ ");

            for (int c = 0; c < fPlane[0].length; c++) {

                if (fPlane[r][c] == null) {

                    System.out.print("empty; ");

                } else {
                    System.out.print(fPlane[r][c].modToString() + "; ");
                }

            }

            System.out.print(" ]");
        }
        System.out.println(System.lineSeparator());
        System.out.println();
        System.out.println("Economy Class Plane Reservations");
        for (int r = 0; r < ePlane.length; r++) {

            System.out.println();
            System.out.print("[ ");

            for (int c = 0; c < ePlane[0].length; c++) {

                if (ePlane[r][c] == null) {

                    System.out.print("empty; ");

                } else {
                    System.out.print(ePlane[r][c].modToString() + "; ");
                }

            }

            System.out.print(" ]");
        }
    }

}

