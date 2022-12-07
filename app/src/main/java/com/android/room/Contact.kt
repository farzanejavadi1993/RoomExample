package com.android.room

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "contact")
class Contact {
    var firstName: String? = null
    var lastName: String? = null

    @PrimaryKey
    var phoneNumber: String? = null
}