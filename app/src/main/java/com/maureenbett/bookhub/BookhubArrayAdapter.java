package com.maureenbett.bookhub;

import android.content.Context;
import android.widget.ArrayAdapter;

public class BookhubArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mNovels;
    private String[] mAuthors;
    public  BookhubArrayAdapter(Context mContext, int resource, String[] mNovels, String[] mAuthors) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mNovels = mNovels;
        this.mAuthors = mAuthors;
    }
    @Override
    public Object getItem(int position) {
        String novel= mNovels[position];
        String author = mAuthors[position];
        return String.format("%s \nAuthor: %s", novel, author);
    }

    @Override
    public int getCount() {
        return mNovels.length;
    }
}
