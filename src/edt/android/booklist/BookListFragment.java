package edt.android.booklist;

import java.util.List;

import edt.android.booklist.model.Book;
import edt.android.booklist.model.DataAccessFactory;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BookListFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_booklist, container,
				false);
		List<Book> books = DataAccessFactory.getInstance(getActivity()).getBooks();
		return rootView;
	}
}
