package com.androiddev.musidio.models

import java.time.Duration

data class Song(
    val title: String,
    val trackNumber: Int,
    val year: Int,
    val duration: Int,
    val path: String?,
    val albumName: String,
    val artistId: Int,
    val artistName: String
)