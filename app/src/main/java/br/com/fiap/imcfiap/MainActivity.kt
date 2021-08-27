package br.com.fiap.imcfiap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var editTextPeso: EditText
    lateinit var editTextAltura: EditText
    lateinit var textViewResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextPeso = findViewById(R.id.edit_text_peso)
        editTextAltura = findViewById(R.id.edit_text_altura)
        textViewResultado = findViewById(R.id.tv_resultado)


    }

    fun calcularImc(view: View) {

        if (validarCampos()) {
            val peso = editTextPeso.text.toString().toInt()
            val altura = editTextAltura.text.toString().toDouble()
            val imc = calcularImc(peso, altura)
            textViewResultado.text = String.format("%.1f", imc)
        }

    }

    private fun validarCampos(): Boolean {
        if (editTextPeso.text.isEmpty()){
            editTextPeso.error = "Peso é obrigatório!"
            return false
        }

        if (editTextAltura.text.isEmpty()){
            editTextAltura.error = "Altura é obrigatório!"
            return false
        }

        return true
    }


}