package com.example.android.pets;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Insert;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {PetEntity.class}, version = 1)
public abstract class PetDb extends RoomDatabase {

    private static PetDb INSTANCE;

    public abstract PetDao getDao();

    public static PetDb getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    PetDb.class, "pets.db")
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }
}
