package Cafetiere;

public class Cafe {
	TypeCafe typeCafe;
    double quantiteLiquideMl;
    
    public Cafe() {
        this.typeCafe = TypeCafe.MOKA;
        this.quantiteLiquideMl = 100;
    }

    public Cafe(TypeCafe typeCafe, double quantiteLiquideMl) {
        this.typeCafe = typeCafe;
        this.quantiteLiquideMl = quantiteLiquideMl;
	}
    
    public TypeCafe getTypeCafe() {
        return typeCafe;
    }

    public double getQuantiteLiquideMl() {
        return quantiteLiquideMl;
    }

	public int getVolume() {
		return 0;
	}
}