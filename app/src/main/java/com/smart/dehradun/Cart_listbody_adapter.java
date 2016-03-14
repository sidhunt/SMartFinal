package com.smart.dehradun;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Cart_listbody_adapter extends BaseAdapter{
	
	Context c;
	List<String>item_name;
	List<Double>price, rate;
	List<Integer>qty;
	
	public Cart_listbody_adapter(Context c, List<String> item_name,
			List<Double> price, List<Double> rate, List<Integer> qty) {
		super();
		this.c = c;
		this.item_name = item_name;
		this.price = price;
		this.rate = rate;
		this.qty = qty;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return item_name.size();
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
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		
		LayoutInflater li=(LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View v=li.inflate(R.layout.cart_listbody_element, arg2, false);
		
		TextView item1=(TextView)v.findViewById(R.id.clel1);
		TextView rate1=(TextView)v.findViewById(R.id.clel2);
		TextView qty1=(TextView)v.findViewById(R.id.clel3);
		TextView price1=(TextView)v.findViewById(R.id.clel4);
		
		item1.setText(item_name.get(arg0));
		rate1.setText(String.valueOf(rate.get(arg0)));
		qty1.setText(String.valueOf(qty.get(arg0)));
		price1.setText(String.valueOf(price.get(arg0)));
		
		return v;
	}
	
	

}
