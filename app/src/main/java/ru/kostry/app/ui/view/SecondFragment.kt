package ru.kostry.app.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import ru.kostry.app.R
import ru.kostry.app.databinding.FragmentSecondBinding
import ru.kostry.app.ui.adapter.PhotoGridAdapter
import ru.kostry.app.ui.viewmodel.MainViewModel

class SecondFragment : Fragment() {

    private var binding: FragmentSecondBinding? = null
    private val sharedViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentSecondBinding = FragmentSecondBinding.inflate(inflater, container, false)

        binding = fragmentSecondBinding
        return fragmentSecondBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
//              автоматическое обновление данных с помощью обсервера
            lifecycleOwner = viewLifecycleOwner
//            привязка ViewModel из xml к ViewModel обьявленного в class
            viewModel = sharedViewModel
//            позволяет использовать onClickListener прямо в xml
            secondFragment = this@SecondFragment
//        инициализировать адаптер RecyclerView в binding.photosGrid новым объектом PhotoGridAdapter
            photosGrid.adapter = PhotoGridAdapter()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    fun buttonNextOnSecondFragment() {
        findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
    }

    fun buttonBackOnSecondFragment() {
        sharedViewModel.resetModel()
        findNavController().navigate(R.id.action_secondFragment_to_mainFragment)
    }
}