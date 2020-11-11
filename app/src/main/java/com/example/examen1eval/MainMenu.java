package com.example.examen1eval;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewStub;

public abstract class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewStub stub = findViewById(R.id.viewstub_include);
        stub.setLayoutResource(getActivityLayout());
        stub.inflate();
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @LayoutRes
    protected abstract int getActivityLayout(); /*{
        return R.layout.activity_main;
    }*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    /**
     * This hook is called whenever an item in your options menu is selected.
     * The default implementation simply returns false to have the normal
     * processing happen (calling the item's Runnable or sending a message to
     * its Handler as appropriate).  You can use this method for any items
     * for which you would like to do processing without those other
     * facilities.
     *
     * <p>Derived classes should call through to the base class for it to
     * perform the default menu handling.</p>
     *
     * @param item The menu item that was selected.
     * @return boolean Return false to allow normal menu processing to
     * proceed, true to consume it here.
     * @see #onCreateOptionsMenu
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        Intent intent = new Intent();
        Bundle b = new Bundle();
        if(id == R.id.home_toolbar) {
            intent.setClass(this,HomeActivity.class);
        }
        else if(id == R.id.activity_1_toolbar) {
            intent.setClass(this,Activity_1.class);
        }
        else if(id == R.id.activity_2_toolbar) {
            intent.setClass(this,Activity_2.class);
        }
        startActivity(intent,b);
        return super.onOptionsItemSelected(item);
    }
}