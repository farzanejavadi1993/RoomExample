package com.android.room

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "db-contacts"
        ).allowMainThreadQueries().build()

        val contactDAO =db.contactDAO
        val users = contactDAO?.getContacts()



    }
}