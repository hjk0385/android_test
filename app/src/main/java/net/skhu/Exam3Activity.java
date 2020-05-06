package net.skhu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle; 
import java.util.ArrayList;

public class Exam3Activity extends AppCompatActivity {
    RecyclerView1Adapter recyclerView1Adapter;
    ArrayList<String> arrayList;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam3);
        arrayList = new ArrayList<String>();
        arrayList.add("one");
        arrayList.add("two");
        recyclerView1Adapter = new RecyclerView1Adapter(this, arrayList);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(recyclerView1Adapter);
    }
}