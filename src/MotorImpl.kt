abstract class MotorImpl : Motor {

    private var ligado: Boolean = false

    override fun ligar() {
        println("Ligando  motor...")
        ligado = true
    }

    override fun desligar() {
        println("Desligando motor...")
        ligado = false
    }

    fun estaLigado(): Boolean {
        return ligado
    }

    abstract fun temAutonomia(): Boolean

    abstract fun gastando()

}