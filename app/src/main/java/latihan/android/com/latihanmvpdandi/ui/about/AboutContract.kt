package latihan.android.com.latihanmvpdandi.ui.about

import latihan.android.com.latihanmvpdandi.ui.base.BaseContract

class AboutContract {
    interface View: BaseContract.View {
        fun showProgress(show: Boolean)
        fun loadMessageSuccess(message: String)
        // fun loadMessageError() // When it's a real request, this function should be implemented, too
    }

    interface Presenter: BaseContract.Presenter<View> {
        fun loadMessage() // Let's assume that this will be a retrofit request
    }
}