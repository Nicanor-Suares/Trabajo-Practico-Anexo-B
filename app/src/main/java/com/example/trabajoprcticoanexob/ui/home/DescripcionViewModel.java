package com.example.trabajoprcticoanexob.ui.home;

import android.os.Bundle;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.trabajoprcticoanexob.model.Actividad;

public class DescripcionViewModel extends ActividadViewModel {
    private MutableLiveData<Actividad> actividad = new MutableLiveData<>();

    public LiveData<Actividad> getActividad() {
        return actividad;
    }

    public void datos(Bundle bundle) {
        if(bundle != null) {
            actividad.setValue((Actividad) bundle.getSerializable("actividad"));
        }
    }
}
