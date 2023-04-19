package com.example.trabajoprcticoanexob.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trabajoprcticoanexob.R;
import com.example.trabajoprcticoanexob.databinding.ItemActividadBinding;
import com.example.trabajoprcticoanexob.model.Actividad;

import java.util.List;

public class ActividadAdapter extends RecyclerView.Adapter<ActividadAdapter.ActividadViewHolder> {
    private Context context;
    private List<Actividad> actividades;
    private LayoutInflater inflater;
    private ActividadViewModel actividadViewModel;

    public ActividadAdapter(Context context, List<Actividad> actividades, LayoutInflater inflater) {
        this.context = context;
        this.actividades = actividades;
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public ActividadViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = inflater.inflate(R.layout.item_actividad, parent, false);
        ItemActividadBinding binding = ItemActividadBinding.inflate(inflater, parent, false);
        return new ActividadViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ActividadViewHolder holder, int position) {
        holder.binding.tvNombre.setText(actividades.get(position).getNombre());
        holder.binding.tvDescripcion.setText(actividades.get(position).getDescripcion());
        holder.binding.tvFecha.setText(actividades.get(position).getFecha());
        holder.binding.tvHora.setText(actividades.get(position).getHora());
        holder.binding.tvLugar.setText(actividades.get(position).getLugar());
    }

    @Override
    public int getItemCount() {
        return actividades.size();
    }

    public class ActividadViewHolder extends RecyclerView.ViewHolder {
        ItemActividadBinding binding;

        public ActividadViewHolder(@NonNull ItemActividadBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

            binding.getRoot().setOnClickListener(v -> {
                Bundle bundle = new Bundle();
                bundle.putSerializable("actividad", actividades.get(getAdapterPosition()));
                Navigation.findNavController(v).navigate(R.id.descripcionFragment, bundle);
            });
        }
    }
}
