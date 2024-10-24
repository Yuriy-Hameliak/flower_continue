package ucu.edu.ua.flower_cont.payment;

public class PayPalPaymentStrategy implements Payment{
    public String pay(double price){
        return String.valueOf(price)+ "$ were payed by Pay Pal";
    }
}
