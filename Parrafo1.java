public interface CreditCard {
    double getLimite();
    double getCostoAnual();
}

public abstract class CreditCardCreator {
    public abstract CreditCard createCreditCard();
}

public class BasicCard implements CreditCard {
    private double limite;
    private double costoAnual;

    public BasicCard(double limite, double costoAnual) {
        this.limite = limite;
        this.costoAnual = costoAnual;
    }

    @Override
    public double getLimite() { return limite; }
    @Override
    public double getCostoAnual() { return costoAnual; }
}

public class PremiumCard implements CreditCard {
    private double limite;
    private double costoAnual;

    public PremiumCard(double limite, double costoAnual) {
        this.limite = limite;
        this.costoAnual = costoAnual;
    }

    @Override
    public double getLimite() { return limite; }
    @Override
    public double getCostoAnual() { return costoAnual; }
}

public class VIPCard implements CreditCard {
    private double limite;
    private double costoAnual;

    public VIPCard(double limite, double costoAnual) {
        this.limite = limite;
        this.costoAnual = costoAnual;
    }

    @Override
    public double getLimite() { return limite; }
    @Override
    public double getCostoAnual() { return costoAnual; }
}

public class BasicCardCreator extends CreditCardCreator {
    @Override
    public CreditCard createCreditCard() {
        // Validación simple manteniendo diagrama
        return new BasicCard(1000.0, 50.0);
    }
}

public class PremiumCardCreator extends CreditCardCreator {
    @Override
    public CreditCard createCreditCard() {
        // Validación simple manteniendo diagrama
        return new PremiumCard(5000.0, 100.0);
    }
}

public class VIPCardCreator extends CreditCardCreator {
    @Override
    public CreditCard createCreditCard() {
        // Validación simple manteniendo diagrama
        return new VIPCard(10000.0, 200.0);
    }
}