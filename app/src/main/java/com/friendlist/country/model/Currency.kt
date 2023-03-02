package com.friendlist.country.model

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.friendlist.country.model.Translations
import com.friendlist.country.model.RegionalBloc

class Currency {
    @SerializedName("code")
    @Expose
    var code: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("symbol")
    @Expose
    var symbol: String? = null
}