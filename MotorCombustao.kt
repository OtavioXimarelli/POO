abstract class MotorCombustao : Motor() {

    protected var nivelCombustivel: Int = 2


    abstract override fun gastando()

    override fun temAutonomia(): Boolean {
        return nivelCombustivel > 0
    }
}

class MotorAlcool : MotorCombustao() {
    override fun gastando() {
        nivelCombustivel -= 2
        println("gastando combustivel, o nivel atual agora é: $nivelCombustivel")
    }
}

class MotorGasolina : MotorCombustao() {
    override fun gastando() {
        nivelCombustivel = nivelCombustivel --
        println("gastando combustivel, o nivel atual agora é: $nivelCombustivel")
    }
}