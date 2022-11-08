package io.github.handharbeni.chart_module.charting.interfaces.dataprovider;

import io.github.handharbeni.chart_module.charting.components.YAxis.AxisDependency;
import io.github.handharbeni.chart_module.charting.data.BarLineScatterCandleBubbleData;
import io.github.handharbeni.chart_module.charting.utils.Transformer;

public interface BarLineScatterCandleBubbleDataProvider extends ChartInterface {

    Transformer getTransformer(AxisDependency axis);
    boolean isInverted(AxisDependency axis);
    
    float getLowestVisibleX();
    float getHighestVisibleX();

    BarLineScatterCandleBubbleData getData();
}
