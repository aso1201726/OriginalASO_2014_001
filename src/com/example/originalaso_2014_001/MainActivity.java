package com.example.originalaso_2014_001;

import java.util.Random;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements
View.OnClickListener
{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}
	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		Button btnGO = (Button)findViewById(R.id.btnGO);
		btnGO.setOnClickListener(this);
		super.onResume();
	}

	@Override
	public void onClick(View v) {

		// TODO 自動生成されたメソっ度

		switch(v.getId()){
			case R.id.btnGO:
			//名前読み込み
			EditText editxt = (EditText)findViewById(R.id.Name);
			String inputMsg = editxt.getText().toString();
			//ランダム値生成
			Random rnd = new Random();
			int ran = rnd.nextInt(4);
			Intent intent = null;

			switch (ran){
				case 0:
				//大吉に移動！！
				intent = new Intent(MainActivity.this,Mikuji_01.class);
				startActivity(intent);
				break;

				//中吉に移動
				case 1:
				intent = new Intent(MainActivity.this,mikuji02.class);
				startActivity(intent);
				break;

				//小吉に移動…
				case 2:
				intent = new Intent(MainActivity.this,mikuji03.class);
				startActivity(intent);
				break;

				//大凶に移動…orz
				case 3:
				intent= new Intent(MainActivity.this,mikuji04.class);
				startActivity(intent);
				break;
			}
		}
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
