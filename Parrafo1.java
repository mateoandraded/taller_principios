public interface CreditCard {
    double getLimite();
    double getCostoAnual();
    String getTipo();
}

public abstract class CreditCardCreator {
    public abstract CreditCard createCreditCard(double ingresos, int antiguedad);

    protected boolean validarDatos(double ingresos, int antiguedad) {
        return ingresos > 0 && antiguedad >= 0;
    }
}

public class BasicCard implements CreditCard {
    private double limite;
    private double costoAnual;

    public BasicCard(double limite, double costoAnual) {
        this.limite = limite;
        this.costoAnual = costoAnual;
    }

    @Override public double getLimite() { return limite; }
    @Override public double getCostoAnual() { return costoAnual; }
    @Override public String getTipo() { return "Básica"; }
}

public class PremiumCard implements CreditCard {
    private double limite;
    private double costoAnual;

    public PremiumCard(double limite, double costoAnual) {
        this.limite = limite;
        this.costoAnual = costoAnual;
    }

    @Override public double getLimite() { return limite; }
    @Override public double getCostoAnual() { return costoAnual; }
    @Override public String getTipo() { return "Premium"; }
}

public class VIPCard implements CreditCard {
    private double limite;
    private double costoAnual;

    public VIPCard(double limite, double costoAnual) {
        this.limite = limite;
        this.costoAnual = costoAnual;
    }

    @Override public double getLimite() { return limite; }
    @Override public double getCostoAnual() { return costoAnual; }
    @Override public String getTipo() { return "VIP"; }
}

public class BasicCardCreator extends CreditCardCreator {
    @Override
    public CreditCard createCreditCard(double ingresos, int antiguedad) {
        if(!validarDatos(ingresos, antiguedad)) throw new IllegalArgumentException("Datos inválidos");
        return new BasicCard(1000.0, 50.0);
    }
}

public class PremiumCardCreator extends CreditCardCreator {
    @Override
    public CreditCard createCreditCard(double ingresos, int antiguedad) {
        if(!validarDatos(ingresos, antiguedad)) throw new IllegalArgumentException("Datos inválidos");
        if(ingresos < 2000 || antiguedad < 1) return null;
        return new PremiumCard(5000.0, 100.0);
    }
}

public class VIPCardCreator extends CreditCardCreator {
    @Override
    public CreditCard createCreditCard(double ingresos, int antiguedad) {
        if(!validarDatos(ingresos, antiguedad)) throw new IllegalArgumentException("Datos inválidos");
        if(ingresos < 5000 || antiguedad < 2) return null;
        return new VIPCard(10000.0, 200.0);
    }
}