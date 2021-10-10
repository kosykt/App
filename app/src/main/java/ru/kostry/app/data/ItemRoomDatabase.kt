package ru.kostry.app.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room

@Database(entities = [Item::class], version = 1, exportSchema = false)
abstract class ItemRoomDatabase {

    //дает знать о DAO, можно указать несколько
    abstract fun itemDao(): ItemDao

    //предоставляет доступ к методам создания или получения базы данных, используя имя класса в качестве квалификатора
    companion object {

        //Переменная INSTANCE будет содержать ссылку на базу данных, когда она была создана
        @Volatile //означает, что изменения, внесенные одним потоком в INSTANCE, сразу же видны всем другим потокам
        private var INSTANCE: ItemRoomDatabase? = null

        //Параметр Context понадобится database builder далее
        fun getDatabase(context: Context): ItemRoomDatabase {
            //synchronized означает, что только один поток выполнения может одновременно входить в этот блок кода, что гарантирует, что база данных инициализируется только один раз
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ItemRoomDatabase::class.java,
                    "item_database"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}