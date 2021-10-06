package ru.kostry.app.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _myNumber = MutableLiveData<Int>()
    val myNumber: LiveData<Int> = _myNumber

    private val _myString = MutableLiveData<String>()
    val myString: LiveData<String> = _myString

    init {
        resetModel()
    }

    fun resetModel() {
        _myNumber.value = 0
        _myString.value = ""
    }

    fun setMyNumber(number: Int) {
        _myNumber.value = number
    }

    fun setMyString(str: String) {
        _myString.value = str
    }
    
    fun emptyString(userString: String):Boolean{
        return userString == ""
    }

    fun emptyNum(userNum: String): Boolean{
        return userNum == ""
    }

}