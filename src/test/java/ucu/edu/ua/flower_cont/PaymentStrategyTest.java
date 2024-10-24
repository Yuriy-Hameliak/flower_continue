package ucu.edu.ua.flower_cont;
import ucu.edu.ua.flower_cont.payment.Payment;
import ucu.edu.ua.flower_cont.payment.CreditCardPaymentStrategy;
import ucu.edu.ua.flower_cont.payment.PayPalPaymentStrategy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentStrategyTest {

    @Test
    public void testCreditCardPayment() {
        Payment payment = new CreditCardPaymentStrategy();
        String result = payment.pay(100.0);
        assertEquals("100.0$ were payed by Credit Card", result);
    }

    @Test
    public void testPayPalPayment() {
        Payment payment = new PayPalPaymentStrategy();
        String result = payment.pay(50.0);
        assertEquals("50.0$ were payed by Pay Pal", result);
    }
}
