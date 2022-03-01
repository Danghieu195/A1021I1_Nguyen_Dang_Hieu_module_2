package Case_Study.Controllers;

import Case_Study.Services.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {


    Scanner sc = new Scanner(System.in);

    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

    public EmployeeServiceImpl getEmployeeService() {
        return employeeService;
    }

    public void displayMainMenu() {

        int choice = -1;
        while (choice != 0) {
            System.out.println("Main Menu");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Managememt");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");

            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    int subChoice1 = -1;
                    while (subChoice1 != 0) {
                        System.out.println("EMPLOYEE MANAGEMENT");
                        System.out.println("1. Display list employees");
                        System.out.println("2. Add new employee");
                        System.out.println("3. Edit employee");
                        System.out.println("0. Return main menu");

                        System.out.println("Enter your choice: ");
                        subChoice1 = Integer.parseInt(sc.nextLine());

                        switch (subChoice1) {
                            case 1:
                                employeeService.display();
                                break;
                            case 2:
                            case 3:
                            case 0:
                        }
                    }
                    break;
//                case 2:
//                iStudentService.add();
//                    break;
//                case 3:
//                iStudentService.delete();
//                    break;
//                case 6:
//                    System.exit(0);

            }
        }
    }
}