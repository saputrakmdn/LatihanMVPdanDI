package latihan.android.com.latihanmvpdandi.ui.list

import latihan.android.com.latihanmvpdandi.model.DetailsViewModel
import latihan.android.com.latihanmvpdandi.model.Post
import latihan.android.com.latihanmvpdandi.ui.base.BaseContract

class ListContract {

    interface View: BaseContract.View {
        fun showProgress(show: Boolean)
        fun showErrorMessage(error: String)
        fun loadDataSuccess(list: List<Post>)
        fun loadDataAllSuccess(model: DetailsViewModel)
    }

    interface Presenter: BaseContract.Presenter<View> {
        fun loadData()
        fun loadDataAll()
        fun deleteItem(item: Post)
    }
}