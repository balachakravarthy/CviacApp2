package com.cviac.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.cviac.cviacapp.R;
import com.cviac.adapter.ColleguesAdapter.ViewHolder;
import com.cviac.datamodel.ChatMessage;
import com.cviac.datamodel.Conversation;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ChatMessageAdapter extends ArrayAdapter<ChatMessage> {

	private List<ChatMessage> chats;
	public ArrayAdapter adapter;

	private int lastPostion = -1;

	Context mContext;

	public ChatMessageAdapter(List<ChatMessage> objects, Context context) {
		super(context, R.layout.fragment_chat, objects);
		chats = objects;
		mContext = context;
	}
	public static class ViewHolder {
		public TextView msgview;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View vw = convertView;
        ViewHolder holder;
		ChatMessage chat = getItem(position);
		if(convertView==null){

		LayoutInflater inf = LayoutInflater.from(getContext());
		vw = inf.inflate(R.layout.fragment_chat, parent, false);
		holder = new ViewHolder();
	holder.msgview = (TextView) vw.findViewById(R.id.textchatmsg);
		if (chat.isIn()) {
			holder.msgview.setBackgroundResource(R.drawable.bubble1);
		}
		else {
			holder.msgview.setBackgroundResource(R.drawable.bubble2);
		}
		holder.msgview.setText(chat.getMsg().toString());
		
		}else{
			holder=(ViewHolder)vw.getTag();
		}
		return vw;

	}
}
