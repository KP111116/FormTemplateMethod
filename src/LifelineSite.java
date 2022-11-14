public class LifelineSite extends Site{
    private double _units, _rate;

    public LifelineSite(double _units, double _rate) {
        this._units = _units;
        this._rate = _rate;
    }
    private double getBaseAmount(){
        return _units * _rate * 0.5;
    }
    private double getTaxAmount(){
        return getBaseAmount() * Site.TAX_RATE * 0.2;
    }

    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }
}
