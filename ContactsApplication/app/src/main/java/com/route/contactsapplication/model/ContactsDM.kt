package com.route.contactsapplication.model


data class ContactsDM(var name: String,
                      var phoneNumber: String,
                      var email: String,
                      var imageId: Int,
                      var id: Int = accountID++){
    private companion object{
        private var accountID = 0
    }
}