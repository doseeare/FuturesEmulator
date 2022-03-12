package kg.doseeare.futuresemulator.ui.notifications

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kg.doseeare.futuresemulator.base.BaseViewModel

class NotificationsViewModel(app: Application) : BaseViewModel(app) {

    private val _text = MutableLiveData<String>().apply {
        value = "This is notifications Fragment"
    }
    val text: LiveData<String> = _text
}