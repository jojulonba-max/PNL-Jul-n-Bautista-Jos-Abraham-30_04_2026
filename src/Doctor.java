import java.util.ArrayList;

public class Doctor extends Persona {

    private String especialidad;
    private String numeroDeLicencia;
    private ArrayList<Paciente> pacientes;

    public Doctor() {
        pacientes = new ArrayList<>();
    }

    public Doctor(String nombre, int edad, String genero, String identificacion, String especialidad, String numeroDeLicencia) {
        super(nombre, edad, genero, identificacion);
        this.especialidad = especialidad;
        this.numeroDeLicencia = numeroDeLicencia;
        pacientes = new ArrayList<>();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNumeroDeLicencia() {
        return numeroDeLicencia;
    }

    public void setNumeroDeLicencia(String numeroDeLicencia) {
        this.numeroDeLicencia = numeroDeLicencia;
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void mostrarPacientes() {
        System.out.println("pacientes del doctor " + nombre);
        if (pacientes.isEmpty()) {
            System.out.println("no tiene pacientes");
        } else {
            for (int i = 0; i < pacientes.size(); i++) {
                System.out.println("- " + pacientes.get(i).getNombre());
            }
        }
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("-- doctor --");
        super.mostrarInformacion();
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Licencia: " + numeroDeLicencia);
    }
}