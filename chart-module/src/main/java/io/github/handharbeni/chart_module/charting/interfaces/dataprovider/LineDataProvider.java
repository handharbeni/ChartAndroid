package io.github.handharbeni.chart_module.charting.interfaces.dataprovider;

import io.github.handharbeni.chart_module.charting.components.YAxis;
import io.github.handharbeni.chart_module.charting.data.LineData;

public interface LineDataProvider extends BarLineScatterCandleBubbleDataProvider {

    LineData getLineData();

    YAxis getAxis(YAxis.AxisDependency dependency);
}
