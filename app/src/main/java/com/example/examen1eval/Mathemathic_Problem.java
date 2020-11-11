package com.example.examen1eval;

import android.os.AsyncTask;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Mathemathic_Problem extends AsyncTask<Long,Long,Boolean> {
    private final List<View> views = new ArrayList<>();
    public Mathemathic_Problem(View...views) {
        super();
        this.views.addAll(Arrays.asList(views));
        // TODO DO THINGS WITH THIS. I THINK THIS WILL NOT DO LEAKS.
    }

    @Override
    protected Boolean doInBackground(Long... longs) {
        while(true) {
            if(isCancelled()) {
                break;
            }
        }
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Boolean aBoolean) {
        super.onPostExecute(aBoolean);
    }

    @Override
    protected void onCancelled(Boolean aBoolean) {
        super.onCancelled(aBoolean);
    }

    @Override
    protected void onProgressUpdate(Long... values) {
        super.onProgressUpdate(values);
    }
}
