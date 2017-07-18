package refactor;

/**
 * Created by diego.severini on 7/18/2017.
 */
public class Manager extends EmployeeType {
    @Override
    public int getTypeCode() {
        return EmployeeType.MANAGER;
    }

    @Override
    public int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getBonus();
    }

    @Override
    public String toString() {
        return "Manager{}";
    }
}
