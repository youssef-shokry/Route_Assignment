package com.route.contactsapplication

import com.route.contactsapplication.model.ContactsDM

interface AddContactListener {
    fun onContactAdd(contactsDM: ContactsDM)
}