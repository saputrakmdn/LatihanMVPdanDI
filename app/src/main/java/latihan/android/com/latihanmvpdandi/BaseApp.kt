package latihan.android.com.latihanmvpdandi

import android.app.Application
import latihan.android.com.latihanmvpdandi.di.component.ApplicationComponent
import latihan.android.com.latihanmvpdandi.di.component.DaggerApplicationComponent
import latihan.android.com.latihanmvpdandi.di.module.ApplicationModule

class BaseApp: Application() {
    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        instance = this
        setup()

        if (BuildConfig.DEBUG) {
            // Maybe TimberPlant etc.
        }
    }

    fun setup() {
        component = DaggerApplicationComponent.builder().applicationModule(ApplicationModule(this)).build()
        component.inject(this)
    }

    fun getApplicationComponent(): ApplicationComponent {
        return component
    }

    companion object {
        lateinit var instance: BaseApp private set
    }
}