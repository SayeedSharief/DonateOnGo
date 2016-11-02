package com.naveen.donateongo;

import android.app.Activity;
import android.app.ListActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * Created by lenovo on 29-10-2016.
 */

public class blood_listing extends Activity{
String blood_groups[] = {"B +ve", "AB +ve","O +ve"};
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,blood_groups);
    ListView list1 = (ListView)findViewById(R.id.list_item);

}
