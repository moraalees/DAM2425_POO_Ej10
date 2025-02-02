fun main(){
    var salir = false

    while (!salir){
        val juego = Juego()
        juego.iniciar()
        println("¿Desea jugar otra partida? (S/N) ")
        val decision = readln().uppercase()

        if (decision == "S"){
            println("Iniciando partida...")
        } else if (decision == "N"){
            println("¡Gracias por jugar!")
            salir = true
        } else {
            println("Opción inválida, comenzando otra partida...")
        }
    }
}