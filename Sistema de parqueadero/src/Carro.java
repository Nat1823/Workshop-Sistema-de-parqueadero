public class Carro {
    // Atributos
    private String placa;
    private String marca;
    private String modelo;

    // Constructor
    public Carro(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Método toString para representar el carro
    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
