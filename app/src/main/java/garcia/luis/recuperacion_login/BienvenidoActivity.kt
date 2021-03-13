package garcia.luis.recuperacion_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bienvenido.*

class BienvenidoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenido)

        val bundle =  intent.extras

        if (bundle != null) {
            var first_name = bundle.getString("first_name")
            var last_name = bundle.getString("last_name")
            welcome_full_name.setText("$first_name $last_name")
        }
    }
}