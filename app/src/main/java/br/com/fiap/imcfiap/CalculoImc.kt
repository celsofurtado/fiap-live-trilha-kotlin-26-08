package br.com.fiap.imcfiap

fun calcularImc(peso: Int, altura: Double): Double {
    return peso / Math.pow(altura, 2.0)
}

fun definirStatus(imc: Double): String{
    if (imc < 18.5) {
        return "Abaixo do Peso"
    }
    return ""
}