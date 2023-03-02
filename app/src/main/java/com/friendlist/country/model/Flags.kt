package com.friendlist.country.model

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.friendlist.country.model.Translations
import com.friendlist.country.model.RegionalBloc

class Flags {
    @SerializedName("svg")
    @Expose
    var svg: String? = null

    @SerializedName("png")
    @Expose
    var png: String? = null
}