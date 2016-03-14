package com.smart.dehradun;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

public class Cart_listbody extends Fragment implements OnItemClickListener{
	public Cart_listbody(){}
	ListView lv;
	TextView item_name_tv, rate_tv, price_tv, qty_tv, total, bill;
	List<String>item_name;
	List<Double>price, rate;
	List<Integer>qty;
	
	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v=inflater.inflate(R.layout.cart_listbody, container, false);
		lv=(ListView)v.findViewById(R.id.listView1);
		item_name_tv=(TextView)v.findViewById(R.id.item);
		rate_tv=(TextView)v.findViewById(R.id.rate);
		qty_tv=(TextView)v.findViewById(R.id.qty);
		price_tv=(TextView)v.findViewById(R.id.price);
		total=(TextView)v.findViewById(R.id.total);
		bill=(TextView)v.findViewById(R.id.bill);
		item_name=new ArrayList<String>();
		rate=new ArrayList<Double>();
		qty=new ArrayList<Integer>();
		price=new ArrayList<Double>();
		
		item_name.add("Abc");
		rate.add(200.32);
		qty.add(4);
		price.add(23.0);
		
		Cart_listbody_adapter adapter=new Cart_listbody_adapter(getActivity().getApplicationContext(), item_name, price, rate, qty);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);
		return v;
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}
	
	

}
