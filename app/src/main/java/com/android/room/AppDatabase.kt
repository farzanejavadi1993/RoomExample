package com.android.room

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [Contact::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract val contactDAO: ContactDAO?
}