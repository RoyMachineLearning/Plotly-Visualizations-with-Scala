// Databricks notebook source
// MAGIC %md This notebook shows the implementation of Plotly using displayHTML with the list created in Scala

// COMMAND ----------

// MAGIC %md 1. Line Graph

// COMMAND ----------

val Xs = Seq(1,2,3,4,5)
val Ys = Seq(1,2,4,36,16)

displayHTML(s""" <head>
               <script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
               
               <div id="tester" style="width:400px;height:400px;"></div>
               
               <script>
                 TESTER = document.getElementById('tester');
                 
                 var trace1 = {
                              x: [${Xs(0)}, ${Xs(1)}, ${Xs(2)}, ${Xs(3)}, ${Xs(4)}],
                              y: [${Ys(0)}, ${Ys(1)}, ${Ys(2)}, ${Ys(3)}, ${Ys(4)}],
                              mode: 'lines',
                              type: 'scatter',
                              name: 'First Trace',
                              text: ['Text 1', 'Text 2', 'Text 3', 'Text 4', 'Text 5']
                              };
                 var layout = {
                               showlegend: true,
                               title:'Enter your title here',
                               "titlefont": {
                                              family : 'Verdana', size:18, color:'#7f7f7f'
                                            },                           
                               xaxis: {
                                        title: 'x Axis',
                                        titlefont: {
                                          family: 'Courier New, monospace',
                                          size: 18,
                                          color: '#7f7f7f'
                                        }
                                      },
                              yaxis: {
                                title: 'y Axis',
                                titlefont: {
                                  family: 'Courier New, monospace',
                                  size: 18,
                                  color: '#7f7f7f'
                                }
                              },
                              legend: {"orientation": "V",font: {
                                                                    family: 'sans-serif',
                                                                    size: 12,
                                                                    color: '#000'
                                                                }
                              }, 
                              bgcolor: '#E2E2E2',
                              bordercolor: '#FFFFFF',
                              borderwidth: 2
                              };
                 var data = [trace1];
                 Plotly.newPlot(TESTER, data, layout);
                </script>
               
</head> """)

// COMMAND ----------

// MAGIC %md 2.. Scatter Plot

// COMMAND ----------

val Xs = Seq(1,2,3,4,5)
val Ys = Seq(1,2,4,36,16)

displayHTML(s""" <head>
               <script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
               
               <div id="tester" style="width:400px;height:400px;"></div>
               
               <script>
                 TESTER = document.getElementById('tester');
                 
                 var trace1 = {
                              x: [${Xs(0)}, ${Xs(1)}, ${Xs(2)}, ${Xs(3)}, ${Xs(4)}],
                              y: [${Ys(0)}, ${Ys(1)}, ${Ys(2)}, ${Ys(3)}, ${Ys(4)}],
                              mode: 'markers',
                              type: 'scatter',
                              name: 'First Trace',
                              text: ['Text 1', 'Text 2', 'Text 3', 'Text 4', 'Text 5']
                              };
                 var layout = {
                               showlegend: true,
                               title:'Enter your title here',
                               "titlefont": {
                                              family : 'Verdana', size:18, color:'#7f7f7f'
                                            },                           
                               xaxis: {
                                        title: 'x Axis',
                                        titlefont: {
                                          family: 'Courier New, monospace',
                                          size: 18,
                                          color: '#7f7f7f'
                                        }
                                      },
                              yaxis: {
                                title: 'y Axis',
                                titlefont: {
                                  family: 'Courier New, monospace',
                                  size: 18,
                                  color: '#7f7f7f'
                                }
                              },
                              legend: {"orientation": "V",font: {
                                                                    family: 'sans-serif',
                                                                    size: 12,
                                                                    color: '#000'
                                                                }
                              }, 
                              bgcolor: '#E2E2E2',
                              bordercolor: '#FFFFFF',
                              borderwidth: 2
                              };
                 var data = [trace1];
                 Plotly.newPlot(TESTER, data, layout);
                </script>
               
</head> """)

// COMMAND ----------

// MAGIC %md 3.. 3D Scatter Plots

// COMMAND ----------

val Xs = Seq(1,2,3,4,5)
val Ys = Seq(1,2,4,36,16)
val zs = Seq(2,44,6,72,10)

displayHTML(s""" <head>
               <script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
               
               <div id="tester" style="width:400px;height:400px;"></div>
               
               <script>
                 TESTER = document.getElementById('tester');
                 
                 var trace1 = {
                              x: [${Xs(0)}, ${Xs(1)}, ${Xs(2)}, ${Xs(3)}, ${Xs(4)}],
                              y: [${Ys(0)}, ${Ys(1)}, ${Ys(2)}, ${Ys(3)}, ${Ys(4)}],
                              z: [${zs(0)}, ${zs(1)}, ${zs(2)}, ${zs(3)}, ${zs(4)}],
                              mode: 'markers',
                              type: 'scatter3d',
                              name: 'First Trace',
                              text: ['Text 1', 'Text 2', 'Text 3', 'Text 4', 'Text 5']
                              };
                 var layout = {
                               showlegend: true,
                               title:'Enter your title here',
                               "titlefont": {
                                              family : 'Verdana', size:18, color:'#7f7f7f'
                                            },                           
                               xaxis: {
                                        title: 'x Axis',
                                        titlefont: {
                                          family: 'Courier New, monospace',
                                          size: 18,
                                          color: '#7f7f7f'
                                        }
                                      },
                              yaxis: {
                                title: 'y Axis',
                                titlefont: {
                                  family: 'Courier New, monospace',
                                  size: 18,
                                  color: '#7f7f7f'
                                }
                              },
                              legend: {"orientation": "V",font: {
                                                                    family: 'sans-serif',
                                                                    size: 12,
                                                                    color: '#000'
                                                                }
                              }, 
                              bgcolor: '#E2E2E2',
                              bordercolor: '#FFFFFF',
                              borderwidth: 2
                              };
                 var data = [trace1];
                 Plotly.newPlot(TESTER, data, layout);
                </script>
               
</head> """)

// COMMAND ----------

// MAGIC %md 4.. 3D Line Plots

// COMMAND ----------

val Xs = Seq(1,2,3,4,5)
val Ys = Seq(1,2,4,36,16)
val zs = Seq(2,44,6,72,10)

displayHTML(s""" <head>
               <script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
               
               <div id="tester" style="width:400px;height:400px;"></div>
               
               <script>
                 TESTER = document.getElementById('tester');
                 
                 var trace1 = {
                              x: [${Xs(0)}, ${Xs(1)}, ${Xs(2)}, ${Xs(3)}, ${Xs(4)}],
                              y: [${Ys(0)}, ${Ys(1)}, ${Ys(2)}, ${Ys(3)}, ${Ys(4)}],
                              z: [${zs(0)}, ${zs(1)}, ${zs(2)}, ${zs(3)}, ${zs(4)}],
                              mode: 'lines',
                              type: 'scatter3d',
                              name: 'First Trace',
                              text: ['Text 1', 'Text 2', 'Text 3', 'Text 4', 'Text 5']
                              };
                 var layout = {
                               showlegend: true,
                               title:'Enter your title here',
                               "titlefont": {
                                              family : 'Verdana', size:18, color:'#7f7f7f'
                                            },                           
                               xaxis: {
                                        title: 'x Axis',
                                        titlefont: {
                                          family: 'Courier New, monospace',
                                          size: 18,
                                          color: '#7f7f7f'
                                        }
                                      },
                              yaxis: {
                                title: 'y Axis',
                                titlefont: {
                                  family: 'Courier New, monospace',
                                  size: 18,
                                  color: '#7f7f7f'
                                }
                              },
                              legend: {"orientation": "V",font: {
                                                                    family: 'sans-serif',
                                                                    size: 12,
                                                                    color: '#000'
                                                                }
                              }, 
                              bgcolor: '#E2E2E2',
                              bordercolor: '#FFFFFF',
                              borderwidth: 2
                              };
                 var data = [trace1];
                 Plotly.newPlot(TESTER, data, layout);
                </script>
               
</head> """)

// COMMAND ----------

// MAGIC %md 5.. 3D MESH

// COMMAND ----------

val Xs = Seq(1,2,3,4,5)
val Ys = Seq(1,2,4,36,16)
val zs = Seq(2,44,6,72,10)

displayHTML(s""" <head>
               <script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
               
               <div id="tester" style="width:400px;height:400px;"></div>
               
               <script>
                 TESTER = document.getElementById('tester');
                 
                 var trace1 = {
                              x: [${Xs(0)}, ${Xs(1)}, ${Xs(2)}, ${Xs(3)}, ${Xs(4)}],
                              y: [${Ys(0)}, ${Ys(1)}, ${Ys(2)}, ${Ys(3)}, ${Ys(4)}],
                              z: [${zs(0)}, ${zs(1)}, ${zs(2)}, ${zs(3)}, ${zs(4)}],
                              opacity:0.8,
                              color:'rgb(300,100,200,300)',
                              type: 'mesh3d',
                              name: 'First Trace',
                              text: ['Text 1', 'Text 2', 'Text 3', 'Text 4', 'Text 5']
                              };
                 var layout = {
                               showlegend: true,
                               title:'Enter your title here',
                               "titlefont": {
                                              family : 'Verdana', size:18, color:'#7f7f7f'
                                            },                           
                               xaxis: {
                                        title: 'x Axis',
                                        titlefont: {
                                          family: 'Courier New, monospace',
                                          size: 18,
                                          color: '#7f7f7f'
                                        }
                                      },
                              yaxis: {
                                title: 'y Axis',
                                titlefont: {
                                  family: 'Courier New, monospace',
                                  size: 18,
                                  color: '#7f7f7f'
                                }
                              },
                              legend: {"orientation": "V",font: {
                                                                    family: 'sans-serif',
                                                                    size: 12,
                                                                    color: '#000'
                                                                }
                              }, 
                              bgcolor: '#E2E2E2',
                              bordercolor: '#FFFFFF',
                              borderwidth: 2
                              };
                 var data = [trace1];
                 Plotly.newPlot(TESTER, data, layout);
                </script>
               
</head> """)

// COMMAND ----------

// MAGIC %md 6.. 3D MESH

// COMMAND ----------

val Xs = Seq(1,2,3,4,5,6,7,8,9,1,2,3,4,5,5)
val Ys = Seq(1,2,4,3,1,5,4,3,4,5,7,7,3,3,4)

displayHTML(s""" <head>
               <script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
               
               <div id="tester" style="width:400px;height:400px;"></div>
               
               <script>
                 TESTER = document.getElementById('tester');
                 
                 var trace1 = {
                              x: [${Xs(0)}, ${Xs(1)}, ${Xs(2)}, ${Xs(3)}, ${Xs(4)}, ${Xs(5)}, ${Xs(6)}, ${Xs(7)}, ${Xs(8)}, ${Xs(9)}, ${Xs(10)}, ${Xs(11)}, ${Xs(12)}, ${Xs(13)}, ${Xs(14)}],
                              y: [${Ys(0)}, ${Ys(1)}, ${Ys(2)}, ${Ys(3)}, ${Ys(4)}, ${Ys(5)}, ${Ys(6)}, ${Ys(7)}, ${Ys(8)}, ${Ys(9)}, ${Ys(10)}, ${Ys(11)}, ${Ys(12)}, ${Ys(13)}, ${Ys(14)}],
                              type: 'histogram',
                              autobinx: true, 
                              marker: {
                                      color: "rgba(218, 171, 215, 1)",
                                       line: {
                                        color:  "rgba(218, 171, 215,1)", 
                                        width: 1
                                      }}, 
                              opacity: 0.5, 
                              type: "histogram", 
                              xbins: {
                                size: 0.06, 
                              }};
                              
                 var layout = {
                               showlegend: true,
                               title:'Enter your title here',
                               bargap: 0.05, 
                               bargroupgap: 0.2, 
                               barmode: "overlay", 
                               "titlefont": {
                                              family : 'Verdana', size:18, color:'#7f7f7f'
                                            },                           
                               xaxis: {
                                        title: 'x Axis',
                                        titlefont: {
                                          family: 'Courier New, monospace',
                                          size: 18,
                                          color: '#7f7f7f'
                                        }
                                      },
                              yaxis: {
                                title: 'y Axis',
                                titlefont: {
                                  family: 'Courier New, monospace',
                                  size: 18,
                                  color: '#7f7f7f'
                                }
                              },
                              legend: {"orientation": "V",font: {
                                                                    family: 'sans-serif',
                                                                    size: 12,
                                                                    color: '#000'
                                                                }
                              }, 
                              bgcolor: '#E2E2E2',
                              bordercolor: '#FFFFFF',
                              borderwidth: 2
                              };
                 var data = [trace1];
                 Plotly.newPlot(TESTER, data, layout);
                </script>
               
</head> """)

// COMMAND ----------

// MAGIC %md 7.. Box Plot

// COMMAND ----------

val Xs = Seq(1,2,3,4,5)
val Ys = Seq(2,4,3,7,1)

displayHTML(s""" <head>
               <script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
               
               <div id="tester" style="width:400px;height:400px;"></div>
               
               <script>
                 TESTER = document.getElementById('tester');
                 
                 var trace1 = {
                              y: [${Xs(0)}, ${Xs(1)}, ${Xs(2)}, ${Xs(3)}, ${Xs(4)}],
                                                         
                              type: 'box',
                              name: 'First Trace',
                              text: ['Text 1', 'Text 2', 'Text 3', 'Text 4', 'Text 5']
                              };
                              
                 var trace2 = {
                              y: [${Ys(0)}, ${Ys(1)}, ${Ys(2)}, ${Ys(3)}, ${Ys(4)}],
                             
                              type: 'box',
                              name: 'Second Trace',
                              text: ['Text 1', 'Text 2', 'Text 3', 'Text 4', 'Text 5']
                              };
                 var layout = {
                               showlegend: true,
                               title:'Enter your title here',
                               "titlefont": {
                                              family : 'Verdana', size:18, color:'#7f7f7f'
                                            },                           
                               xaxis: {
                                        title: 'x Axis',
                                        titlefont: {
                                          family: 'Courier New, monospace',
                                          size: 18,
                                          color: '#7f7f7f'
                                        }
                                      },
                              yaxis: {
                                title: 'y Axis',
                                titlefont: {
                                  family: 'Courier New, monospace',
                                  size: 18,
                                  color: '#7f7f7f'
                                }
                              },
                              legend: {"orientation": "V",font: {
                                                                    family: 'sans-serif',
                                                                    size: 12,
                                                                    color: '#000'
                                                                }
                              }, 
                            
                              };
                 var data = [trace1, trace2];
                 Plotly.newPlot(TESTER, data, layout);
                </script>
               
</head> """)

// COMMAND ----------

// MAGIC %md 8.. Vertical Bar Graph

// COMMAND ----------

val Ys = Seq(1,2,3,2,4)
val Ys2 = Seq(4,5,2,1,3)
//val Ys = list("Text 1", "Text 2", "Text 3", "Text 4", "Text 5")

displayHTML(s""" <head>
               <script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
               
               <div id="tester" style="width:400px;height:400px;"></div>
               
               <script>
                 TESTER = document.getElementById('tester');
                 
                 var trace1 = {
                              x: ["Text 1", "Text 2", "Text 3", "Text 4", "Text 5"],
                              y: [${Ys(0)}, ${Ys(1)}, ${Ys(2)}, ${Ys(3)}, ${Ys(4)}],
                              type: 'bar',
                              name: 'First Trace',
                              text: ['Text 1', 'Text 2', 'Text 3', 'Text 4', 'Text 5']
                              };
                 var trace2 = {
                              x: ["Text 1", "Text 2", "Text 3", "Text 4", "Text 5"],
                              y: [${Ys2(0)}, ${Ys2(1)}, ${Ys2(2)}, ${Ys2(3)}, ${Ys2(4)}],
                              type: 'bar',
                              name: 'Second Trace',
                              text: ['Text 1', 'Text 2', 'Text 3', 'Text 4', 'Text 5']
                              };
                 var layout = {
                               showlegend: true,
                               title:'Enter your title here',
                               "titlefont": {
                                              family : 'Verdana', size:18, color:'#7f7f7f'
                                            },                           
                               xaxis: {
                                        title: 'x Axis',
                                        titlefont: {
                                          family: 'Courier New, monospace',
                                          size: 18,
                                          color: '#7f7f7f'
                                        }
                                      },
                              yaxis: {
                                title: 'y Axis',
                                titlefont: {
                                  family: 'Courier New, monospace',
                                  size: 18,
                                  color: '#7f7f7f'
                                }
                              },
                              legend: {"orientation": "V",font: {
                                                                    family: 'sans-serif',
                                                                    size: 12,
                                                                    color: '#000'
                                                                }
                              }, 
                              bgcolor: '#E2E2E2',
                              bordercolor: '#FFFFFF',
                              borderwidth: 2
                              };
                 var data = [trace1, trace2];
                 Plotly.newPlot(TESTER, data, layout);
                </script>
               
</head> """)

// COMMAND ----------

// MAGIC %md 8(b)..Vertical Stacked Bar Chart

// COMMAND ----------

val Ys = Seq(1,2,3,2,4)
val Ys2 = Seq(4,5,2,1,3)
//val Ys = list("Text 1", "Text 2", "Text 3", "Text 4", "Text 5")

displayHTML(s""" <head>
               <script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
               
               <div id="tester" style="width:400px;height:400px;"></div>
               
               <script>
                 TESTER = document.getElementById('tester');
                 
                 var trace1 = {
                              x: ["Text 1", "Text 2", "Text 3", "Text 4", "Text 5"],
                              y: [${Ys(0)}, ${Ys(1)}, ${Ys(2)}, ${Ys(3)}, ${Ys(4)}],
                              type: 'bar',
                              name: 'First Trace',
                              text: ['Text 1', 'Text 2', 'Text 3', 'Text 4', 'Text 5']
                              };
                 var trace2 = {
                              x: ["Text 1", "Text 2", "Text 3", "Text 4", "Text 5"],
                              y: [${Ys2(0)}, ${Ys2(1)}, ${Ys2(2)}, ${Ys2(3)}, ${Ys2(4)}],
                              type: 'bar',
                              name: 'Second Trace',
                              text: ['Text 1', 'Text 2', 'Text 3', 'Text 4', 'Text 5']
                              };
                 var layout = {
                               showlegend: true,
                               barmode: 'stack',
                               title:'Enter your title here',
                               "titlefont": {
                                              family : 'Verdana', size:18, color:'#7f7f7f'
                                            },                           
                               xaxis: {
                                        title: 'x Axis',
                                        titlefont: {
                                          family: 'Courier New, monospace',
                                          size: 18,
                                          color: '#7f7f7f'
                                        }
                                      },
                              yaxis: {
                                title: 'y Axis',
                                titlefont: {
                                  family: 'Courier New, monospace',
                                  size: 18,
                                  color: '#7f7f7f'
                                }
                              },
                              legend: {"orientation": "V",font: {
                                                                    family: 'sans-serif',
                                                                    size: 12,
                                                                    color: '#000'
                                                                }
                              }, 
                              bgcolor: '#E2E2E2',
                              bordercolor: '#FFFFFF',
                              borderwidth: 2
                              };
                 var data = [trace1, trace2];
                 Plotly.newPlot(TESTER, data, layout);
                </script>
               
</head> """)

// COMMAND ----------

// MAGIC %md 8(c). Horizontal BarChart

// COMMAND ----------

val Ys = Seq(1,2,3,2,4)
val Ys2 = Seq(4,5,2,1,3)
//val Ys = list("Text 1", "Text 2", "Text 3", "Text 4", "Text 5")

displayHTML(s""" <head>
               <script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
               
               <div id="tester" style="width:400px;height:400px;"></div>
               
               <script>
                 TESTER = document.getElementById('tester');
                 
                 var trace1 = {
                              y: ["Text 1", "Text 2", "Text 3", "Text 4", "Text 5"],
                              x: [${Ys(0)}, ${Ys(1)}, ${Ys(2)}, ${Ys(3)}, ${Ys(4)}],
                              type: 'bar',
                              orientation: 'h',
                              name: 'First Trace',
                              text: ['Text 1', 'Text 2', 'Text 3', 'Text 4', 'Text 5']
                              };
                 var trace2 = {
                              y: ["Text 1", "Text 2", "Text 3", "Text 4", "Text 5"],
                              x: [${Ys2(0)}, ${Ys2(1)}, ${Ys2(2)}, ${Ys2(3)}, ${Ys2(4)}],
                              orientation: 'h',
                              type: 'bar',
                              name: 'Second Trace',
                              text: ['Text 1', 'Text 2', 'Text 3', 'Text 4', 'Text 5']
                              };             
                 var layout = {
                               showlegend: true,
                               title:'Enter your title here',
                               "titlefont": {
                                              family : 'Verdana', size:18, color:'#7f7f7f'
                                            },                           
                               xaxis: {
                                        title: 'x Axis',
                                        titlefont: {
                                          family: 'Courier New, monospace',
                                          size: 18,
                                          color: '#7f7f7f'
                                        }
                                      },
                              yaxis: {
                                title: 'y Axis',
                                titlefont: {
                                  family: 'Courier New, monospace',
                                  size: 18,
                                  color: '#7f7f7f'
                                }
                              },
                              legend: {"orientation": "V",font: {
                                                                    family: 'sans-serif',
                                                                    size: 12,
                                                                    color: '#000'
                                                                }
                              }, 
                              bgcolor: '#E2E2E2',
                              bordercolor: '#FFFFFF',
                              borderwidth: 2
                              };
                              
                 var data = [trace1,trace2];
                 Plotly.newPlot(TESTER, data, layout);
                </script>
               
</head> """)

// COMMAND ----------

// MAGIC %md 8d. Stacked Horizontal Bar Chart

// COMMAND ----------

val Ys = Seq(1,2,3,2,4)
val Ys2 = Seq(4,5,2,1,3)
//val Ys = list("Text 1", "Text 2", "Text 3", "Text 4", "Text 5")

displayHTML(s""" <head>
               <script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
               
               <div id="tester" style="width:400px;height:400px;"></div>
               
               <script>
                 TESTER = document.getElementById('tester');
                 
                 var trace1 = {
                              y: ["Text 1", "Text 2", "Text 3", "Text 4", "Text 5"],
                              x: [${Ys(0)}, ${Ys(1)}, ${Ys(2)}, ${Ys(3)}, ${Ys(4)}],
                              type: 'bar',
                              orientation: 'h',
                              name: 'First Trace',
                              text: ['Text 1', 'Text 2', 'Text 3', 'Text 4', 'Text 5']
                              };
                 var trace2 = {
                              y: ["Text 1", "Text 2", "Text 3", "Text 4", "Text 5"],
                              x: [${Ys2(0)}, ${Ys2(1)}, ${Ys2(2)}, ${Ys2(3)}, ${Ys2(4)}],
                              orientation: 'h',
                              type: 'bar',
                              name: 'Second Trace',
                              text: ['Text 1', 'Text 2', 'Text 3', 'Text 4', 'Text 5']
                              };             
                 var layout = {
                               showlegend: true,
                               barmode: 'stack',
                               title:'Enter your title here',
                               "titlefont": {
                                              family : 'Verdana', size:18, color:'#7f7f7f'
                                            },                           
                               xaxis: {
                                        title: 'x Axis',
                                        titlefont: {
                                          family: 'Courier New, monospace',
                                          size: 18,
                                          color: '#7f7f7f'
                                        }
                                      },
                              yaxis: {
                                title: 'y Axis',
                                titlefont: {
                                  family: 'Courier New, monospace',
                                  size: 18,
                                  color: '#7f7f7f'
                                }
                              },
                              legend: {"orientation": "V",font: {
                                                                    family: 'sans-serif',
                                                                    size: 12,
                                                                    color: '#000'
                                                                }
                              }, 
                              bgcolor: '#E2E2E2',
                              bordercolor: '#FFFFFF',
                              borderwidth: 2
                              };
                              
                 var data = [trace1,trace2];
                 Plotly.newPlot(TESTER, data, layout);
                </script>
               
</head> """)

// COMMAND ----------

// MAGIC %md 9.. Pie Chart

// COMMAND ----------

val Ys = Seq(1,2,3,2,4)
//val Ys = list("Text 1", "Text 2", "Text 3", "Text 4", "Text 5")

displayHTML(s""" <head>
               <script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
               
               <div id="tester" style="width:400px;height:400px;"></div>
               
               <script>
                 TESTER = document.getElementById('tester');
                 
                 var trace1 = {
                              labels: ["Text 1", "Text 2", "Text 3", "Text 4", "Text 5"],
                              values: [${Ys(0)}, ${Ys(1)}, ${Ys(2)}, ${Ys(3)}, ${Ys(4)}],
                              type: 'pie', 
                              marker: {
                                      'colors': [
                                                  'rgb(233, 142, 120)',
                                                  'rgb(155, 155, 230)',
                                                  'rgb(218, 171, 215)',
                                                  'rgb(210, 148, 210)',
                                                  'rgb(220, 188, 210)']
                                      }
                              };
                 var layout = {
                               showlegend: true,
                               title:'Enter your title here',
                               "titlefont": {
                                              family : 'Verdana', size:18, color:'#7f7f7f'
                                            },                           
                              
                              };
                 var data = [trace1];
                 Plotly.newPlot(TESTER, data, layout);
                </script>
               
</head> """)

// COMMAND ----------

// MAGIC %md 10..Donut

// COMMAND ----------

val Ys = Seq(1,2,3,2,4)
//val Ys = list("Text 1", "Text 2", "Text 3", "Text 4", "Text 5")

displayHTML(s""" <head>
               <script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
               
               <div id="tester" style="width:400px;height:400px;"></div>
               
               <script>
                 TESTER = document.getElementById('tester');
                 
                 var trace1 = {
                              labels: ["Text 1", "Text 2", "Text 3", "Text 4", "Text 5"],
                              values: [${Ys(0)}, ${Ys(1)}, ${Ys(2)}, ${Ys(3)}, ${Ys(4)}],
                              type: 'pie',
                              hole: .4,
                              textposition: 'inside',
                              marker: {
                                      'colors': [
                                                  'rgb(233, 142, 120)',
                                                  'rgb(155, 155, 230)',
                                                  'rgb(218, 171, 215)',
                                                  'rgb(210, 148, 210)',
                                                  'rgb(220, 188, 210)']
                                      }
                              };
                 var layout = {
                               showlegend: true,
                               title:'Enter your title here',
                               "titlefont": {
                                              family : 'Verdana', size:18, color:'#7f7f7f'
                                            },                           
                          
                              };
                 var data = [trace1];
                 Plotly.newPlot(TESTER, data, layout);
                </script>
               
</head> """)

// COMMAND ----------

// MAGIC %md 11.. Bubble Chart 

// COMMAND ----------

val Xs = Seq(1,2,3,4,5)
val Ys = Seq(2,4,4,7,5)

displayHTML(s""" <head>
               <script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
               
               <div id="tester" style="width:400px;height:300px;"></div>
               
               <script>
                 TESTER = document.getElementById('tester');
                 
                 var trace1 = {
                              x: [${Xs(0)}, ${Xs(1)}, ${Xs(2)}, ${Xs(3)}, ${Xs(4)}],
                              y: [${Ys(0)}, ${Ys(1)}, ${Ys(2)}, ${Ys(3)}, ${Ys(4)}],
                              mode: 'markers',
                              marker: {
                                size: [14, 26, 38, 40, 34]
                              }     
                              };
                 var layout = {
                               showlegend: true,
                               title:'Enter your title here',
                               "titlefont": {
                                              family : 'Verdana', size:18, color:'#7f7f7f'
                                            },                           
                              xaxis: {
                                        title: 'x Axis',
                                        titlefont: {
                                          family: 'Courier New, monospace',
                                          size: 18,
                                          color: '#7f7f7f'
                                        }
                                      },
                              yaxis: {
                                title: 'y Axis',
                                titlefont: {
                                  family: 'Courier New, monospace',
                                  size: 18,
                                  color: '#7f7f7f'
                                }
                              },
                              legend: {"orientation": "V",font: {
                                                                    family: 'sans-serif',
                                                                    size: 12,
                                                                    color: '#000'
                                                                }
                              }, 
                              bgcolor: '#E2E2E2',
                              bordercolor: '#FFFFFF',
                              borderwidth: 2
                              };
                 var data = [trace1];
                 Plotly.newPlot(TESTER, data, layout);
                </script>
               
</head> """)

// COMMAND ----------

// MAGIC %md There is more to plotly. You may refer https://plot.ly/javascript/ for more graphs.
