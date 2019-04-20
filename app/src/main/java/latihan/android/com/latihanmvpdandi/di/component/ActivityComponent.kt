package latihan.android.com.latihanmvpdandi.di.component

import dagger.Component
import latihan.android.com.latihanmvpdandi.di.module.ActivityModule
import latihan.android.com.latihanmvpdandi.ui.main.MainActivity

@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

}