public class Salesperson implements Comparable{
    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales){
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString(){
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    public boolean equals(Object other){
        return (lastName.equals(((Salesperson)other).getLastName()) &&
                firstName.equals(((Salesperson)other).getFirstName()));
    }

    public int compareTo(Object other) {
        Salesperson sp = (Salesperson) other;

        // Urut berdasarkan totalSales (descending)
        if (this.totalSales != sp.getSales()) {
            return sp.getSales() - this.totalSales;
        }

        // Kalau totalSales sama -> bandingkan lastName reverse alphabetical
        int lastCompare = sp.getLastName().compareTo(this.lastName);
        if (lastCompare != 0) {
            return lastCompare;
        }

        // Kalau lastName sama -> bandingkan firstName reverse alphabetical
        return sp.getFirstName().compareTo(this.firstName);
    }


    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getSales(){
        return totalSales;
    }
}