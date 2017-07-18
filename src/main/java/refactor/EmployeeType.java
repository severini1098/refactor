package refactor;

public abstract class EmployeeType {
    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;

    public static EmployeeType newType(int code) {
        switch (code) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                new RuntimeException("Incorrect {} code");
        }
        return null;
    }

    abstract public int getTypeCode();

    abstract public int payAmount(Employee emp);

    @Override
    public String toString() {
        return "EmployeeType{}";
    }
}
