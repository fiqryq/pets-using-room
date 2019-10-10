package com.example.android.pets;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class PetViewModel extends AndroidViewModel {

    private LiveData<List<PetEntity>> mData;

    public PetViewModel(@NonNull Application application) {
        super(application);
        mData = PetDb.getInstance(getApplication()).getDao().getAllPets();
    }

    public LiveData<List<PetEntity>> getData(){
        return mData;
    }

}
