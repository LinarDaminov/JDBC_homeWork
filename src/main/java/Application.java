import java.sql.*;
import java.util.List;

public class Application
{
    public static void main(String[] args) throws SQLException
    {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        Employee employee = new Employee("Maria", "Egorova", "male", 22, 1);
        employeeDAO.addEmployee(employee);
        System.out.println(employeeDAO.getById(7));
        List<Employee> list = employeeDAO.getAllEmployees();

        for (Employee emp : list) {
            System.out.println(emp);
        }
        employeeDAO.deleteEmployee(employee);

    }
}

