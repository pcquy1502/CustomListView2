package keyword.tencongty.tenminh.customlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView danhSach;
    ArrayList<String> tenCaSi= new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        danhSach = (ListView)findViewById(R.id.danhsach);
        tenCaSi.add("Ung Hoang Phuc");
        tenCaSi.add("Dam Vinh Hung");
        tenCaSi.add("Dan Truong");
        tutaobientrunggian bienTrungGian = new tutaobientrunggian(MainActivity.this,tenCaSi);
        danhSach.setAdapter(bienTrungGian);

    }
}
