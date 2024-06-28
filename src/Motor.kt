abstract class Motor {

    private var ligado: Boolean = false

    fun ligar() {
        println("Ligando  motor...")
        ligado = true
    }

    fun desligar() {
        println("Desligando motor...")
        ligado = false
    }

    fun estaLigado(): Boolean {
        return ligado
    }

    abstract fun temAutonomia(): Boolean

    abstract fun gastando()

}