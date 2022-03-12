package kg.doseeare.futuresemulator.ui.dashboard

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kg.doseeare.futuresemulator.base.BaseViewModel

class DashboardViewModel(app : Application) : BaseViewModel(app) {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text
}