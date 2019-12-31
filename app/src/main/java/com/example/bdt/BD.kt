package com.example.bdt

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName="birthday")
data class BD (
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name:String,
    val dob: String
)

