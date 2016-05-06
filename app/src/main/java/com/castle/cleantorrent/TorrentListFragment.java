package com.castle.cleantorrent;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * This is a fragment that lists the torrents available from the home activity.
 * By using a fragment we can drastically change the layout when loading on tablets
 * with higher screen ratios.
 * Created by jaybarnes88 on 5/6/16.
 */
public class TorrentListFragment extends ListFragment {
    private int mCurCheckPosition = 0;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Activity activity = getActivity();
        setListAdapter(new ArrayAdapter<String>(activity, R.layout.torrent_list, R.id.torrent_name, new String[]{
                "hello", "hello", "hello", "hello", "hello", "hello", "hello", "hello", "hello",
                "hello", "hello", "hello", "hello", "hello", "hello", "hello", "hello", "hello",
                "hello", "hello", "hello"
        }));

        // todo - create details pane for easy torrent info on bigger screens

        if (savedInstanceState != null) {
            mCurCheckPosition = savedInstanceState.getInt("curChoice", 0);
        }

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("curChoice", mCurCheckPosition);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
    }
}
