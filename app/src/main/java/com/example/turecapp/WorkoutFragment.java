package com.example.turecapp;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.turecapp.databinding.FragmentThirdBinding;
import com.example.turecapp.databinding.FragmentWorkoutBinding;

public class WorkoutFragment extends Fragment {
private Button btnAdd, btnViewData;
private EditText editText;

    private FragmentWorkoutBinding binding;

    public WorkoutFragment() {

    }


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentWorkoutBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.buttoncardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast myToast = Toast.makeText(getActivity(), "2 Mile Treadmill Run", Toast.LENGTH_SHORT);
                myToast.show();
            }
        });
        binding.buttonstrength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast myToast = Toast.makeText(getActivity(), "Bicep curls for 15min", Toast.LENGTH_SHORT);
                myToast.show();
            }
        });
        binding.buttonbalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast myToast = Toast.makeText(getActivity(), "Leg Lifts for 5min", Toast.LENGTH_SHORT);
                myToast.show();
            }
        });
        binding.buttonaerobics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast myToast = Toast.makeText(getActivity(), "10 Laps in the pool", Toast.LENGTH_SHORT);
                myToast.show();
            }
        });

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}