package kg.doseeare.futuresemulator.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import kg.doseeare.futuresemulator.R
import kg.doseeare.futuresemulator.base.BaseFragment
import kg.doseeare.futuresemulator.databinding.FragmentNotificationsBinding

class NotificationsFragment : BaseFragment<FragmentNotificationsBinding, NotificationsViewModel>
    (FragmentNotificationsBinding::inflate, NotificationsViewModel::class) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun initViews() {

    }

    override fun initObservers() {

    }

}