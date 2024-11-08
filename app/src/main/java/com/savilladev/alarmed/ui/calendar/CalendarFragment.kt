package com.savilladev.alarmed.ui.calendar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.savilladev.alarmed.R
import com.savilladev.alarmed.databinding.FragmentCalendarBinding


class CalendarFragment : Fragment() {

    private lateinit var _binding: FragmentCalendarBinding
    private val binding: FragmentCalendarBinding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCalendarBinding.inflate(inflater, container, false)
        return binding.root
    }

}