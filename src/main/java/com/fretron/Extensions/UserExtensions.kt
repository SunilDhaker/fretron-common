package com.fretron.Extensions

import com.fretron.Model.User


fun User.clean(){
    this.setAuthToken(null)
    this.setOnBoardingType(null)
    this.setTokens(null)
    this.setProfileDocumentId(null)
    this.setProfileThumbnailString(null)
}