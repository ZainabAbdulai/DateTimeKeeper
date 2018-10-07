package com.example.android.datetimepicker;


import android.os.Bundle;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;


import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class TimePickerFragment extends DialogFragment
implements android.app.TimePickerDialog.OnTimeSetListener {
@android.support.annotation.NonNull
@Override
public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {
// Use the current time as the default values for the picker.
final Calendar c = Calendar.getInstance();
int hour = c.get(Calendar.HOUR_OF_DAY);
int minute = c.get(Calendar.MINUTE);
// Create a new instance of TimePickerDialog and return it.
return new android.app.TimePickerDialog(getActivity(), this, hour, minute,
android.text.format.DateFormat.is24HourFormat(getActivity()));
}
public void onTimeSet(android.widget.TimePicker view, int hourOfDay, int minute) {
// Do something with the time chosen by the user.
}
}