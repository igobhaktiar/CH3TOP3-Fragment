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
import firgobhaktiar.synergybatch6.ch3top3_fragment.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {
    private var _binding: FragmentThirdBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

}