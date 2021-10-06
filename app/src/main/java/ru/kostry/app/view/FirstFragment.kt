package ru.kostry.app.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import ru.kostry.app.R
import ru.kostry.app.databinding.FragmentFirstBinding
import ru.kostry.app.viewmodel.MainViewModel

class FirstFragment : Fragment() {

    private var binding: FragmentFirstBinding? = null
    private val sharedViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentFirstBinding.inflate(inflater, container, false)
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
            firstFragment = this@FirstFragment
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    private fun setErrorTextField(error: Boolean) {
        if (error) {
            binding?.firstFragmentEditTextField?.isErrorEnabled = true
            binding?.firstFragmentEditTextField?.error = getString(R.string.try_again)
        } else {
            binding?.firstFragmentEditTextField?.isErrorEnabled = false
            binding?.firstFragmentNumberInputEditText?.text = null
        }
    }

    fun buttonNextOnFirstFragment() {
        val userNum = binding?.firstFragmentNumberInputEditText?.text.toString()

        if (sharedViewModel.emptyNum(userNum)){
            setErrorTextField(true)
        }else{
            setErrorTextField(false)
            sharedViewModel.setMyNumber(userNum.toInt())
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
    }

    fun buttonBackOnFirstFragment() {
        sharedViewModel.resetModel()
        findNavController().navigate(R.id.action_firstFragment_to_mainFragment)
    }
}