package pers.crazymouse.exercises.myclass;

/**
 * Created by crazymouse on 5/25/16.
 */
public class Tax {
    public static final int SINGLE_FILER = 0, MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1,
            MARRIED_SEPARATELY = 2, HEAD_OF_HOUSEHOLD = 3;
    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax() {

    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets.clone();
        setRates(rates);
        this.taxableIncome = taxableIncome;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates.clone();
        for (int i = 0; i < rates.length; i++) {
            this.rates[i] = this.rates[i] / (this.rates[i] > 1 ? 100 : 1);
        }
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        double tax = 0;
        double income = taxableIncome;

        for (int i = 0, pre = 0; ; i++) {
            if (i == brackets[filingStatus].length - 1 || income <= (brackets[filingStatus][i] - pre)) {
                tax += income * rates[i];
                break;
            } else {
                tax += rates[i] * (brackets[filingStatus][i] - pre);
                income -= (brackets[filingStatus][i] - pre);
            }
            pre = brackets[filingStatus][i];
        }
        return tax;
    }
}
