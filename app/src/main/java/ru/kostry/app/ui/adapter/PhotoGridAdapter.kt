package ru.kostry.app.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ru.kostry.app.databinding.GridViewItemBinding
import ru.kostry.app.network.MarsPhoto


//ListAdapter - это подкласс класса RecyclerView.Adapter для представления данных списка в RecyclerView,
// включая вычисление различий между списками в фоновом потоке.
class PhotoGridAdapter :
    ListAdapter<MarsPhoto, PhotoGridAdapter.MarsPhotoViewHolder>(DiffCallback) {

    class MarsPhotoViewHolder(private var binding: GridViewItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(MarsPhoto: MarsPhoto) {
//            метод bind (), принимает объект MarsPhoto в качестве
//            аргумента и устанавливает для этого объекта binding.property
            binding.photo = MarsPhoto
//            executePendingBindings() приведет к немедленному выполнению обновления.
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PhotoGridAdapter.MarsPhotoViewHolder {
//        метод должен вернуть новый MarsPhotoViewHolder, созданный путем раздувания GridViewItemBinding
//        и использования LayoutInflater из родительского контекста ViewGroup
        return MarsPhotoViewHolder(GridViewItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: PhotoGridAdapter.MarsPhotoViewHolder, position: Int) {
//        получить объект MarsPhoto, связанный с текущей позицией RecyclerView
        val marsPhoto = getItem(position)
//        передача свойства методу bind () в MarsPhotoViewHolder.
        holder.bind(marsPhoto)
    }

    //    DiffCallback расширяет DiffUtil.ItemCallback с помощью
//    универсального типа объекта(generic type of object) <MarsPhoto>
    companion object DiffCallback : DiffUtil.ItemCallback<MarsPhoto>() {
        /*Этот метод вызывается DiffUtil, чтобы решить, представляют ли два объекта один и тот же элемент.
        DiffUtil использует этот метод, чтобы выяснить, совпадает ли новый объект MarsPhoto со старым объектом MarsPhoto.
        Идентификатор каждого элемента (объекта MarsPhoto) уникален.
        Сравните идентификаторы oldItem и newItem и верните результат.
         */
        override fun areItemsTheSame(oldItem: MarsPhoto, newItem: MarsPhoto): Boolean {
            return oldItem.id == newItem.id
        }

        /*Этот метод вызывается DiffUtil, когда он хочет проверить,
        имеют ли два элемента одинаковые данные. Важными данными в MarsPhoto является URL-адрес изображения.
         */
        override fun areContentsTheSame(oldItem: MarsPhoto, newItem: MarsPhoto): Boolean {
            return oldItem.imgSrcUrl == newItem.imgSrcUrl
        }
    }
}