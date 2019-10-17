
var chart = Highcharts.chart('chart2', {
    chart: {
        type: 'spline'
    },
    title: {
        text: ''
    },
    subtitle: {
        text: ''
    },
    xAxis: {
        title: {
            text: '米 (m)'
        }
    },
    yAxis: {
        title: {
            text: '振幅 (mm)'
        }
    },
    tooltip: {
        crosshairs: true,//垂直线
        shared: true//都显示
    },
    series: [{
        name: '液面波形',
        data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5,  23.3, 18.3, 13.9, 9.6]
    }]
});
