package fileIo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollDetails {
    public static List<EmployeeDetails> empList = new ArrayList<>();

 //   public EmployeePayRollDetails(String intId, String stringName, String doubleSalary) {
 //   }

    public void readEmployeeData(Scanner scanner) {
        System.out.println("Enter the id:");
        int id = scanner.nextInt();
        System.out.println("Enter the name:");
        String name = scanner.next();
        System.out.println("Enter the Salary:");
        double salary = scanner.nextInt();
        empList.add(new EmployeeDetails( id, name, salary)); //int=5, name=ashu, salary=4000
    }

    public void writeEmployeeData() {
        empList.forEach(System.out::println);
    }
    public static void main (String[]args )
    {
        Scanner scanner = new Scanner(System.in);
        EmployeePayRollDetails employeeObj = new EmployeePayRollDetails();
        employeeObj.readEmployeeData(scanner);
        employeeObj.writeEmployeeData();
    }
}
