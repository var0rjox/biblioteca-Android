package com.example.mybooks.model

import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient


@Serializable
data class BookItem(
     @Transient val authors: List<String> = emptyList(),
     @Transient val categories: List<String> = emptyList(),
     @Transient val isbn: String = "",
     @Transient val longDescription: String = "",
     @Transient val pageCount: Int = 0,
     @Transient val shortDescription: String = "",
      val status: String = "",
      val thumbnailUrl: String= "" ,
      val title: String= ""
)