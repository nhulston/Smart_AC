package com.smithboys.acdaddy.util.graphs;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.DefaultFillFormatter;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.List;

public class MyFillFormatter implements IFillFormatter {
    private ILineDataSet boundaryDataSet;

    public MyFillFormatter() {
        this((ILineDataSet) null);
    }
    //Pass the data set of other line in the Constructor
    public MyFillFormatter(ILineDataSet boundaryDataSet) {
        this.boundaryDataSet = boundaryDataSet;
    }

    public MyFillFormatter(IFillFormatter fillFormatter){
        this.boundaryDataSet = null;
    }

    public MyFillFormatter(DefaultFillFormatter fillFormatter){
        this.boundaryDataSet = null;
    }

    @Override
    public float getFillLinePosition(ILineDataSet dataSet, LineDataProvider dataProvider) {
        return 0;
    }

    //Define a new method which is used in the LineChartRenderer
    public List<Entry> getFillLineBoundary() {
        if(boundaryDataSet != null) {
            return ((LineDataSet) boundaryDataSet).getValues();
        }
        return null;
    }}

