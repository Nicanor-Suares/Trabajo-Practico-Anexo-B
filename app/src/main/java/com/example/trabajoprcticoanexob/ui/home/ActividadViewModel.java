package com.example.trabajoprcticoanexob.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.trabajoprcticoanexob.model.Actividad;

public class ActividadViewModel extends ViewModel {

    private MutableLiveData<Actividad> actividadLiveData = new MutableLiveData<>();

    public ActividadViewModel() {

    }
    public LiveData<Actividad> getActividad() {
        return actividadLiveData;
    }
    public void setActividad(Actividad actividad) {
        this.actividadLiveData.setValue(actividad);
    }
}