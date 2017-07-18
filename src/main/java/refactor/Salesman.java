package refactor;

/**
 * Created by diego.severini on 7/18/2017.
 */
public class Salesman extends EmployeeType {
    @Override
    public int getTypeCode() {
        return EmployeeType.SALESMAN;
    }

    @Override
    public int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getCommission();
    }

    @Override
    public String toString() {
        return "Salesman{}";
    }
}
