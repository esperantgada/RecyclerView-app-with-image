package eg.esperantgada.affirmationswithimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmationswithimages.R
import eg.esperantgada.affirmationswithimages.adapter.ItemAdapter
import eg.esperantgada.affirmationswithimages.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Get reference to the Datasource class
        val dataSource = Datasource()

        //Get the list of items (both affirmation string and image
        val myAffirmationList = dataSource.loadAffirmations()

        val recyclerview = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerview.adapter = ItemAdapter(this, myAffirmationList)

    }
}