package com.example.sw_stage.topfindertut;

import android.view.View;
import android.view.ViewGroup;

import com.google.android.glass.app.Card;
import com.google.android.glass.widget.CardScrollAdapter;

import java.util.List;

/**
 * Created by sw_stage on 11-3-2015.
 */
public class DeveloperAdapter extends CardScrollAdapter {
    private List<Card> mCards;
    private List<DeveloperModel> mData;
    public DeveloperAdapter(List<Card> cards)
    {
        this.mCards = cards;
    }

    @Override
    public int getCount() {
        return mCards.size();
    }

    @Override
    public Object getItem(int i) {
        return mCards.get(i);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return mCards.get(i).getView();
    }

    @Override
    public int getPosition(Object o) {
        return this.mCards.indexOf(o);
    }
}
