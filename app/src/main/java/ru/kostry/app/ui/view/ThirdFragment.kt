package ru.kostry.app.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import ru.kostry.app.data.Item
import ru.kostry.app.databinding.FragmentThirdBinding
import ru.kostry.app.ui.adapter.RoomAdapter
import ru.kostry.app.ui.viewmodel.MainViewModel

class ThirdFragment : Fragment() {

    private var binding: FragmentThirdBinding? = null
    private val sharedViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentThirdBinding.inflate(inflater, container, false)
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
            thirdFragment = this@ThirdFragment

            thirdFrgRecyclerView.adapter = RoomAdapter()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}