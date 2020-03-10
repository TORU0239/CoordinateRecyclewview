package sg.toru.coordinaterecyclewview.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import sg.toru.coordinaterecyclewview.R

/**
 * A simple [Fragment] subclass.
 */
class MainSearchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_search, container, false)
    }

    companion object {
        fun getInstance() = MainSearchFragment()
    }
}