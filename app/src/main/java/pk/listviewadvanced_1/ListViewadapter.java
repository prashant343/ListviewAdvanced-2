package pk.listviewadvanced_1;

import android.app.Activity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by prashantkaushik on 20/01/17.
 */

public class ListViewadapter extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] content;
    private final Integer[] imgid;

    public ListViewadapter(Activity context, String[] content, Integer[] imgid)
    {
        super(context,R.layout.itemlist,content);
        this.context = context;
        this.content = content;
        this.imgid = imgid;


    }
// updates the Listview's images and text
    public View getView(int position, View view,ViewGroup parent )
    {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.itemlist, null, true);

        TextView tvContent = (TextView) rowView.findViewById(R.id.textview);
        ImageView ivImage = (ImageView) rowView.findViewById(R.id.imageView);

        tvContent.setText(content[position]);
        ivImage.setImageResource(imgid[position]);
        return rowView;
    }
}
