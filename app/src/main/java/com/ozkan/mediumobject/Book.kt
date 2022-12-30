package com.ozkan.mediumobject

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Book(
    var id: String = "",
    var title: String = "",
    var author: String = "",
    var description: String = "",
    var price: String = ""
) : Parcelable
