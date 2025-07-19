package com.route.contactsapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.route.contactsapplication.databinding.ContactViewBinding
import com.route.contactsapplication.model.ContactsDM

class ContactsAdapter(private var contacts: MutableList<ContactsDM>) : Adapter<ContactsAdapter.ContactsViewHolder>() {

    override fun onCreateViewHolder(recyclerView: ViewGroup, viewType: Int): ContactsViewHolder {
        val inflater = LayoutInflater.from(recyclerView.context)
        val binding = ContactViewBinding.inflate(inflater, recyclerView, false)
        return ContactsViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {

        val contact = contacts[position]

        holder.binding.contactPhoto.setImageResource(contact.imageId)
        holder.binding.contactName.text = contact.name
        holder.binding.email.text = contact.email
        holder.binding.phoneNumber.text = contact.phoneNumber
    }

    override fun getItemCount(): Int = contacts.size

    fun updateContactList(contactsDM: ContactsDM) {
        contacts.add(contactsDM)
        notifyItemInserted(contacts.size)

    }


    class ContactsViewHolder(var binding: ContactViewBinding) : ViewHolder(binding.root)}