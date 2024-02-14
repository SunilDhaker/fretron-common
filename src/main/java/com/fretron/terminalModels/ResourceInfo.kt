package com.fretron.terminalModels

import com.google.gson.GsonBuilder
import javax.ws.rs.NotAllowedException

data class ResourceInfo(
    var resourceId: String?,
    var resourceType: String?,
    var resourceIdentifier: String?,
    var resourceExtId: String?
) {

    constructor() : this(null, null, null, null)

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }

    @Throws(NotAllowedException::class)
    fun validateOrThrow(){
        if(resourceId.isNullOrBlank() || resourceType.isNullOrBlank() || resourceIdentifier.isNullOrBlank()){
            throw NotAllowedException("Bad Request, Invalid resource info.")
        }
    }

    fun isValid():Boolean{
        return !(resourceId.isNullOrBlank() || resourceType.isNullOrBlank() || resourceIdentifier.isNullOrBlank())
    }
}