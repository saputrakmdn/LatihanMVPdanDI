package latihan.android.com.latihanmvpdandi.di.component

import dagger.Component
import latihan.android.com.latihanmvpdandi.di.module.FragmentModule
import latihan.android.com.latihanmvpdandi.ui.about.AboutFragment
import latihan.android.com.latihanmvpdandi.ui.list.ListFragment


@Component(modules = arrayOf(FragmentModule::class))
interface FragmentComponent {
    fun inject(aboutFragment: AboutFragment)
    fun inject(listFragment: ListFragment)
}