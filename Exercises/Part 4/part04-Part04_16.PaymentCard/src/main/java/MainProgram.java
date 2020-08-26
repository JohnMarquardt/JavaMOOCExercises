
public class MainProgram {

    public static void main(String[] args) {

        PaymentCard paulscard = new PaymentCard(20);
        PaymentCard mattscard = new PaymentCard(30);
        paulscard.eatHeartily();
        mattscard.eatAffordably();
        System.out.println("Paul: " + paulscard.toString());
        System.out.println("Matt: " + mattscard.toString());
        paulscard.addMoney(20);
        mattscard.eatHeartily();
        System.out.println("Paul: " + paulscard.toString());
        System.out.println("Matt: " + mattscard.toString());
        paulscard.eatAffordably();
        paulscard.eatAffordably();
        mattscard.addMoney(50);
        System.out.println("Paul: " + paulscard.toString());
        System.out.println("Matt: " + mattscard.toString());
    }
}
