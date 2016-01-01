package com.example.aksampath.weatherapplication.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;

import com.example.aksampath.weatherapplication.R;

/**
 * Created by Akshay on 2015-10-18.
 */
public class AlertDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity())
            .setTitle(R.string.error_title)
            .setMessage(R.string.error_msg)
            .setPositiveButton(R.string.pos_button_str, null);

        AlertDialog dialog = builder.create();
        return dialog;
    }
}
