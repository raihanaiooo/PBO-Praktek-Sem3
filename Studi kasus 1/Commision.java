public class Commision extends Hourly {
    private double totalSales;
    private double commissionRate;

    public Commision(String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
        this.totalSales = 0;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay(){
        double payment = super.pay();
        payment += totalSales * commissionRate;
        totalSales = 0;
        return payment;
    }

    @Override
    public String toString(){
        String result = super.toString();
        result += "\nTotal Sales: "+totalSales+"\nCommission Rate: "+commissionRate+"\n";
        return result;
    }
}