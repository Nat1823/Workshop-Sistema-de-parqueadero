public class Parqueadero {
    // Matriz de objetos Carro para representar los espacios de estacionamiento
    private Carro[][] matrizCarros;
    // Tarifa por hora
    private double tarifaHora;

    // Constructor
    public Parqueadero(int filas, int columnas, double tarifaHora) {
        this.matrizCarros = new Carro[filas][columnas];
        this.tarifaHora = tarifaHora;
    }

    // Método para estacionar un carro en una posición específica de la matriz
    public boolean parquearCarro(Carro carro, int fila, int columna) {
        // Verificar límites
        if (fila < 0 || fila >= matrizCarros.length || columna < 0 || columna >= matrizCarros[0].length) {
            System.out.println("Posición fuera de los límites.");
            return false;
        }
        // Verificar si el espacio está ocupado
        if (matrizCarros[fila][columna] != null) {
            System.out.println("El espacio en la posición [" + fila + "][" + columna + "] ya está ocupado.");
            return false;
        }
        // Estacionar el carro
        matrizCarros[fila][columna] = carro;
        System.out.println("Carro estacionado en la posición [" + fila + "][" + columna + "].");
        return true;
    }

    // Método para cobrar por tiempo de uso del parqueadero
    public double cobrarPorTiempo(int horas) {
        return horas * tarifaHora;
    }

    // Método para mostrar el estado actual del parqueadero
    public void mostrarEstadoParqueadero() {
        for (int i = 0; i < matrizCarros.length; i++) {
            for (int j = 0; j < matrizCarros[i].length; j++) {
                if (matrizCarros[i][j] == null) {
                    System.out.print("[ ]"); // Espacio vacío
                } else {
                    System.out.print("[X]"); // Espacio ocupado
                }
            }
            System.out.println();
        }
    }
}
