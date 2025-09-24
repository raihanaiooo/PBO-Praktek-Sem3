public class EmployeeTest{
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Raihana Aisha", 2000000,1,10,1989);
        staff[1] = new Employee("Dimas Chairil", 2500000,1,12,1991);
        staff[2] = new Employee("Budi Susanto", 3000000,1,11,1993);
        
        System.out.println("Compare staff[0] with staff[1] "+ staff[0].compare(staff[1]));
        Sortable.shell_sort(staff);


        int i;
        for(i = 0; i < 3; i++) staff[i].raiseSalary(5);
        for(i = 0; i < 3; i++) staff[i].print();
    }
}