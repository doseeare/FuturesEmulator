package kg.doseeare.futuresemulator.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import org.koin.androidx.viewmodel.ext.android.viewModel
import kotlin.reflect.KClass

typealias Inflate<outVB> = (LayoutInflater, ViewGroup?, Boolean) -> outVB

abstract class BaseFragment<VB : ViewBinding, VM : BaseViewModel>(
    private val inflate: Inflate<VB>,
    viewModelClass: KClass<VM>
) : Fragment() {

    private var _binding: VB? = null
    protected val binding get() = _binding!!
    protected val viewModel: VM by viewModel(viewModelClass)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = inflate.invoke(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}