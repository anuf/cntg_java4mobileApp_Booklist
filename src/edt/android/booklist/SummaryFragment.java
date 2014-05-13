package edt.android.booklist;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SummaryFragment extends Fragment {
	private TextView resumen;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(
				R.layout.fragment_summary, container, false);
		resumen = (TextView) rootView.findViewById(R.id.tvResumen);
		Intent myIntent = getActivity().getIntent();
		resumen.setText(myIntent.getStringExtra("content"));
		return rootView;
	}
}
