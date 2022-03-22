package kg.doseeare.futuresemulator.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kg.doseeare.futuresemulator.R
import kg.doseeare.futuresemulator.base.BaseFragment
import kg.doseeare.futuresemulator.databinding.FragmentDashboardBinding

class DashboardFragment : BaseFragment<FragmentDashboardBinding, DashboardViewModel>
    (FragmentDashboardBinding::inflate, DashboardViewModel::class) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun initViews() {
    }

    override fun initObservers() {
    }
}