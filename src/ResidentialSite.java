public class ResidentialSite extends Site{
    private double _units, _rate;

    public ResidentialSite(double _units, double _rate) {
        this._units = _units;
        this._rate = _rate;
    }

    private double getBaseAmount(){
        return _units * _rate;
    }
    private double getTaxAmount(){
        return getBaseAmount() * Site.TAX_RATE;
    }

    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }
}