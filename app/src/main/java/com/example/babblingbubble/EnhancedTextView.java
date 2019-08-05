package com.example.babblingbubble;

/*
Copyright (C) 2019 Vedant K

This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License along with this program. If not, see https://www.gnu.org/licenses/.

*/

import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class EnhancedTextView extends AppCompatTextView {

    private boolean m_modifyingText = false;

    public EnhancedTextView(Context context) {
        super(context);
        init();
    }

    public EnhancedTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public EnhancedTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //Do nothing here
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //Do nothing here
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (m_modifyingText)
                    return;

                //underlineText();
            }
        });

        underlineText();
    }

    private void underlineText() {
        if (m_modifyingText)
            return;

        m_modifyingText = true;

        SpannableString content = new SpannableString(getText());
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        setText(content);

        m_modifyingText = false;
    }
}