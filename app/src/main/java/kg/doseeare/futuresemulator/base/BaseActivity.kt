package kg.doseeare.futuresemulator.base

import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<B : ViewBinding> : AppCompatActivity() {
    private var viewBinding: B? = null
    protected val binding: B
        get() = checkNotNull(viewBinding)

    protected fun setContentView(binding: B) {
        viewBinding = binding
        super.setContentView(binding.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        viewBinding = null
    }
}