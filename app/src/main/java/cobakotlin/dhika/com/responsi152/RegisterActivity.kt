package cobakotlin.dhika.com.responsi152

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_account.*
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

//        val bundle = intent.extras
//        val nimBro = bundle?.get("nim").toString()
//        val namaBro = bundle?.get("nama").toString()
//        val userBro = bundle?.get("usr").toString()
//        val passBro = bundle?.get("pss").toString()

        val nimnya: EditText = findViewById(R.id.et_nim)
        val namanya: EditText = findViewById(R.id.et_nama)
        val usernya: EditText = findViewById(R.id.et_userr)
        val passnya: EditText = findViewById(R.id.et_passs)

        bt_regist.setOnClickListener{
            intent = Intent(this, MainActivity::class.java)
            intent.putExtra("nim1",nimnya.text)
            intent.putExtra("nama1",namanya.text)
            intent.putExtra("usr1",usernya.text)
            intent.putExtra("pss1",passnya.text)
            Toast.makeText(this, "Berhasil Ditambahkan", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
    }
}
