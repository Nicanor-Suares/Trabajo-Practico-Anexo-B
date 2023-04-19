package com.example.trabajoprcticoanexob.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.trabajoprcticoanexob.databinding.FragmentDescripcionBinding;

public class DescripcionFragment extends Fragment {
    FragmentDescripcionBinding binding;
    DescripcionViewModel viewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ActividadViewModel actividadViewModel = new ViewModelProvider(this).get(ActividadViewModel.class);

        binding = FragmentDescripcionBinding.inflate(getLayoutInflater());
        View root = binding.getRoot();

        viewModel = new ViewModelProvider(this).get(DescripcionViewModel.class);

        Bundle bundle = getArguments();
        if(bundle != null) {
            viewModel.datos(bundle);
        }

        viewModel.getActividad().observe(getViewLifecycleOwner(), actividad -> {
            binding.tvNombreDesc.setText(actividad.getNombre());
            binding.tvDescripcionDesc.setText(actividad.getDescripcion());
            binding.tvFechaDesc.setText(actividad.getFecha());
            binding.tvHoraDesc.setText(actividad.getHora());
            binding.tvLugarDesc.setText(actividad.getLugar());
        });

        return root;
    }
}
