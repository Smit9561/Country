package com.friendlist.country.model

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.friendlist.country.model.Translations
import com.friendlist.country.model.RegionalBloc

class Language {
    @SerializedName("iso639_1")
    @Expose
    var iso6391: String? = null

    @SerializedName("iso639_2")
    @Expose
    var iso6392: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("nativeName")
    @Expose
    var nativeName: String? = null
}