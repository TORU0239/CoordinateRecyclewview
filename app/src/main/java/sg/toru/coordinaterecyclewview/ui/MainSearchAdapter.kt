package sg.toru.coordinaterecyclewview.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import sg.toru.coordinaterecyclewview.databinding.ItemSearchBinding
import java.util.*

class MainSearchAdapter(private val itemCallback: MainItemCallback): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var recyclerviewListItem:LinkedList<String> = LinkedList()
    set(value) {
        val currentSize = field.size
        field = value
        notifyItemInserted(currentSize)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = ItemSearchBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SearchViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as SearchViewHolder).bindItem(recyclerviewListItem[position])
    }

    override fun getItemCount(): Int = recyclerviewListItem.size
}

class MainItemCallback(): DiffUtil.ItemCallback<String>(){
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean = (oldItem == newItem)
    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean = (oldItem == newItem)
}

class SearchViewHolder(private val binding: ItemSearchBinding):RecyclerView.ViewHolder(binding.root) {
    fun bindItem(str:String) {}
}

class LoadingViewHolder(view: View):RecyclerView.ViewHolder(view)