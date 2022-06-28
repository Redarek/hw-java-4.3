public class CreditPaymentService {
    public double calculate(int credit, int duration) {
        double yearMoanRate = 9.99;
        double monthMoanRate = yearMoanRate / 100 / 12;
        duration *= 12;
        double result = credit * (monthMoanRate / (1 - Math.pow((1 + monthMoanRate), -duration)));

        return result;
    }
}
