package ru.kostry.app.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: Item)

    @Query("SELECT * from item ORDER BY name ASC")
    fun getItems(): Flow<List<Item>> //рекомендуется использовать тип Flow вместо LiveData. Из-за типа возврата Flow Room выполняет запрос в фоновом потоке. Так же Room обновляет Flow сам без вашей помощи

}