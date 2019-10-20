function renderChart2() {
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
            data: [[${oridata}]]
        }]
    });

}
