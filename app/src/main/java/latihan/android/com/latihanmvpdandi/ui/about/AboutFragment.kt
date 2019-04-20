package latihan.android.com.latihanmvpdandi.ui.about

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.DaggerFragment
import kotlinx.android.synthetic.main.fragment_about.*
import kotlinx.android.synthetic.main.fragment_list.*
import latihan.android.com.latihanmvpdandi.R
import latihan.android.com.latihanmvpdandi.di.component.DaggerFragmentComponent
import latihan.android.com.latihanmvpdandi.di.module.FragmentModule
import javax.inject.Inject

class AboutFragment: Fragment(), AboutContract.View {
    @Inject lateinit var presenter: AboutContract.Presenter
    private lateinit var rootView: View
    fun newInstace(): AboutFragment{
        return AboutFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectDependency()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = inflater!!.inflate(R.layout.fragment_about, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.attach(this)
        presenter.subscribe()
        initView()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        presenter.unsubscribe()
    }

    override fun showProgress(show: Boolean) {
        if(show){
            progressBar1.visibility = View.VISIBLE
        }else{
            progressBar1.visibility = View.GONE
        }
    }
    override fun  loadMessageSuccess(message : String){
        aboutText.text = getString(R.string.about_text)
        aboutText.visibility = View.VISIBLE

    }
    private fun injectDependency(){
        val aboutComponent = DaggerFragmentComponent.builder().fragmentModule(FragmentModule()).build()
        aboutComponent.inject(this)

    }
    private fun initView(){
        presenter.loadMessage()
    }
    companion object {
        val TAG: String= "AboutFragmet"
    }

}