public abstract class Site {
    protected static final double TAX_RATE = 0.13;
    abstract double getTaxAmount();
    abstract double getBaseAmount();
    protected double getBillableAmount(){
        return getTaxAmount() + getBaseAmount();
    }
}
