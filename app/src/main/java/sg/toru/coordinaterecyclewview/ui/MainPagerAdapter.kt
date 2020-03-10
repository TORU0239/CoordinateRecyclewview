package sg.toru.coordinaterecyclewview.ui

import android.app.Activity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MainPagerAdapter(currentActivity: FragmentActivity): FragmentStateAdapter(currentActivity){
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return if(position == 0) {
            MainSearchFragment.getInstance()
        } else {
            MainWebFragment.getInstance()
        }
    }
}