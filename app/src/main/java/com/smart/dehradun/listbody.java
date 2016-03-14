package com.smart.dehradun;


import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

public class listbody extends Fragment implements OnClickListener{
	public listbody(){}
	ListView lv;
	List<Integer> img1,add,qty;
	List<String>name,disp_qty;
	//List<EditText>qty;
	//List<Button>add;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v= inflater.inflate(R.layout.listbody, container,false);
		lv=(ListView) v.findViewById(R.id.listView1);
		img1=new ArrayList<Integer>();
		add=new ArrayList<Integer>();
		
		name=new ArrayList<String>();
		disp_qty=new ArrayList<String>();
		qty=new ArrayList<Integer>();
		//add= new ArrayList<Button>();
		
		
		
		//for(int i=0;i<10;i++)
		//{	
		img1.add(R.id.imageView1);
		name.add("Product n");
		qty.add(R.id.editText1);
		disp_qty.add("Qty :");
		add.add(R.id.button1);
		Menu_adapter adapter=new Menu_adapter(getActivity().getApplicationContext(), img1,name,qty,add);
		lv.setAdapter(adapter);
		
		lv.setOnClickListener(this);
		
		return v;
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Toast.makeText(getActivity(), "Hello",Toast.LENGTH_LONG).show();
	}

}
