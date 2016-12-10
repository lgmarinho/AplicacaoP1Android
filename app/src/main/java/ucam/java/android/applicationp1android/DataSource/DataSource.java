package ucam.java.android.applicationp1android.DataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import ucam.java.android.applicationp1android.DataModel.DataModel;

/**
 * Created by lg_ma on 08/12/2016.
 */

public class DataSource extends SQLiteOpenHelper {

    SQLiteDatabase db;

    public DataSource(Context context) {
        super(context, DataModel.getDbName(), null, 1);
        db = this.getReadableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(DataModel.criarTabelaLogin());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        onCreate(db);

    }



    public void persist(ContentValues values, String tabela){

        if (values.containsKey("id") && values.getAsInteger("id") != null && values.getAsInteger("id") != 0){

            Integer id = values.getAsInteger("id");
            db.update(tabela, values, "id = " + id, null);
        }
        else {

            db.insert(tabela, null,values);

        }
    }

}
