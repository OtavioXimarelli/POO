class MotorEletrico : MotorImpl() {

    private var nivelBateria: Int = 1

    override fun gastando() {
        println("gastando energia, nivel agora é: $nivelBateria")
        nivelBateria--
    }

    override fun temAutonomia(): Boolean {
        return nivelBateria > 0
    }

}