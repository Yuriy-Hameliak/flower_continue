package ucu.edu.ua.flower_cont.payment;

public class CreditCardPaymentStrategy implements Payment{
    public String pay(double price){
        return String.valueOf(price)+ "$ were payed by Credit Card";
    }
}
