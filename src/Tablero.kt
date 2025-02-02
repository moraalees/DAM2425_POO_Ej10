class Tablero() {
    private val tableroJuego = Array(3) { CharArray(3) { ' ' } }

    fun mostrarTablero(){
        for (fila in tableroJuego) {
            println("--------------")
            println(fila.joinToString("  |  "))
        }
        println("--------------")
    }

    fun marcarCasilla(fila: Int, columna: Int, simbolo: Char): Boolean{
        if (tableroJuego[fila][columna] == ' '){
            tableroJuego[fila][columna] = simbolo
            return true
        }
        println("No se puede marcar esa casilla...")
        return false
    }

    fun finJuego(simbolo: Char): Boolean{
        for (i in 0..2) {
            //Esta parte comprueba si hay ganador en las líneas horizontales/verticales mediante un valor i
            if ((tableroJuego[i][0] == simbolo && tableroJuego[i][1] == simbolo && tableroJuego[i][2] == simbolo) ||
                (tableroJuego[0][i] == simbolo && tableroJuego[1][i] == simbolo && tableroJuego[2][i] == simbolo)) {
                return true
            }
        }
        //Esta parte comprueba si hay ganador en las líneas diagonales
        if ((tableroJuego[0][0] == simbolo && tableroJuego[1][1] == simbolo && tableroJuego[2][2] == simbolo) ||
            (tableroJuego[0][2] == simbolo && tableroJuego[1][1] == simbolo && tableroJuego[2][0] == simbolo)) {
            return true
        }
        return false
    }

    fun tableroLleno(): Boolean{
        for (fila in tableroJuego){
            for (casilla in fila){
                if (casilla == ' ') {
                    return false
                }
            }
        }
        return true
    }
}