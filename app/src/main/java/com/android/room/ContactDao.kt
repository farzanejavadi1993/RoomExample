package com.android.room

import androidx.room.*


@Dao
interface ContactDAO {
    @Insert
    fun insert(contacts: Contact)

    @Update
    fun update(contacts: Contact)

    @Delete
    fun delete(contact: Contact)

    @Query("SELECT * FROM contact")
    fun getContacts(): List<Contact>

    @Query("SELECT * FROM contact WHERE phoneNumber = :number")
    fun getContactWithId(number: String): Contact
}