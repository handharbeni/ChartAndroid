package io.github.handharbeni.chart_module.charting.listener;

import io.github.handharbeni.chart_module.charting.data.Entry;
import io.github.handharbeni.chart_module.charting.highlight.Highlight;

/**
 * Listener for callbacks when selecting values inside the chart by
 * touch-gesture.
 *
 * @author Philipp Jahoda
 */
public interface OnChartValueSelectedListener {

    /**
     * Called when a value has been selected inside the chart.
     *
     * @param e The selected Entry
     * @param h The corresponding highlight object that contains information
     *          about the highlighted position such as dataSetIndex, ...
     */
    void onValueSelected(Entry e, Highlight h);

    /**
     * Called when nothing has been selected or an "un-select" has been made.
     */
    void onNothingSelected();
}
