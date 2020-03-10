package sg.toru.coordinaterecyclewview.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import sg.toru.coordinaterecyclewview.databinding.ItemSearchBinding

class MainSearchAdapter(private val itemCallback: MainItemCallback): ListAdapter<String, SearchViewHolder>(itemCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        val binding = ItemSearchBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SearchViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        holder.bindItem(getItem(position))
    }
}

class MainItemCallback(): DiffUtil.ItemCallback<String>(){
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean = (oldItem == newItem)

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean = (oldItem == newItem)

}

class SearchViewHolder(private val binding: ItemSearchBinding):RecyclerView.ViewHolder(binding.root) {
    fun bindItem(str:String) {

    }
}