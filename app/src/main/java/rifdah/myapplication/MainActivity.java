package rifdah.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.TypedArray;
import android.os.Bundle;

import java.util.List;

import rifdah.myapplication.adapter.DataAdapter;
import rifdah.myapplication.model.DataDummy;
import rifdah.myapplication.model.DataItem;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DataItem> dataItems;
    DataAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        dataItems = DataDummy.generateDummy();
        adapter = new DataAdapter(this, dataItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }




}
