package cobakotlin.dhika.com.responsi152

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_account.*

class AccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val bundle = intent.extras
        val nimBro = bundle?.get("nim2").toString()
        val namaBro = bundle?.get("nama2").toString()
        val userBro = bundle?.get("usr2").toString()
        val passBro = bundle?.get("pss2").toString()

        t_nama.text = namaBro
        t_nim.text = nimBro
        t_user.text = userBro
        t_pass.text = passBro
    }
}
