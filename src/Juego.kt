class Juego {
    val tablero = Tablero()
    val jugador1 = Jugador("Jugador 1", 'X')
    val jugador2 = Jugador("Jugador 2", 'O')

    fun iniciar() {
        var jugadorActivo = jugador1
        var fin = false

        while (fin == false) {
            tablero.mostrarTablero()
            println("${jugadorActivo.nombre}, ingrese fila y columna (0-2): ")
            val (fila, columna) = readln().split(" ").map { it.toInt() }

            if (tablero.marcarCasilla(fila, columna, jugadorActivo.simbolo)) {
                if (tablero.finJuego(jugadorActivo.simbolo) == true) {
                    tablero.mostrarTablero()
                    println("Ganador: ${jugadorActivo.nombre}, símbolo '${jugadorActivo.simbolo}' ¡FELICIDADES!")
                    fin = true
                }
                if (tablero.tableroLleno() == true) {
                    tablero.mostrarTablero()
                    println("¡Ha habido un empate, suerte la próxima vez!")
                    fin = true
                }
                if (jugadorActivo == jugador1){
                    jugadorActivo = jugador2
                } else {
                    jugadorActivo = jugador1
                }
            } else {
                println("Casilla inválida, inténtalo con otra.")
            }
        }
    }
}