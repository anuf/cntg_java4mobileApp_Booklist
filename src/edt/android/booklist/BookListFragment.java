package edt.android.booklist;

import java.util.List;

import edt.android.booklist.model.Book;
import edt.android.booklist.model.DataAccessFactory;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.Adapter;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class BookListFragment extends ListFragment {
	public static final String SUMMARY = "summary";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_booklist, container,
				false);
		//
		List<Book> books = DataAccessFactory.getInstance(getActivity())
				.getBooks();
		ArrayAdapter<Book> adapter = new ArrayAdapter<Book>(getActivity(),
				android.R.layout.simple_list_item_1, books);
		setListAdapter(adapter);

		return rootView;
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		showSummary(position);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		registerForContextMenu(getListView());
	}

	/*
	 * @Override public void onCreateOptionsMenu(Menu menu, MenuInflater
	 * inflater) { inflater.inflate(R.menu.layout_menu, menu);
	 * 
	 * }
	 */
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		super.onCreateContextMenu(menu, v, menuInfo);
		MenuInflater mInflater = getActivity().getMenuInflater();
		mInflater.inflate(R.menu.context_menu_layout, menu);
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {

		// --- This is done to get the position of the item we are clicking
		AdapterContextMenuInfo menuInfo = (AdapterContextMenuInfo) item
				.getMenuInfo();
		Adapter adapter = getListAdapter();
		Book theBook = (Book) adapter.getItem(menuInfo.position);
		// ---

		// item.setTitle(menuInfo.position + ":- " +item.getTitle().toString());
		switch (item.getItemId()) {
		case R.id.context_create:
			Toast.makeText(
					getActivity(),
					item.getTitle() + " selected at position "
							+ menuInfo.position, Toast.LENGTH_LONG).show();
			break;
		case R.id.context_read:
			Toast.makeText(
					getActivity(),
					item.getTitle() + " selected at position "
							+ menuInfo.position, Toast.LENGTH_LONG).show();
			break;
		case R.id.context_update:
			Toast.makeText(
					getActivity(),
					item.getTitle() + " selected at position "
							+ menuInfo.position, Toast.LENGTH_LONG).show();
			break;
		case R.id.context_delete:
			Toast.makeText(
					getActivity(),
					item.getTitle() + " selected at position "
							+ menuInfo.position, Toast.LENGTH_LONG).show();
			break;
		default:
			return super.onOptionsItemSelected(item);
		}
		return true;
	}
	
	
	
	public void showSummary(int position){
		Adapter adapter = getListAdapter();
		Book aBook = (Book) adapter.getItem(position);
		
		showSummary(aBook);
	}
	
	public void showSummary(Book book){
		((BookListActivity) getActivity()).selectedBook = book;
		switch (getResources().getConfiguration().orientation) {
		case Configuration.ORIENTATION_PORTRAIT:
			
			Intent openIntent = new Intent(getActivity(), SummaryActivity.class);
			openIntent.putExtra(SUMMARY,book.getSummary());
			startActivity(openIntent);
			break;
		case Configuration.ORIENTATION_LANDSCAPE:
			Fragment myFragment = new SummaryFragment().newInstance(book);
			getFragmentManager().beginTransaction().replace(R.id.summaryContainer, myFragment).commit();
			break;

		default:
			break;
		}
	}

}
