package com.agksoft.scanner.custom_views;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

public class EditTextExtended extends AppCompatEditText {
    public EditTextExtended(Context context) {
        super(context);
        init();
    }
    public EditTextExtended(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    public EditTextExtended(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    private void init() {
    }

    public String getString() {
        return this.getText().toString();
    }
    public int getInt() {
        return Integer.parseInt(this.getText().toString());
    }
    public long getLong() {
        return Long.parseLong(this.getText().toString());
    }
    public float getFloat() {
        return Float.parseFloat(this.getText().toString());
    }

    public boolean validateLong() {
        try
        {
            getLong();
            return true;
        }
        catch (NumberFormatException e)
        {
            setError("Invalid input");
            return false;
        }
    }

    public boolean validateInt() {
        try
        {
            getInt();
            return true;
        }
        catch (NumberFormatException e)
        {
            setError("Invalid input");
            return false;
        }
    }

    public boolean validateFloat() {
        try
        {
            getFloat();
            return true;
        }
        catch (NumberFormatException e)
        {
            setError("Invalid input");
            return false;
        }
    }

    public boolean validatePresence() {
        return (this.getText().toString().length() > 0);
    }


}
