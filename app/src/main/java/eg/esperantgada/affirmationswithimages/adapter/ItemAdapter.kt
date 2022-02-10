package eg.esperantgada.affirmationswithimages.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmationswithimages.R
import eg.esperantgada.affirmationswithimages.model.Affirmation

class ItemAdapter(val context: Context, private val affirmationList :
List<Affirmation>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){


    //Get reference to each view in item layout
    class ItemViewHolder(private val view : View) : RecyclerView.ViewHolder(view){
        val textView : TextView = view.findViewById(R.id.item_title)
        val imageView : ImageView = view.findViewById(R.id.affirmationImage)

    }

    //Inflate the layout for items and create new view holder for new item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(layout)
    }

    //Bind the text and image views in layout with the corresponding value
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val affirmation = affirmationList[position]
        holder.textView.text = context.resources.getString(affirmation.stringResourceId)
        holder.imageView.setImageResource(affirmation.imageResourceId)
    }

    //Return the size of affirmationList
    override fun getItemCount(): Int {
        return affirmationList.size
    }
}