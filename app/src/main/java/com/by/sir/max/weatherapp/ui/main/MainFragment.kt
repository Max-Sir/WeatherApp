package com.by.sir.max.weatherapp.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.by.sir.max.weatherapp.R
import com.by.sir.max.weatherapp.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: MainFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)
        viewModel = MainViewModel()
        viewModel.getWeather()
        viewModel.text.observe(viewLifecycleOwner) {
            binding.responseText.text = it
        }
        return binding.root
    }


}