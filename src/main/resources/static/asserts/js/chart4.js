
var chart = Highcharts.chart('chart4', {
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
    }, {
        name: '接箍波形',
        marker: {
        },
        data: [ 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8]
    }]
});
