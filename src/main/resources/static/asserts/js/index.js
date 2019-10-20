console.log("====index")
//clickbtn
$("#clickbtn").click(function (e) {
    if($("#list").css("display") == "none") {
        $("#mask").show();
        $("#list").slideDown();

    } else {
        $("#mask").hide();
        $("#list").hide();
    }
})




//初始化
$.getJSON("/list/oilfield","",function(res) {
    var data = res.data;
    for(index in data) {
        $("#list .oilfield").append('<option value="'+data[index].oilfieldid+'">'+data[index].oilfieldname+'</option>')
    }
})

$("#list .oilfield").on('change',function(e) {
    $("#list .oilfieldCompany").html('<option value="">作业区</option>')
    $("#list .wellGroupInfo").html('<option value="">油井区</option>')
    $.getJSON("/list/oilfieldCompany/" + this.value,"",function(res) {
        var data = res.data;
        for(index in data) {
            $("#list .oilfieldCompany").append('<option value="'+data[index].oilfieldcompanyid+'">'+data[index].oilfieldcompanyname+'</option>')
        }
    })
})

$("#list .oilfieldCompany").on('change',function(e) {
    $("#list .wellGroupInfo").html('<option value="">油井区</option>')
    $.getJSON("/list/wellGroupInfo/" + this.value,"",function(res) {
        var data = res.data;
        for(index in data) {
            $("#list .wellGroupInfo").append('<option value="'+data[index].wellgroupid+'">'+data[index].wellgroupname+'</option>')
        }
    })
})

$("#list .wellGroupInfo").on('change',function(e) {
    $("#list #wellInfo").html('')
    $.getJSON("/list/wellInfo/" + this.value,"",function(res) {
        var data = res.data;
        console.log(data)
        for(index in data) {

            $("#list #wellInfo").append('<li><a href="/data/'+data[index].wellid+'" class="btn btn-info" well_id="'+data[index].wellid+'">'+data[index].wellname+'</a></li>')
        }
    })
})



