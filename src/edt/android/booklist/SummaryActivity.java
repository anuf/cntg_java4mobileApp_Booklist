package edt.android.booklist;

import edt.android.booklist.model.Book;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;

public class SummaryActivity extends Activity {
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_summary);
		
		if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
			finish();
			return;
		}
		
		if (savedInstanceState == null){
			Intent intent = getIntent();
			Book book = (Book) intent.getSerializableExtra("selected book");
			Fragment f = SummaryFragment.newInstance(book);				
			getFragmentManager().beginTransaction().add(R.id.container, f).commit();
		}
		
	}
}
