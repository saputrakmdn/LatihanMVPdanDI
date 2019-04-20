package latihan.android.com.latihanmvpdandi.ui.list

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import latihan.android.com.latihanmvpdandi.R
import latihan.android.com.latihanmvpdandi.model.Post

class ListAdapter(private val context: Context, private val list: MutableList<Post>,
                  fragment: Fragment
): RecyclerView.Adapter<ListAdapter.ListViewHolder>() {
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        var post = list[position]

        // holder!!.bind(post)
        holder!!.title!!.setText(post.title)
        holder.body!!.setText(post.body)

        holder.layout!!.setOnClickListener {
            Toast.makeText(context, "YA YA YA", Toast.LENGTH_SHORT).show()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false)
        return ListAdapter.ListViewHolder(itemView)
    }

    private val listener: ListAdapter.onItemClickListener

    init {
        this.listener = fragment as ListAdapter.onItemClickListener
    }


    override fun getItemCount(): Int {
        return list.size
    }





    fun removeAt(position: Int) {
        list.removeAt(position)
        notifyItemRemoved(position)
    }

    class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var layout = itemView.findViewById<ConstraintLayout>(R.id.item_layout)
        val title = itemView.findViewById<TextView>(R.id.item_title)
        val body = itemView.findViewById<TextView>(R.id.item_body)

        fun bind(item: Post) {
            // title = item.post
            // body etc.
        }
    }

    interface onItemClickListener {
        fun itemRemoveClick(post: Post)
        fun itemDetail(postId : String)
    }
}