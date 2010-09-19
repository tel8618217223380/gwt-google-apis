/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.gwt.visualization.client.visualizations.corechart;

import com.google.gwt.visualization.client.AbstractDataTable;

/**
 * Classic Pie Chart visualization.
 *
 * @see <a href=
 *      "http://code.google.com/apis/visualization/documentation/gallery/piechart.html"
 *      >Pie Chart Visualization Reference</a>
 *
 */
public class ScatterChart extends CoreChart {

  /**
   * @param data
   * @param options
   */
  public ScatterChart(AbstractDataTable data, Options options) {
    super(data, options);
    options.setType(CoreChart.Type.SCATTER);
  }

}
