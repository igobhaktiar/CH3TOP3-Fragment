package firgobhaktiar.synergybatch6.ch3top3_fragment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import firgobhaktiar.synergybatch6.ch3top3_fragment.R
import firgobhaktiar.synergybatch6.ch3top3_fragment.databinding.FragmentFirstBinding
import firgobhaktiar.synergybatch6.ch3top3_fragment.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

}