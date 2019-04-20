package latihan.android.com.latihanmvpdandi.di.module

import android.app.Activity
import dagger.Module
import dagger.Provides
import latihan.android.com.latihanmvpdandi.ui.main.MainContract
import latihan.android.com.latihanmvpdandi.ui.main.MainPresenter

@Module
class ActivityModule(private var activity: Activity) {

    @Provides
    fun provideActivity(): Activity {
        return activity
    }

    @Provides
    fun providePresenter(): MainContract.Presenter {
        return MainPresenter()
    }

}