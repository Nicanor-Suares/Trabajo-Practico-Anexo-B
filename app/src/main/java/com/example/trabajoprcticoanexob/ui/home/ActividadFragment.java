package com.example.trabajoprcticoanexob.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trabajoprcticoanexob.databinding.FragmentActividadBinding;
import com.example.trabajoprcticoanexob.model.Actividad;

import java.util.ArrayList;


public class ActividadFragment extends Fragment {
    private FragmentActividadBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ActividadViewModel actividadViewModel =
                new ViewModelProvider(this).get(ActividadViewModel.class);

        binding = FragmentActividadBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        ArrayList<Actividad> listaActividades = new ArrayList<>();
        listaActividades.add(new Actividad("Correr", "Correr para entrenar", "19-04-2023", "18:00", "Calle 1"));
        listaActividades.add(new Actividad("Comer", "Comida post carrer", "19-04-2023", "20:00", "Calle 2"));
        listaActividades.add(new Actividad("Sauna", "Para la recuperación de los músculos", "19-04-2023", "22:00", "Calle 2"));
        listaActividades.add(new Actividad("Dormir", "A mimir para descansar", "19-04-2023", "23:30", "Calle 2"));
        RecyclerView recyclerView = binding.rvListaActividades;
        GridLayoutManager grilla = new GridLayoutManager(getContext(), 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(grilla);

        ActividadAdapter adapter = new ActividadAdapter(getContext(), listaActividades, getLayoutInflater());
        recyclerView.setAdapter(adapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}