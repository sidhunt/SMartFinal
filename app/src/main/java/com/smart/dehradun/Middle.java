package com.smart.dehradun;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

/**
 * Created by User on 12-03-2016.
 */
public class Middle extends Fragment implements OnClickListener{

        ImageButton ib1, ib2, ib3, ib4;
        public Middle(){}
        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            View v=inflater.inflate(R.layout.main, container, false);
            ib1=(ImageButton)v.findViewById(R.id.imageButton1);
            ib2=(ImageButton)v.findViewById(R.id.imageButton2);
            ib3=(ImageButton)v.findViewById(R.id.imageButton3);
            ib4=(ImageButton)v.findViewById(R.id.imageButton4);
            ib1.setOnClickListener(this);
            ib2.setOnClickListener(this);
            ib3.setOnClickListener(this);
            ib4.setOnClickListener(this);
            return v;


        }

        @Override
        public void onPause() {
            super.onPause();
        }
		@Override
		public void onClick(View v1) {
			// TODO Auto-generated method stub
			switch (v1.getId() ) {
			case R.id.imageButton1:
				Intent i1=new Intent(getActivity().getApplicationContext(),Cart.class);
				startActivity(i1);
				break;
			case R.id.imageButton2:
				Intent i2=new Intent(getActivity().getApplicationContext(),Menu_1.class);
				startActivity(i2);
				
				break;
			case R.id.imageButton3:
				Intent i3=new Intent(getActivity().getApplicationContext(),Menu_1.class);
				startActivity(i3);
				
				break;
			case R.id.imageButton4:
				Intent i4=new Intent(getActivity().getApplicationContext(),Menu_1.class);
				startActivity(i4);
				
	break;

			default:
				break;
			}
		}
}
