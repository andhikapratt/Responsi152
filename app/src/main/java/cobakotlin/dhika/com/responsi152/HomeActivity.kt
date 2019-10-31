package cobakotlin.dhika.com.responsi152

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    val nama    = arrayOf<String>("Python",
        "C#",
        "C++",
        "Java",
        "PHP",
        "ini si f",
        "ini si g",
        "ini si h",
        "ini si ",
        "ini si j")

    val imageId = arrayOf<Int>(
        R.drawable.py,
        R.drawable.ckres,
        R.drawable.cplus,
        R.drawable.jv,
        R.drawable.php,
        R.drawable.gb,
        R.drawable.gb,
        R.drawable.gb,
        R.drawable.gb,
        R.drawable.gb

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val myListAdapter = ListAdapter(this,nama,imageId)
        lview.adapter = myListAdapter

        val bundle = intent.extras
        val userBro = bundle?.get("usr2").toString()
        val namaBro = bundle?.get("nama2").toString()
        val nimBro = bundle?.get("nim2").toString()
        val passBro = bundle?.get("pss2").toString()

        tombol.setOnClickListener{
            intent = Intent(this, AccountActivity::class.java)
            intent.putExtra("nim2",namaBro)
            intent.putExtra("nama2",nimBro)
            intent.putExtra("usr2",userBro)
            intent.putExtra("pss2",passBro)
            startActivity(intent)
        }

        lview.setOnItemClickListener(){adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)

            var a = Integer.parseInt(itemIdAtPos.toString())
            var pr = a+1

            if (a.equals(0)){
                Toast.makeText(this, "Ini Si $itemAtPos , Dia adalah bahasa pemrograman kesukaan saya", Toast.LENGTH_LONG).show()
            }
            else if (a.equals(1)){
                Toast.makeText(this, "Ini Si $itemAtPos , Dia adalah bahasa pemrograman untuk membuat aplikasi desktop", Toast.LENGTH_LONG).show()
            }
            else if (a.equals(2)){
                Toast.makeText(this, "Ini Si $itemAtPos , Dia adalah bahasa pemrograman tersimple", Toast.LENGTH_LONG).show()
            }
            else if (a.equals(3)){
                Toast.makeText(this, "Ini Si $itemAtPos , Dia adalah bahasa pemrograman Terkeren", Toast.LENGTH_LONG).show()
            }
            else if (a.equals(4)){
                Toast.makeText(this, "Ini Si $itemAtPos , Saya tidak suka PHP", Toast.LENGTH_LONG).show()
            }
            else if (a.equals(5)){
                Toast.makeText(this, "Ini Si $itemAtPos , Dia adalah Teman Yang Nakal", Toast.LENGTH_LONG).show()
            }
            else if (a.equals(6)){
                Toast.makeText(this, "Ini Si $itemAtPos , Dia adalah Teman Yang Baik", Toast.LENGTH_LONG).show()
            }
            else if (a.equals(7)){
                Toast.makeText(this, "Ini Si $itemAtPos , Dia adalah Teman Yang Sederhana", Toast.LENGTH_LONG).show()
            }
            else if (a.equals(8)){
                Toast.makeText(this, "Ini Si $itemAtPos , Dia adalah Teman Yang Jahat", Toast.LENGTH_LONG).show()
            }
            else if (a.equals(9)){
                Toast.makeText(this, "Ini Si $itemAtPos , Dia adalah Teman Yang Cantik", Toast.LENGTH_LONG).show()
            }

            else {
                Toast.makeText(this, "Pilihan Tidak ada ", Toast.LENGTH_LONG).show()
            }
        }
    }
}
