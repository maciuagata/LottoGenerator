package lt.vtvpmc.ems.zp182.lotogenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private TextView text_view;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_view = (TextView) findViewById(R.id.text_view);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = 1; i <= 100; i++) {
                    list.add(i);
                }

                Collections.shuffle(list);
                ArrayList<Integer> choosen = new ArrayList<>();
                for (int i = 0; i < 10; i++) {
                    choosen.add(list.get(i));
                }

                StringBuilder sb = new StringBuilder();
                for (int i: choosen) {
                    sb.append(String.valueOf(i));
                    sb.append(", ");
                }
                text_view.setText(sb.toString().replaceAll(", $", ""));
            }
        });
    }
}