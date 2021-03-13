package garcia.luis.recuperacion_login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        register.setOnClickListener {
            var first_name = first_name.text.toString()
            var last_name = last_name.text.toString()

            if (first_name.isNullOrEmpty() || last_name.isNullOrEmpty()) {
                Toast.makeText(this, "Por favor, ingrese su nombre completo.", Toast.LENGTH_LONG).show()
            } else {
                val intent =  Intent(this, BienvenidoActivity::class.java)
                intent.putExtra("first_name", first_name)
                intent.putExtra("last_name", last_name)
                startActivity(intent)
            }
        }
    }
}