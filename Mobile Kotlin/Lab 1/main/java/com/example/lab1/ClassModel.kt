package com.example.lab1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class ClassModel : ViewModel(){
    private val _buttonText = MutableLiveData<String>().apply {
        value = "Press button"
    }

    val buttonText: LiveData<String> = _buttonText

    fun onButtonClick() {
        _buttonText.value = "The button pressed"
    }
}