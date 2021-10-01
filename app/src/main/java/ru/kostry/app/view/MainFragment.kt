package ru.kostry.app.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import ru.kostry.app.R
import ru.kostry.app.databinding.MainFragmentBinding
import ru.kostry.app.viewmodel.MainViewModel

class MainFragment : Fragment() {

    private var binding: MainFragmentBinding? = null
    private val sharedViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = MainFragmentBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.mainFragment = this
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    fun buttonNextOnMainFragment(){
        sharedViewModel.setMyString(binding?.mainEditText?.text.toString())
        findNavController().navigate(R.id.action_mainFragment_to_firstFragment)
    }
}