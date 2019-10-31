package cobakotlin.dhika.com.responsi152

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ListAdapter(private val context: Activity, private val nama: Array<String>, private val imgid: Array<Int>)
    : ArrayAdapter<String>(context, R.layout.list_home, nama) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.list_home, null, true)

        val titleText = rowView.findViewById(R.id.title) as TextView
        val imageView = rowView.findViewById(R.id.icon) as ImageView

        titleText.text = nama[position]
        imageView.setImageResource(imgid[position])

        return rowView
    }
}