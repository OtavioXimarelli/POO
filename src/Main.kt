
fun main() {
    val motorCombustao = MotorCombustao()
    val fuca = Carro(motorCombustao)
    fuca.ligar()
    fuca.andar()
    fuca.desligar()


    val motorEletrico = MotorEletrico()
    val tesla = Carro(motorEletrico)
    tesla.ligar()
    tesla.andar()
    tesla.andar()
    tesla.desligar()

}