package edt.android.booklist;

import java.util.List;

import edt.android.booklist.model.Book;
import edt.android.booklist.model.DataAccessFactory;
import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BookListFragment extends ListFragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_booklist, container,
				false);
		List<Book> books = DataAccessFactory.getInstance(getActivity()).getBooks();
//		ListView lv = (ListView) getActivity().findViewById(android.R.id.list);
		ArrayAdapter<Book> adapter = new ArrayAdapter<Book>(getActivity(), android.R.layout.simple_list_item_1, books);
		setListAdapter(adapter);

		return rootView;
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {	
		
		Adapter adapter = getListAdapter();
		Intent openIntent = new Intent(getActivity(),SummaryActivity.class);
		openIntent.putExtra("content", ((Book) adapter.getItem(position)).getSummary());
    	startActivity(openIntent); 
		
	}
}
