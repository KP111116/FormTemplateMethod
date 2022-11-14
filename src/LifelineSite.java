public class LifelineSite extends Site{
    private double _units, _rate;

    public LifelineSite(double _units, double _rate) {
        this._units = _units;
        this._rate = _rate;
    }
    protected double getBaseAmount(){
        return _units * _rate * 0.5;
    }
    protected double getTaxAmount(){
        return getBaseAmount() * Site.TAX_RATE * 0.2;
    }

}
