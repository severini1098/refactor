package refactor;

/**
 * Created by diego.severini on 7/18/2017.
 */
public class Employee {

    private EmployeeType _type;
    private int _monthSalary;
    private int _commission;
    private int _bonus;

    public int payAmount() {
        return _type.payAmount(this);
    }

    public int getType() {
        return _type.getTypeCode();
    }

    void setType(int arg) {
        _type = EmployeeType.newType(arg);
    }

    public int getMonthlySalary() {
        return _monthSalary;
    }

    public int getCommission() {
        return _commission;
    }

    public void setCommission(int commission) {
        _commission = commission;
    }

    public int getBonus() {
        return _bonus;
    }

    public void setBonus(int bonus) {
        _bonus = bonus;
    }

    public void setMontlySalary(int salary) {
        _monthSalary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "_type=" + _type +
                ", _monthSalary=" + _monthSalary +
                ", _commission=" + _commission +
                ", _bonus=" + _bonus +
                '}';
    }

    //Antes del refactor    
//    int payAmount() {
//        switch(_type) {
//            case ENGINEER:
//                return _monthSalary;
//            case SALESMAN:
//                return _monthSalary + _commision;
//            case MANAGER: 
//                return _monthSalary + _bonus;
//            default: 
//                throw new RuntimeException("Incorrect Employee");
//        }
//    }


}
