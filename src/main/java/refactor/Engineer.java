package refactor;

/**
 * Created by diego.severini on 7/18/2017.
 */
public class Engineer extends EmployeeType {

    @Override
    public int getTypeCode() {
        return EmployeeType.ENGINEER;
    }

    @Override
    public int payAmount(Employee emp) {
        return emp.getMonthlySalary();
    }

    @Override
    public String toString() {
        return "Engineer{}";
    }
}
