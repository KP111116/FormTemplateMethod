public class ResidentialSite extends Site{
    private double _units, _rate;

    public ResidentialSite(double _units, double _rate) {
        this._units = _units;
        this._rate = _rate;
    }
    public double getBaseAmount(){
        return _units * _rate;
    }
    public double getTaxAmount(){
        return getBaseAmount() * Site.TAX_RATE;
    }
}