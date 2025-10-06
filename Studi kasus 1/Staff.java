public class Staff {
    StaffMember[] staffList;

    public Staff(){
        staffList = new StaffMember[8];

        // Executive
        staffList[0] = new Executive("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        
        // Employee
        staffList[1] = new Employee("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
        
        // Hourly
        staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);
        
        // Volunteer
        staffList[4] = new Volunteer("Norm", "987 Suds Blvd", "555-8374");
        staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");

        // Commision
        staffList[6] = new Commision("Alice", "111 Market St.", "555-1111","111-22-3333", 6.25, 0.20);

        staffList[7] = new Commision("Bob", "222 Broad Ave.", "555-2222","222-33-4444", 9.75, 0.15);

        ((Executive)staffList[0]).awardBonus(500.00);
        ((Hourly)staffList[3]).addHours(40);

        ((Commision) staffList[6]).addHours(35);
        ((Commision) staffList[6]).addSales(400);

        ((Commision) staffList[7]).addHours(40);
        ((Commision) staffList[7]).addSales(950);
    }

    public void payday(){
        double amount;
        for(int count=0;count<staffList.length;count++){
            System.out.println(staffList[count]);

            amount = staffList[count].pay(); // polymorphic
            if(amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);
        }
    }
}