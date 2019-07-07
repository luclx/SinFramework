package com.luclx.sin.framework

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val currentName: MutableLiveData<String> by lazy {
        MutableLiveData()
    }
}