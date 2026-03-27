public abstract class Atleta {

    protected String Nombre;
    protected int edad;
    protected double horasentrenamiento;

    public Atleta() {
    }

    public Atleta(String nombre, int edad, double horasentrenamiento) {
        Nombre = nombre;
        this.edad = edad;
        this.horasentrenamiento = horasentrenamiento;
    }


}
