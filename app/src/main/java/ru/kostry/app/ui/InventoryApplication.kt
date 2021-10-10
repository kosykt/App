package ru.kostry.app.ui

import android.app.Application
import ru.kostry.app.data.ItemRoomDatabase

class InventoryApplication : Application(){
    val database: ItemRoomDatabase by lazy { ItemRoomDatabase.getDatabase(this) }
}