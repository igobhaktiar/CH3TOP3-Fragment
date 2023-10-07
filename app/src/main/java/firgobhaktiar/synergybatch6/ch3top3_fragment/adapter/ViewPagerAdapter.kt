package firgobhaktiar.synergybatch6.ch3top3_fragment.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import firgobhaktiar.synergybatch6.ch3top3_fragment.fragment.FirstFragment
import firgobhaktiar.synergybatch6.ch3top3_fragment.fragment.SecondFragment
import firgobhaktiar.synergybatch6.ch3top3_fragment.fragment.ThirdFragment

private const val NUM_TABS = 3

public class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return FirstFragment()
            1 -> return SecondFragment()
        }
        return ThirdFragment()
    }
}