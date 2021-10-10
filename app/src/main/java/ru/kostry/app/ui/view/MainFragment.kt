package ru.kostry.app.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import ru.kostry.app.R
import ru.kostry.app.databinding.MainFragmentBinding
import ru.kostry.app.ui.viewmodel.MainViewModel

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
        binding?.apply {
//              автоматическое обновление данных с помощью обсервера
            lifecycleOwner = viewLifecycleOwner
//            привязка ViewModel из xml к ViewModel обьявленного в class
            viewModel = sharedViewModel
//            позволяет использовать onClickListener прямо в xml
            mainFragment = this@MainFragment
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    private fun setErrorTextField(error: Boolean) {
        if (error) {
            binding?.mainEditTextField?.isErrorEnabled = true
            binding?.mainEditTextField?.error = getString(R.string.try_again)
        } else {
            binding?.mainEditTextField?.isErrorEnabled = false
            binding?.mainTextInputEditText?.text = null
        }
    }

    fun buttonNextOnMainFragment(){
        val userWord = binding?.mainTextInputEditText?.text.toString()

        if (sharedViewModel.emptyString(userWord)){
            setErrorTextField(true)
        }else{
            setErrorTextField(false)
            sharedViewModel.setMyString(userWord)
            findNavController().navigate(R.id.action_mainFragment_to_firstFragment)
        }
    }

    fun buttonToThirdFragment(){
        findNavController().navigate(R.id.action_mainFragment_to_thirdFragment)
    }
}