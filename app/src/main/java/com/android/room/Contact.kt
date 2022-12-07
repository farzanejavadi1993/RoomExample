package com.android.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*


@Entity(tableName = "contact")
class Contact {
    var firstName: String? = null
    var lastName: String? = null
    val createdDate: Date? = null

    @PrimaryKey
    var phoneNumber: String? = null
}