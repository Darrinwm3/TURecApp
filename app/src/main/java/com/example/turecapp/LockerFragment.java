package com.example.turecapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.turecapp.databinding.FragmentGroupBinding;
import com.example.turecapp.databinding.FragmentLockerBinding;

public class LockerFragment extends Fragment {
    private FragmentLockerBinding binding;


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentLockerBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}