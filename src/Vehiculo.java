public class Vehiculo {
    int velocidad;
    String modelo;

    public Vehiculo(int velocidad, String modelo) {
        this.velocidad = velocidad;
        this.modelo = modelo;
    }

    public String controlarVelocidad(int velocidad) {

        if (velocidad > 150.00) {

            return "Está excediendo la velocidad permitida!!!";

        } else if (velocidad < 0) {

            return "El velocidad no puede ser negativa!!!";

        } else if (0 < velocidad & velocidad <= 60) {

            return "Está yendo muy lento en la carretera!";

        } else if (120 < velocidad & velocidad < 150) {

            return "Está yendo muy rápido en la carretera!";

        } else {

            return "Su velocidad es permitida c:";

        }

    }

}
