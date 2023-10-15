package com.example.shoppingservice;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;

import com.example.shoppingservice.manager.MyFragmentManager;


public class SearchFragment extends Fragment {

    private EditText search;


    public SearchFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_search, container, false);
        search = rootView.findViewById(R.id.editText_search);
        search.setOnEditorActionListener((v, actionId, event) -> {
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                MyFragmentManager.openFragment(new AdsSearchFragment());
                return true;
            }
            return false;
        });
        return rootView;
    }
}