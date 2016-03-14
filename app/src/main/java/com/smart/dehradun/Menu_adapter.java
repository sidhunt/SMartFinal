package com.smart.dehradun;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Menu_adapter extends BaseAdapter{
Context c;
List<Integer> img1;
List<String>name;
List<Integer>qty;
List<Integer>add;

	public Menu_adapter(Context c, List<Integer> img1, List<String> name,
		List<Integer> qty, List<Integer> add) {
	super();
	this.c = c;
	this.img1 = img1;
	this.name = name;
	this.qty = qty;
	this.add = add;
}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int position, View ConvertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater li=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View v=li.inflate(R.layout.menu_custom, parent,false);
		ImageView img=(ImageView)v.findViewById(R.id.imageView1);
		TextView name=(TextView)v.findViewById(R.id.textView1);
		TextView disp_qty=(TextView)v.findViewById(R.id.textView2);
		EditText qty=(EditText)v.findViewById(R.id.editText1);
		img.setImageResource(img1.get(position));
	
		
		return v;
	}

}
