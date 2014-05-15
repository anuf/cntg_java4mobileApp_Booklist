package edt.android.booklist;

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
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(
				R.layout.fragment_summary, container, false);
		summary = (TextView) rootView.findViewById(R.id.tvSummary);
		switch (getResources().getConfiguration().orientation) {
		case Configuration.ORIENTATION_PORTRAIT:
			
			Intent myIntent = getActivity().getIntent();
			summary.setText(myIntent.getStringExtra(BookListFragment.SUMMARY));
			break;
		case Configuration.ORIENTATION_LANDSCAPE:			
			summary.setText(getArguments().get(BookListFragment.SUMMARY).toString());
			break;

		default:
			break;
		}
		
		return rootView;
	}
}
