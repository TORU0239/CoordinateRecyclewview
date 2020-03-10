package sg.toru.coordinaterecyclewview.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import sg.toru.coordinaterecyclewview.R
import sg.toru.coordinaterecyclewview.databinding.FragmentMainSearchBinding

/**
 * A simple [Fragment] subclass.
 */
class MainSearchFragment : Fragment() {

    private lateinit var binding:FragmentMainSearchBinding

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
        binding.RcvSearch.adapter = MainSearchAdapter(MainItemCallback())
        (binding.RcvSearch.adapter as MainSearchAdapter).submitList(listOf("1","2","1","2","1","2","1","2","1","2"))
    }

    companion object {
        fun getInstance() = MainSearchFragment()
    }
}
