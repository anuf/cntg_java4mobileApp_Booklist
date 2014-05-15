package edt.android.booklist;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
	
	
}
