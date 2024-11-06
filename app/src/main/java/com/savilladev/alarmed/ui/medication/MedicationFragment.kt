package com.savilladev.alarmed.ui.medication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.savilladev.alarmed.R
import com.savilladev.alarmed.databinding.FragmentMedicationBinding

class MedicationFragment : Fragment() {

    private lateinit var _binding: FragmentMedicationBinding
    private val binding: FragmentMedicationBinding get() = _binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMedicationBinding.inflate(inflater, container,false)
        return binding.root
    }

}