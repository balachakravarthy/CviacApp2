package com.cviac.cviacapp;

import java.util.ArrayList;
import java.util.List;

import com.cviac.adapter.ColleguesAdapter;
import com.cviac.adapter.EventsAdapter;
import com.cviac.datamodel.Collegue;
import com.cviac.datamodel.Event;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class Events extends Fragment {
	private ListView lv1;
	List<Event> emps;
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	 
		    View events = inflater.inflate(R.layout.events_frgs, container, false);
	        //((TextView)event.findViewById(R.id.events)).setText("Events");
		lv1=(ListView)events.findViewById(R.id.eventslist);
		 lv1.setDivider(null);
			emps=getEvents();
			   lv1.setAdapter(new EventsAdapter(emps,getActivity().getApplicationContext()));
		        
		        lv1.setOnItemClickListener(new OnItemClickListener () {

					@Override
					public void onItemClick(AdapterView<?> arg0, View arg1, int pos1,
							long pos2) {
						
						Event emp = emps.get(pos1);
					
						Toast.makeText(lv1.getContext(), "clicked:"+ emp.getName(), Toast.LENGTH_SHORT).show();
						
					}});
			
			
	        return events;
}
	 private List<Event> getEvents()
		{
			List<Event> emps = new ArrayList<Event>();
			Event emp = new Event();
			emp.setName("Renuga");
			emp.setType("b'day");
			emp.setDiscription("happy bday");
			emps.add(emp);
			
			emp = new Event();
			emp.setName("Renuga1");
			emp.setType("b'day");
			emp.setDiscription("happy bday");
			
			
			
			emps.add(emp);
			
			emp = new Event();
			emp.setName("office");
			
			emp.setType("meeting");
			emp.setDiscription("3 Oclk");
			
			emps.add(emp);
			
			
			emp = new Event();
			emp.setName("Renuga3");
			
			emp.setType("b'day");
			emp.setDiscription("happy bday");
			
			
			emps.add(emp);
			
			emp = new Event();
			emp.setName("Renuga5");
			emp.setType("b'day");
			emp.setDiscription("happy bday");
			
			emps.add(emp);
			
			return emps;
			
		}
	 }
