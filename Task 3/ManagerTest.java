public class ManagerTest{
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Raihana Aisha", 2000000,1,10,1989);
        staff[1] = new Employee("Dimas Chairil", 2500000,1,12,1991);
        staff[2] = new Manager("Budi Susanto", 3000000,1,11,1993);

        System.out.println("Compare staff[0] vs staff[1]: " + staff[0].compare(staff[1]));
        System.out.println("Compare staff[1] vs staff[2]: " + staff[1].compare(staff[2]));
        System.out.println("Compare staff[2] vs staff[0]: " + staff[2].compare(staff[0]));

        int i;
        for(i = 0; i < 3; i++) staff[i].raiseSalary(5);
        for(i = 0; i < 3; i++) staff[i].print();
    }
}


