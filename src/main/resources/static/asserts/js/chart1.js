
var chart = Highcharts.chart('chart1', {
    chart: {
        type: 'spline'
    },
    title: {
        text: '动液面波形'
    },
    subtitle: {
        text: '数据来源: 动液面在线监测系统'
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
        name: '原始波形',
        data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5,  23.3, 18.3, 13.9, 9.6]
    }]
});
