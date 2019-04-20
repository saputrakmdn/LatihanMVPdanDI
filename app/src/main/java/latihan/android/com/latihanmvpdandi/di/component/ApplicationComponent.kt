package latihan.android.com.latihanmvpdandi.di.component

import dagger.Component
import latihan.android.com.latihanmvpdandi.BaseApp
import latihan.android.com.latihanmvpdandi.di.module.ApplicationModule

@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun inject(application: BaseApp)
}