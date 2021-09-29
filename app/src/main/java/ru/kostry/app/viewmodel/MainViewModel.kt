package ru.kostry.app.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

//пример частного измениемого свойства
    private val _num = MutableLiveData<Int>(0)
    val num: LiveData<Int> = _num

//    способ изменения частного изменяемого свойства
    fun setNum(numbers: Int) {
        _num.value = numbers
    }
}