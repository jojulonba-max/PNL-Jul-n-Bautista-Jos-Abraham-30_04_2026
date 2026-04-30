public class Cita {

    private Paciente paciente;
    private Doctor doctor;
    private String fecha;
    private String hora;
    private String motivo;

    public Cita() {}

    public Cita(Paciente paciente, Doctor doctor, String fecha, String hora, String motivo) {
        this.paciente = paciente;
        this.doctor = doctor;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
    }

    public void detallesCita() {
        System.out.println("Paciente : " + paciente.getNombre());
        System.out.println("Doctor   : Dr. " + doctor.getNombre() + " - " + doctor.getEspecialidad());
        System.out.println("Fecha    : " + fecha);
        System.out.println("Hora     : " + hora);
        System.out.println("Motivo   : " + motivo);
    }

    public void cambiarFechaHora(String nuevaFecha, String nuevaHora) {
        this.fecha = nuevaFecha;
        this.hora = nuevaHora;
        System.out.println("Cita reprogramada a: " + nuevaFecha + " - " + nuevaHora);
    }
}