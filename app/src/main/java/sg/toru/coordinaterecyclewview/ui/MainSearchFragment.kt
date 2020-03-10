package sg.toru.coordinaterecyclewview.ui

import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager

import sg.toru.coordinaterecyclewview.R
import sg.toru.coordinaterecyclewview.databinding.FragmentMainSearchBinding
import java.util.*

/**
 * A simple [Fragment] subclass.
 */
class MainSearchFragment : Fragment() {

    private lateinit var binding:FragmentMainSearchBinding

    private val loadMoreListener:OnLoadMoreListener by lazy {
        object:OnLoadMoreListener{
            override fun onLoadMore() {
                Log.e("Toru", "onLoadMore!!")

                Handler().postDelayed({
                    with((binding.RcvSearch.adapter as MainSearchAdapter)){
                        val currentSizeBefore = itemCount
                        val arrayList = LinkedList<String>()
                        arrayList.add("11")
                        arrayList.add("12")
                        arrayList.add("13")
                        arrayList.add("14")
                        arrayList.add("15")
                        arrayList.add("16")
                        arrayList.add("17")
                        arrayList.add("18")
                        arrayList.add("19")
                        arrayList.add("20")
                        recyclerviewListItem.addAll(recyclerviewListItem.size, arrayList)
                        notifyItemInserted(currentSizeBefore)
                    }

                    scrollListener.setLoaded()
                }, 300)
            }
        }
    }

    private val scrollListener:InfiniteScrollListener by lazy {
        InfiniteScrollListener((binding.RcvSearch.layoutManager as GridLayoutManager), loadMoreListener)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {

        binding.RcvSearch.addOnScrollListener(scrollListener)
        binding.RcvSearch.adapter = MainSearchAdapter(MainItemCallback())

        val list = LinkedList<String>().apply {
            add("1")
            add("2")
            add("3")
            add("4")
            add("5")
            add("6")
            add("7")
            add("8")
            add("9")
            add("10")
        }

        (binding.RcvSearch.adapter as MainSearchAdapter).recyclerviewListItem = list
    }

    companion object {
        fun getInstance() = MainSearchFragment()
    }
}
