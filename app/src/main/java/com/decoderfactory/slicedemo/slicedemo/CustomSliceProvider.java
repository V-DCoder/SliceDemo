package com.decoderfactory.slicedemo.slicedemo;

import android.net.Uri;

import androidx.slice.Slice;
import androidx.slice.SliceProvider;
import androidx.slice.builders.ListBuilder;

public class CustomSliceProvider extends SliceProvider {

    @Override
    public boolean onCreateSliceProvider() {
        return true;
    }

    @Override
    public Slice onBindSlice(Uri sliceUri) {
        switch (sliceUri.getPath()) {
            case "/temp":
                ListBuilder listBuilder = new ListBuilder(getContext(), sliceUri, ListBuilder.INFINITY);

                // Construct the builder for the row
                ListBuilder.RowBuilder temperatureRow = new ListBuilder.RowBuilder(listBuilder);

                // Set title
                temperatureRow.setTitle("My slice title");

                // TODO: add actions to row; in later step

                // Add the row to the parent builder
                return listBuilder.addRow(temperatureRow).build();


        }
        return null;
    }
}
