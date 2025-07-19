package com.route.contactsapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.route.contactsapplication.databinding.ActivityMainContactsBinding
import com.route.contactsapplication.databinding.ContactViewBinding
import com.route.contactsapplication.model.ContactsDM

class MainContactsActivity : AppCompatActivity() {

    private var contactsAdapter = ContactsAdapter(mutableListOf())
    private val contactFragment = AddContactFragment()
    private lateinit var binding: ActivityMainContactsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainContactsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addContactButtonListener()
        setUpRecyclerView()

    }

    private fun setUpRecyclerView() {
        binding.recyclerView.adapter = contactsAdapter
    }

    private fun addContactButtonListener(){
        binding.addItemButton.setOnClickListener {
            contactFragment.show(supportFragmentManager,"")
        }
        contactFragment.addContactListener = object :AddContactListener{
            override fun onContactAdd(contactsDM: ContactsDM) {
                contactsAdapter.updateContactList(contactsDM)
                contactFragment.dismiss()
                binding.emptyListPic.setImageResource(0)
                binding.emptyListText.text = ""
            }

        }
    }



}