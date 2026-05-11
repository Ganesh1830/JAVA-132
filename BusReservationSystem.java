/**
 * 
 */
package Bus;

/**
 * Onkar Swami
 */
import java.util.Scanner;

class Bus {
    int busNo;
    String driver;
    boolean[] seats;

    Bus(int busNo, String driver, int totalSeats) {
        this.busNo = busNo;
        this.driver = driver;
        seats = new boolean[totalSeats];
    }

    void showSeats() {
        System.out.println("\nSeat Status for Bus " + busNo);

        for (int i = 0; i < seats.length; i++) {
            if (seats[i]) {
                System.out.print("[X] ");
            } else {
                System.out.print("[" + (i + 1) + "] ");
            }

            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    void bookSeat(int seatNo) {
        if (seatNo < 1 || seatNo > seats.length) {
            System.out.println("Invalid Seat Number!");
            return;
        }

        if (seats[seatNo - 1]) {
            System.out.println("Seat already booked!");
        } else {
            seats[seatNo - 1] = true;
            System.out.println("Seat " + seatNo + " booked successfully!");
        }
    }

    void cancelSeat(int seatNo) {
        if (seatNo < 1 || seatNo > seats.length) {
            System.out.println("Invalid Seat Number!");
            return;
        }

        if (!seats[seatNo - 1]) {
            System.out.println("Seat is already empty!");
        } else {
            seats[seatNo - 1] = false;
            System.out.println("Seat " + seatNo + " cancelled successfully!");
        }
    }

    void generateTicket(String passengerName, int seatNo) {
        System.out.println("\n========== BUS TICKET ==========");
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Bus Number     : " + busNo);
        System.out.println("Driver Name    : " + driver);
        System.out.println("Seat Number    : " + seatNo);
        System.out.println("Status         : CONFIRMED");
        System.out.println("================================");
    }
}

public class BusReservationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bus bus1 = new Bus(101, "Rahul", 20);

        int choice;

        do {
            System.out.println("\n===== BUS RESERVATION SYSTEM =====");
            System.out.println("1. Show Seats");
            System.out.println("2. Book Seat");
            System.out.println("3. Cancel Seat");
            System.out.println("4. Generate Ticket");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    bus1.showSeats();
                    break;

                case 2:
                    System.out.print("Enter seat number to book: ");
                    int seatBook = sc.nextInt();
                    bus1.bookSeat(seatBook);
                    break;

                case 3:
                    System.out.print("Enter seat number to cancel: ");
                    int seatCancel = sc.nextInt();
                    bus1.cancelSeat(seatCancel);
                    break;

                case 4:
                    sc.nextLine();

                    System.out.print("Enter passenger name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter booked seat number: ");
                    int seatTicket = sc.nextInt();

                    if (bus1.seats[seatTicket - 1]) {
                        bus1.generateTicket(name, seatTicket);
                    } else {
                        System.out.println("Seat not booked yet!");
                    }
                    break;

                case 5:
                    System.out.println("Thank You for Using Bus Reservation System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
