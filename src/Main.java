public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int credit = 1_000_000;

        System.out.println(Math.round(service.calculate(credit, 1)));
        System.out.println(Math.round(service.calculate(credit, 2)));
        System.out.println(Math.round(service.calculate(credit, 3)));

    }

}
