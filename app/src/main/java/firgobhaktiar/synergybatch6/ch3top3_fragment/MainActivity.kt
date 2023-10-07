package firgobhaktiar.synergybatch6.ch3top3_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import firgobhaktiar.synergybatch6.ch3top3_fragment.adapter.ViewPagerAdapter
import firgobhaktiar.synergybatch6.ch3top3_fragment.databinding.ActivityMainBinding

val tabLayoutArray = arrayOf(
    "First Fragment",
    "Second Fragment",
    "Third Fragment",
)

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val viewPager = binding.viewPager
        val tabLayout = binding.tabLayout

        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) {
            tab, position ->
            tab.text = tabLayoutArray[position]
        }.attach()
    }
}