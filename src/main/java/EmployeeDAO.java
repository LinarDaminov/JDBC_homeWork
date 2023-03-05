import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {

    void addEmployee(String firstName, String lastName, String gender, Integer age, Integer cityId);

    Employee getById(Integer id);

    List<Employee> getAllEmployees();
    Employee updateEmployeeById(Integer id, String firstName, String lastName, String gender, Integer age,
                                Integer cityId);
    void deleteById(int id);

}
