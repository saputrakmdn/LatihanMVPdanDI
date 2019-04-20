package latihan.android.com.latihanmvpdandi.di.module

import dagger.Module
import dagger.Provides
import latihan.android.com.latihanmvpdandi.api.ApiServiceInterface
import latihan.android.com.latihanmvpdandi.ui.about.AboutContract
import latihan.android.com.latihanmvpdandi.ui.about.AboutPresenter
import latihan.android.com.latihanmvpdandi.ui.list.ListContract
import latihan.android.com.latihanmvpdandi.ui.list.ListPresenter


@Module
class FragmentModule {
    @Provides
    fun provideAboutPresenter(): AboutContract.Presenter {
        return AboutPresenter()
    }

    @Provides
    fun provideListPresenter(): ListContract.Presenter {
        return ListPresenter()
    }

    @Provides
    fun provideApiService(): ApiServiceInterface {
        return ApiServiceInterface.create()
    }
}