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
class MainWebFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main_web, container, false)
    }

    companion object {
        fun getInstance() = MainWebFragment()
    }
}