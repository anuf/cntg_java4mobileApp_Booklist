package edt.android.booklist;

import edt.android.booklist.model.Book;
import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SummaryFragment extends Fragment {
	private TextView summary;
	
	public static SummaryFragment newInstance(Book book){
		SummaryFragment myFragment = new SummaryFragment();
		Bundle args = new Bundle();
		args.putSerializable("book", book);
		myFragment.setArguments(args);
		return myFragment;
	};
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(
				R.layout.fragment_summary, container, false);

		summary = (TextView) rootView.findViewById(R.id.tvSummary);

		Book book = (Book) getArguments().getSerializable("book");
		switch (getResources().getConfiguration().orientation) {
		case Configuration.ORIENTATION_PORTRAIT:
			
			Intent myIntent = getActivity().getIntent();
			summary.setText(myIntent.getSerializableExtra("book-summary").toString());
			break;
		case Configuration.ORIENTATION_LANDSCAPE:
			if(getArguments()!=null){
				summary.setText(getArguments().get(BookListFragment.SUMMARY).toString());
			}else{
				summary.setText("");
			}
			break;

		default:
			break;
		}
		
		return rootView;
	}
}
