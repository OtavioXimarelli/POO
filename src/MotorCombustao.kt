class MotorCombustao : MotorImpl() {

    private var nivelCombustivel: Int = 2


     override fun gastando() {
         println("Gastando combustivel, nivel agora é: $nivelCombustivel")
         nivelCombustivel--
     }

    override fun temAutonomia(): Boolean {
        return nivelCombustivel > 0
    }
}