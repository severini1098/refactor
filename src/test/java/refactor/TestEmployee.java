package refactor;

import org.junit.Test;

/**
 * Created by diego.severini on 7/18/2017.
 */
public class TestEmployee {

    @Test
    public void shouldTestPaymentForEngineer() {
        final Employee employee = getEmployee(10000, 0, 0, EmployeeType.newType(EmployeeType.ENGINEER));
        assert employee.payAmount() == 10000;
        assert employee.getType() == EmployeeType.ENGINEER;
        assert employee.toString().equals("Employee{_type=Engineer{}, _monthSalary=10000, _commission=0, _bonus=0}");

    }

    @Test
    public void shouldTestPaymentForManager() {
        final Employee employee = getEmployee(9000, 10000, 0, EmployeeType.newType(EmployeeType.MANAGER));
        assert employee.payAmount() == 19000;
        assert employee.getType() == EmployeeType.MANAGER;
        assert employee.toString().equals("Employee{_type=Manager{}, _monthSalary=9000, _commission=0, _bonus=10000}");
    }

    @Test
    public void shouldTestPaymentForSalesman() {
        final Employee employee = getEmployee(8000, 0, 2000, EmployeeType.newType(EmployeeType.SALESMAN));
        assert employee.payAmount() == 10000;
        assert employee.getType() == EmployeeType.SALESMAN;
        assert employee.toString().equals("Employee{_type=Salesman{}, _monthSalary=8000, _commission=2000, _bonus=0}");
    }

    @Test(expected = RuntimeException.class)
    public void shouldTestPaymentForInvalidEmployee() {
        getEmployee(0, 0, 2000, EmployeeType.newType(4));
    }


    private Employee getEmployee(int salary, int bonus, int commission, EmployeeType type) {
        final Employee employee = new Employee();
        employee.setType(type.getTypeCode());
        employee.setMontlySalary(salary);
        employee.setBonus(bonus);
        employee.setCommission(commission);
        return employee;
    }
}
