package com.example.pavan.cabletvcrm.Adapters;

import android.text.Editable;
import android.text.TextWatcher;

/**
 * Created by Pavan on 9/14/2016.
 */
public abstract class TextWatcherAdapter implements TextWatcher {
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public abstract void afterTextChanged(Editable s);
}
