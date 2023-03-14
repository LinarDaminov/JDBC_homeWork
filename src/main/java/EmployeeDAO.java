import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {

    void addEmployee(Employee employee);

    Employee getById(int id);

    List<Employee> getAllEmployees();
    void updateEmployeeById(Employee employee);
    void deleteEmployee(Employee employee);

}
