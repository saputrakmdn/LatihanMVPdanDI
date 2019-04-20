package latihan.android.com.latihanmvpdandi.di.module
import android.app.Application
import dagger.Module
import dagger.Provides
import latihan.android.com.latihanmvpdandi.BaseApp
import latihan.android.com.latihanmvpdandi.di.scope.PerApplication
import javax.inject.Singleton

@Module
class ApplicationModule(private val baseApp: BaseApp) {

    @Provides
    @Singleton
    @PerApplication
    fun provideApplication(): Application {
        return baseApp
    }
}
