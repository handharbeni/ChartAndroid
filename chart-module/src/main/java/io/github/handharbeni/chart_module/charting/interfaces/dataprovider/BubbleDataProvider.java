package io.github.handharbeni.chart_module.charting.interfaces.dataprovider;

import io.github.handharbeni.chart_module.charting.data.BubbleData;

public interface BubbleDataProvider extends BarLineScatterCandleBubbleDataProvider {

    BubbleData getBubbleData();
}
