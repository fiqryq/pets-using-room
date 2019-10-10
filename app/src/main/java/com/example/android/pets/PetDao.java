package com.example.android.pets;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface PetDao {

    @Insert
    void insert(PetEntity entity);

    @Delete
    void delete(PetEntity entity);

    @Update
    void update(PetEntity entity);

    @Query("SELECT * FROM pets")
    LiveData<List<PetEntity>> getAllPets();

    @Query("DELETE FROM pets")
    void deleteAllPets();
}


