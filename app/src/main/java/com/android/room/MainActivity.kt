package com.android.room

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "db-contacts"
        ).allowMainThreadQueries().build()

        val contactDAO = db.contactDAO


        //Inserting a contact
        val contact = Contact()
        contact.firstName = "Farzaneh"
        contact.lastName = "javadi"
        contact.phoneNumber = "1234567890"
        contactDAO!!.insert(contact)



        //Getting a single contact and updating it
        val contactByPhone = contactDAO.getContactWithId("1234567890")
        contactByPhone.firstName = "Kevin"
        contactByPhone.lastName = "Brew"
        contactDAO.update(contact)


    }
}