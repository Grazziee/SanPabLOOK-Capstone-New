package sanpablook.study.sanpablook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.study.sanpablook.R;

public class ActivityRatings extends AppCompatActivity {

    ImageButton btnBackAH;
    RecyclerView recyclerViewRatingsUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratings);

        recyclerViewRatingsUser = findViewById(R.id.recyclerViewRatingsUser);
        recyclerViewRatingsUser.setLayoutManager(new LinearLayoutManager(this));

        btnBackAH = findViewById(R.id.buttonBackAH);

        btnBackAH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}