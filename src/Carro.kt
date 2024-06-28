class Carro constructor(
    private val motor: MotorImpl
)   : Motor by motor{

    fun andar() {
        when {
            !motor.estaLigado() -> println("Ligue o carro primeiro!!!  ")
            !motor.temAutonomia() -> {
                when(motor) {
                    is MotorEletrico -> println("tem que colocar para carregar!!!")
                    is MotorCombustao -> println("Tem que colocar mais combustivel!!!")
                }
            }
            else -> {
                motor.gastando()
                when(motor) {
                    is MotorEletrico -> println("Carro andando...")
                    is MotorCombustao -> println("Carro andando: vruuuun vruuunnn")
                }
            }
        }
    }

}