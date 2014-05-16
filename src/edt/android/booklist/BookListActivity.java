package edt.android.booklist;

import edt.android.booklist.model.Book;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class BookListActivity extends Activity {

	Book selectedBook;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_booklist);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new BookListFragment()).commit();
		} else {
			selectedBook = (Book) savedInstanceState.getSerializable("book");
			Fragment f = getFragmentManager().findFragmentById(
					R.id.summaryContainer);			
		}
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
			Toast.makeText(this, item.getTitle() + " selected",
					Toast.LENGTH_LONG).show();
			break;
		case R.id.action2:
			Toast.makeText(this, item.getTitle() + " selected",
					Toast.LENGTH_LONG).show();
			break;
		case R.id.action3:
			Toast.makeText(this, item.getTitle() + " selected",
					Toast.LENGTH_LONG).show();
			break;
		case R.id.action4:
			Toast.makeText(this, item.getTitle() + " selected",
					Toast.LENGTH_LONG).show();
			break;
		case R.id.action5:
			Toast.makeText(this, item.getTitle() + " selected",
					Toast.LENGTH_LONG).show();
			break;
		case R.id.action6:
			Toast.makeText(this, item.getTitle() + " selected",
					Toast.LENGTH_LONG).show();
			break;
		default:
			return super.onOptionsItemSelected(item);
		}
		return true;
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putSerializable("book", selectedBook);
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		if (f != null) {
			BookListFragment blf = (BookListFragment) getFragmentManager()
					.findFragmentById(R.id.container);
			blf.showSummary(selectedBook);
		}
	}
}
