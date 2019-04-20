package latihan.android.com.latihanmvpdandi.ui.main

import latihan.android.com.latihanmvpdandi.ui.base.BaseContract

class MainContract {

    interface View: BaseContract.View {
        fun showAboutFragment()
        fun showListFragment()
    }

    interface Presenter: BaseContract.Presenter<MainContract.View> {
        fun onDrawerOptionAboutClick()
    }
}