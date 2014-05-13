package edt.android.booklist;

import edt.android.booklist.model.DataAccessFactory;
import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;

public class BookListActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_booklist);
		
	}
}
