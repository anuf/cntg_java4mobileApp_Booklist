package edt.android.booklist;

import java.util.zip.Inflater;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.Toast;

public class BookListActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_booklist);
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.layout_menu, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.action1:
			Toast.makeText(this, item.getTitle() + " selected", Toast.LENGTH_LONG).show();
			break;
		case R.id.action2:
			Toast.makeText(this, item.getTitle() + " selected", Toast.LENGTH_LONG).show();
			break;
		case R.id.action3:
			Toast.makeText(this, item.getTitle() + " selected", Toast.LENGTH_LONG).show();
			break;
		case R.id.action4:
			Toast.makeText(this, item.getTitle() + " selected", Toast.LENGTH_LONG).show();
			break;
		case R.id.action5:
			Toast.makeText(this, item.getTitle() + " selected", Toast.LENGTH_LONG).show();
			break;
		case R.id.action6:
			Toast.makeText(this, item.getTitle() + " selected", Toast.LENGTH_LONG).show();
			break;
		default:
			return super.onOptionsItemSelected(item);
		}
		return true;
	}
	/*
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		super.onCreateContextMenu(menu, v, menuInfo);
		MenuInflater mInflater = getMenuInflater();
		mInflater.inflate(R.menu.context_menu_layout, menu);
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.context_action1:
			Toast.makeText(this, item.getTitle() + " selected", Toast.LENGTH_LONG).show();
			break;
		case R.id.context_action2:
			Toast.makeText(this, item.getTitle() + " selected", Toast.LENGTH_LONG).show();
			break;
		case R.id.context_action3:
			Toast.makeText(this, item.getTitle() + " selected", Toast.LENGTH_LONG).show();
			break;
		case R.id.context_action4:
			Toast.makeText(this, item.getTitle() + " selected", Toast.LENGTH_LONG).show();
			break;
		default:
			return super.onOptionsItemSelected(item);
		}
		return true;
	}
	*/
}
