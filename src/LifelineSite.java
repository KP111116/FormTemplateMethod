public class LifelineSite extends Site{
    private double _units, _rate;

    public LifelineSite(double _units, double _rate) {
        this._units = _units;
        this._rate = _rate;
    }

    public double getBillableAmount(){
        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }
}
