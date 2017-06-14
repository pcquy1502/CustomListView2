package keyword.tencongty.tenminh.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by admin on 10/13/2016.
 */

public class tutaobientrunggian extends BaseAdapter{
    private Context context;
    private ArrayList <String> duLieuTruyenVao;

    public tutaobientrunggian(Context context, ArrayList<String> duLieuTruyenVao) {
        this.context = context;
        this.duLieuTruyenVao = duLieuTruyenVao;
    }

    @Override
    public int getCount() {
        return duLieuTruyenVao.size();
    }
    @Override
    public Object getItem(int position) {
        return duLieuTruyenVao.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater congCuTrungGian = LayoutInflater.from(context);
        convertView = congCuTrungGian.inflate(R.layout.giaodientuthietke,null);
        TextView txt = (TextView)convertView.findViewById(R.id.noidung);
        txt.setText(duLieuTruyenVao.get(position));
        return convertView;
    }
}
