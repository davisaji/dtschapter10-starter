package dts.id.caloriesdatabase;

import android.app.Application;
import android.content.Context;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.Date;
import java.util.List;

import dts.id.caloriesdatabase.db.CaloriesRoomDatabase;
import dts.id.caloriesdatabase.db.dao.LogCaloriesDao;
import dts.id.caloriesdatabase.db.entity.LogCaloriesEntity;

public class CaloriesRepository {
    //Todo 4 Membuat Calories Repository
    private CaloriesRoomDatabase caloriesRoomDatabase;
    private  static  LogCaloriesDao logCaloriesDao;

}
