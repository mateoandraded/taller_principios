public class FacadeTienda {
    private SubsistemaInventario inventario;
    private SubsistemaPagos pagos;
    private SubsistemaClientes clientes;

    public FacadeTienda() {
        this.inventario = new SubsistemaInventario();
        this.pagos = new SubsistemaPagos();
        this.clientes = new SubsistemaClientes();
    }

    public void realizarOperacion(String canal, String operacion, Object... parametros) {
        switch(canal.toLowerCase()) {
            case "presencial":
                realizarOperacionPresencial(operacion, parametros);
                break;
            case "web":
                realizarOperacionWeb(operacion, parametros);
                break;
            case "movil":
                realizarOperacionMovil(operacion, parametros);
                break;
            case "telefonico":
                realizarOperacionTelefonico(operacion, parametros);
                break;
            default:
                throw new UnsupportedOperationException("Canal no soportado");
        }
    }

    private void realizarOperacionPresencial(String operacion, Object... parametros) {
        // Lógica compleja que coordina subsistemas
        System.out.println("Operación presencial completada");
    }

    private void realizarOperacionWeb(String operacion, Object... parametros) {
        // Lógica específica para web
        System.out.println("Operación web completada");
    }

    private void realizarOperacionMovil(String operacion, Object... parametros) {
        // Lógica específica para móvil
        System.out.println("Operación móvil completada");
    }

    private void realizarOperacionTelefonico(String operacion, Object... parametros) {
        // Lógica específica para teléfono
        System.out.println("Operación telefónica completada");
    }
}

// Subsistemas (simplificados)
class SubsistemaInventario { /* ... */ }
class SubsistemaPagos { /* ... */ }
class SubsistemaClientes { /* ... */ }