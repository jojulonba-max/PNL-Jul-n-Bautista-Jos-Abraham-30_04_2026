import java.util.HashMap;

public class Paciente extends Persona {

    private HashMap<String, String> historialMedico;

    public Paciente() {
        historialMedico = new HashMap<>();
    }

    public Paciente(String nombre, int edad, String genero, String identificacion) {
        super(nombre, edad, genero, identificacion);
        historialMedico = new HashMap();
    }

    public HashMap getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(HashMap<String, String> historialMedico) {
        this.historialMedico = historialMedico;
    }

    public void agregarHistorial(String motivo, String detalles) {
        historialMedico.put(motivo, detalles);
    }

    public void mostrarHistorial() {
        System.out.println("historial medico de: " + nombre);
        if (historialMedico.isEmpty()) {
            System.out.println("no hay registros");
        } else {
            for (String motivo : historialMedico.keySet()) {
                System.out.println("motivo: " +motivo);
                System.out.println("detalle: " +historialMedico.get(motivo));
            }
        }
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("paciente");
        super.mostrarInformacion();
    }
}
