public class Facade {
    private PresencialApi presencial;
    private WebApi web;
    private MovilApi movil;
    private TelefonoApi telefono;

    public Facade() {
        this.presencial = new PresencialApi();
        this.web = new WebApi();
        this.movil = new MovilApi();
        this.telefono = new TelefonoApi();
    }

    public void realizarOp(String tipo) {
        switch(tipo.toLowerCase()) {
            case "presencial":
                presencial.realizarOp();
                break;
            case "web":
                web.realizarOp();
                break;
            case "movil":
                movil.realizarOp();
                break;
            case "telefono":
                telefono.realizarOp();
                break;
            default:
                System.out.println("Tipo de operación no soportado");
        }
    }
}

// Subsistemas (simplificados según diagrama)
class PresencialApi {
    public void realizarOp() {
        System.out.println("Operación presencial realizada");
    }
}

class WebApi {
    public void realizarOp() {
        System.out.println("Operación web realizada");
    }
}

class MovilApi {
    public void realizarOp() {
        System.out.println("Operación móvil realizada");
    }
}

class TelefonoApi {
    public void realizarOp() {
        System.out.println("Operación telefónica realizada");
    }
}