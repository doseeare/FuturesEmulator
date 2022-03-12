package kg.doseeare.futuresemulator.ui.home

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kg.doseeare.futuresemulator.base.BaseViewModel

class HomeViewModel(app: Application) : BaseViewModel(app) {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}