package com.example.affirmationswithimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmationswithimages.adapter.ItemAdapter
import com.example.affirmationswithimages.data.Datasource
import javax.sql.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataSource = Datasource()
        val myAffirmationList = dataSource.loadAffirmations()

        val recyclerview = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerview.adapter = ItemAdapter(this, myAffirmationList)

    }
}