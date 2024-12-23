package Cafetiere;

public class Tasse {
    private float quantiteCafeMax;
    Cafe cafe;

    public Tasse() {
        this.quantiteCafeMax = 100.0f;
    }

    public Tasse(float quantiteCafeMax) {
        this.quantiteCafeMax = quantiteCafeMax;
    }

    public double boire(double quantiteBu) {
    	System.out.println(cafe.getQuantiteLiquideMl());
    	System.out.println(quantiteBu);
        if (cafe != null && cafe.getQuantiteLiquideMl() > 0) {
            double quantiteRestante = cafe.getQuantiteLiquideMl() - quantiteBu;
            if (quantiteRestante < 0) {
                cafe = new Cafe(cafe.getTypeCafe(), -100f);
                return 0.0;
            } else {
                cafe = new Cafe(cafe.getTypeCafe(), (float) quantiteRestante);
                return quantiteRestante;
            }
        }
        return 0.0;
    }

    public void boire() {
    	cafe = new Cafe(cafe.getTypeCafe(), 0.0f);
    }
    
    public void remplir(Cafe cafe) {
    	this.cafe = cafe;
    }

    public float getQuantiteCafeMax() {
        return quantiteCafeMax;
    }

    public Cafe getCafe() {
        return cafe;
    }
}