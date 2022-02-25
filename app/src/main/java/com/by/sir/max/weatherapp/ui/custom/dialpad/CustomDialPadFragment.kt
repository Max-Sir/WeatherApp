package com.by.sir.max.weatherapp.ui.custom.dialpad

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.by.sir.max.weatherapp.R

class CustomDialPadFragment : Fragment() {

    companion object {
        fun newInstance() = CustomDialPadFragment()
    }

    private lateinit var viewModel: CustomDialPadViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.custom_dial_pad_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CustomDialPadViewModel::class.java)
        // TODO: Use the ViewModel
    }

}