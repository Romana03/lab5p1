import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees (N): ");
        int numberOfEmployees = scanner.nextInt();

        ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            scanner.nextLine(); // Consumăm newline pentru a evita probleme la citirea următoarei linii

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Hourly Rate: ");
            double hourRate = scanner.nextDouble();

            System.out.print("Capacity (work hours per day): ");
            int capacity = scanner.nextInt();

            System.out.print("Free Days: ");
            int freeDays = scanner.nextInt();

            employees.add(new Employee(name, email, hourRate, capacity, freeDays));
        }

        System.out.println("\nMonthly Income for each Employee:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": $" + employee.calculateMonthlyIncome());
        }

        scanner.close();
    }
}