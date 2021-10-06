package ru.kostry.app.ui.adapter

import android.view.View
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import ru.kostry.app.R
import ru.kostry.app.network.MarsPhoto
import ru.kostry.app.ui.viewmodel.MarsApiStatus


//Аннотация @BindingAdapter сообщает привязке данных(data binding в xml) о необходимости выполнения этого адаптера привязки, когда элемент View имеет атрибут imageUrl.
@BindingAdapter("imageUrl")
fun bindImage(imgView: ImageView, imgUrl: String?) {
//Функция let вместе с оператором безопасного вызова (?.) Используется для выполнения нулевой безопасной операции над объектом.
    imgUrl?.let {
//        преобразовать строку URL в Uri. Чтобы использовать схему HTTPS, buildUpon.scheme ("https")
        val imgUri = imgUrl.toUri().buildUpon().scheme("https").build()
        imgView.load(imgUri)
        imgView.load(imgUri) {
//            устанавливает изображение, которое будет использоваться при загрузке изображения
            placeholder(R.drawable.loading_animation)
//            устанавливает изображение, которое будет использоваться, если загрузка изображения не удалась.
            error(R.drawable.ic_broken_image)
        }
    }
}

//использование BindingAdapter для инициализации PhotoGridAdapter списком объектов MarsPhoto.
/*привязка данных автоматически отслеживает LiveData для списка объектов MarsPhoto.
 Затем адаптер привязки вызывается автоматически при изменении списка MarsPhoto.
 */
@BindingAdapter("listData")
fun bindRecyclerView(
    recyclerView: RecyclerView,
    data: List<MarsPhoto>?
) {
//    каст recyclerView.adapter к PhotoGridAdapter
    val adapter = recyclerView.adapter as PhotoGridAdapter
//    сообщает RecyclerView, когда доступен новый список.
    adapter.submitList(data)
}
/*
использование адаптера привязки для ImageView, чтобы отображать значки для состояний загрузки и ошибок
 */
@BindingAdapter("marsApiStatus")
fun bindStatus(statusImageView: ImageView,
               status: MarsApiStatus?) {
    when (status) {
        MarsApiStatus.LOADING -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.loading_animation)
        }
        MarsApiStatus.ERROR -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.ic_connection_error)
        }
        MarsApiStatus.DONE -> {
            statusImageView.visibility = View.GONE
        }
    }
}