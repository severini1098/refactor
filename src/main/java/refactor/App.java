package refactor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final Employee employee1 = new Employee();
        employee1.setMontlySalary(10000);
        employee1.setType(0);
        System.out.println(employee1);
    }
}
