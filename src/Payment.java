public abstract class Payment {
    abstract void payment(float amount);
    private int paymentMethod;
    public void setPaymentMethod(int payMethod){
        paymentMethod = payMethod;
    }
    public int getPaymentMethod(){
        return paymentMethod;
    }
    public void onPaymentSuccessful(){
        System.out.println("Your Payment.Payment is Successful.");
    }
}
