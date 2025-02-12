import java.util.Scanner;

public class CinemaReservationSystem {
    private static final int ROWS = 5; // Liczba rzędów w sali kinowej
    private static final int COLUMNS = 8; // Liczba miejsc w rzędzie
    private static String[][] seats = new String[ROWS][COLUMNS];

    public static void main(String[] args) {
        initializeSeats();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== System Rezerwacji Miejsc w Kinie ===");
            System.out.println("1. Wyświetl układ miejsc");
            System.out.println("2. Zarezerwuj miejsce");
            System.out.println("3. Zwolnij miejsce");
            System.out.println("4. Pokaż liczbę dostępnych miejsc");
            System.out.println("5. Wyjdź");
            System.out.print("Wybierz opcję: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> displaySeats();
                case 2 -> reserveSeat(scanner);
                case 3 -> freeSeat(scanner);
                case 4 -> countAvailableSeats();
                case 5 -> System.out.println("Do widzenia!");
                default -> System.out.println("Nieprawidłowy wybór, spróbuj ponownie.");
            }
        } while (choice != 5);
    }

    // Inicjalizacja miejsc - wszystkie miejsca są dostępne ("O")
    private static void initializeSeats() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                seats[i][j] = "O";
            }
        }
    }

    // Wyświetlenie układu miejsc w sali kinowej
    private static void displaySeats() {
        System.out.println("\nUkład miejsc w sali kinowej:");
        System.out.print("    "); // Wcięcie dla numerów kolumn
        for (int j = 0; j < COLUMNS; j++) {
            System.out.print((j + 1) + " ");
        }
        System.out.println();

        for (int i = 0; i < ROWS; i++) {
            System.out.print("Rząd " + (i + 1) + ": ");
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Rezerwacja miejsca
    private static void reserveSeat(Scanner scanner) {
        System.out.print("Podaj numer rzędu (1-" + ROWS + "): ");
        int row = scanner.nextInt() - 1;
        System.out.print("Podaj numer miejsca w rzędzie (1-" + COLUMNS + "): ");
        int column = scanner.nextInt() - 1;

        if (isValidSeat(row, column)) {
            if (seats[row][column].equals("O")) {
                seats[row][column] = "X";
                System.out.println("Miejsce zostało zarezerwowane.");
            } else {
                System.out.println("To miejsce jest już zajęte.");
            }
        } else {
            System.out.println("Nieprawidłowy numer miejsca.");
        }
    }

    // Zwolnienie miejsca
    private static void freeSeat(Scanner scanner) {
        System.out.print("Podaj numer rzędu (1-" + ROWS + "): ");
        int row = scanner.nextInt() - 1;
        System.out.print("Podaj numer miejsca w rzędzie (1-" + COLUMNS + "): ");
        int column = scanner.nextInt() - 1;

        if (isValidSeat(row, column)) {
            if (seats[row][column].equals("X")) {
                seats[row][column] = "O";
                System.out.println("Miejsce zostało zwolnione.");
            } else {
                System.out.println("To miejsce jest już wolne.");
            }
        } else {
            System.out.println("Nieprawidłowy numer miejsca.");
        }
    }

    // Policz dostępne miejsca
    private static void countAvailableSeats() {
        int count = 0;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (seats[i][j].equals("O")) {
                    count++;
                }
            }
        }
        System.out.println("Liczba dostępnych miejsc: " + count);
    }

    // Sprawdzenie, czy miejsce jest poprawne
    private static boolean isValidSeat(int row, int column) {
        return row >= 0 && row < ROWS && column >= 0 && column < COLUMNS;
    }
}
