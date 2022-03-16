package kg.doseeare.futuresemulator.ui.home

import android.os.Bundle
import android.view.View
import kg.doseeare.futuresemulator.base.BaseFragment
import kg.doseeare.futuresemulator.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>
    (FragmentHomeBinding::inflate, HomeViewModel::class) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}