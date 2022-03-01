package Case_Study.Services;

import Case_Study.Model.Employee;
import Case_Study.Services.interfaces.EmployeeService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    public static Scanner sc = new Scanner(System.in);

    List<Employee> employees;

    public static List<Employee> dataEmployee = new ArrayList<>();

    static {
        Employee employee1 = new Employee("E001", "Alex", "Male", "01-01-1997", "212213", "0999912345", "acb@gmail.com", "College", "Receptionist", 7000000);
        Employee employee2 = new Employee("E002", "Joe", "Female", "01-01-1998", "1231251", "011223344", "csf@hotmail.com", "University", "Advisor", 10000000);
        Employee employee3 = new Employee("E003", "Axe", "Male", "01-01-1999", "9857872", "0123123123", "asdasd@yahoo.com", "College", "Intership", 5000000);
        Employee employee4 = new Employee("E004", "John", "Male", "01-01-1979", "C1092387", "0123456789", "johncena@outlook.com", "University", "President", 500000000);

        dataEmployee.add(employee1);
        dataEmployee.add(employee2);
        dataEmployee.add(employee3);
        dataEmployee.add(employee4);

    }

//    public EmployeeServiceImpl() {
//        try {
//            System.out.println("Mời bạn nhập đường dẫn: ");
//            String path = sc.nextLine();
//
//            File file = new File(path);
//            file.createNewFile();
//
//            if (!file.exists()) {
//                employees = dataEmployee;
//            } else {
//                employees = new ArrayList<>();
//                readCSVToEmployee(path);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }
//    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void writeEmployeeToCSV(String filePath) {
        try {
            File file = new File(filePath);
            file.createNewFile();

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            FileWriter fileWriter = new FileWriter(filePath, true);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("Danh sách nhân viên là: ");
            for (Employee employee : dataEmployee) {
                bufferedWriter.append(employee.getPersonCode());
                bufferedWriter.append(",");
                bufferedWriter.append(employee.getName());
                bufferedWriter.append(",");
                bufferedWriter.append(employee.getDateOfBirth());
                bufferedWriter.append(",");
                bufferedWriter.append(employee.getSex());
                bufferedWriter.append(",");
                bufferedWriter.append(employee.getIdentifiNumber());
                bufferedWriter.append(",");
                bufferedWriter.append(employee.getPhoneNumber());
                bufferedWriter.append(",");
                bufferedWriter.append(employee.getPersonEmail());
                bufferedWriter.append(",");
                bufferedWriter.append(employee.getPosition());
                bufferedWriter.append(",");
                bufferedWriter.append(employee.getLevel());
                bufferedWriter.append(",");
                bufferedWriter.append("").append(String.valueOf(employee.getSalary()));
                bufferedWriter.append("\n");
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public void readCSVToEmployee(String filePath) {
        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void display() {
        for (Employee employee : employees) {
            System.out.printf("|%-15s|%-15s|%-15s|%-8s|%-18s|%-15s|%-20s|%-15s|%-20s|%-10.0f|%n", employee.getPersonCode(), employee.getName(), employee.getDateOfBirth(),
                    employee.getSex(), employee.getIdentifiNumber(), employee.getPhoneNumber(), employee.getPersonEmail(), employee.getLevel(),
                    employee.getPosition(), employee.getSalary());
        }
    }


//    public static void main(String[] args) {
//        EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
//
//        System.out.println("Mời bạn nhập đường dẫn: ");
//        String path = sc.nextLine();
//
//        employeeServiceImpl.writeEmployeeToCSV(path);
//        employeeServiceImpl.readCSVToEmployee(path);
//
//    }
}



