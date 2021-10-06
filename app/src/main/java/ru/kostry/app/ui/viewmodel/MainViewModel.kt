package ru.kostry.app.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import ru.kostry.app.network.MarsApi
import ru.kostry.app.network.MarsPhoto

enum class MarsApiStatus { LOADING, ERROR, DONE }

class MainViewModel : ViewModel() {

    //понадобится для логики показа успеха загрузки
    private val _status = MutableLiveData<MarsApiStatus>()
    val status: LiveData<MarsApiStatus> = _status

    //    список объектов MarsPhoto
    private val _photos = MutableLiveData<List<MarsPhoto>>()
    val photos: LiveData<List<MarsPhoto>> = _photos

    private val _myNumber = MutableLiveData<Int>()
    val myNumber: LiveData<Int> = _myNumber

    private val _myString = MutableLiveData<String>()
    val myString: LiveData<String> = _myString

    init {
        resetModel()
        getMarsPhotos()
    }


//    получить фото из MarsApi.retrofitService
    private fun getMarsPhotos() {
        viewModelScope.launch {
            _status.value = MarsApiStatus.LOADING
            try {
                _photos.value = MarsApi.retrofitService.getPhotos()
                _status.value = MarsApiStatus.DONE
            } catch (e: Exception) {
                _status.value = MarsApiStatus.ERROR
                _photos.value = listOf()
            }
        }
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