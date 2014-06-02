package com.example.originalaso_2014_001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class mikuji04 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mikuji_04);

		Intent intent = getIntent();
		String name = intent.getStringExtra("name");

		TextView tt = (TextView)findViewById(R.id.t_View1);
		tt.setText(name + "さんの今日の運勢は…");
	}

}
