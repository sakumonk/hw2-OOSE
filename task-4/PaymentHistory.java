// Task 4

import java.util.LinkedList;

public class PaymentHistory {

    private final LinkedList<Payment> payments; //from head to tail stored in chronological order

    public PaymentHistory() {
        payments = new LinkedList<>();
    }

    public void add_payment(Payment payment1) {

        for (Payment payment : payments) {
            if (payment.equals(payment1)) { //check for duplicate
                return;
            }
        }

        //if no duplicate then add into linked list
        payments.add(payment1);
    }

} 

