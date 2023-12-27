// 비동기 통신 함수
function choeseDate() {
    $.ajax({
        url: '/your-api-endpoint',
        method: 'POST',
        data: { duration: value },
        success: function(response) {
            console.log('Data received:', response);
        },
        error: function(error) {
            console.error('Error:', error);
        }
    });
}

$('.date_target_name button').on('click', function() {
    var value = $(this).data('value');

    // fetchData(value);
});




$(function() {
    fn_default_datepicker();
});

function fn_default_datepicker()
{
    var start = $( "#datepicker_start" ).datepicker({
        dateFormat: 'yy-mm-dd' //Input Display Format 변경
        ,showOtherMonths: true //빈 공간에 현재월의 앞뒤월의 날짜를 표시
        ,showMonthAfterYear:true //년도 먼저 나오고, 뒤에 월 표시
        ,changeYear: true //콤보박스에서 년 선택 가능
        ,changeMonth: true //콤보박스에서 월 선택 가능
        ,buttonText: "선택" //버튼에 마우스 갖다 댔을 때 표시되는 텍스트
        ,yearSuffix: "년" //달력의 년도 부분 뒤에 붙는 텍스트
        ,monthNamesShort: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'] //달력의 월 부분 텍스트
        ,monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'] //달력의 월 부분 Tooltip 텍스트
        ,dayNamesMin: ['일','월','화','수','목','금','토'] //달력의 요일 부분 텍스트
        ,dayNames: ['일요일','월요일','화요일','수요일','목요일','금요일','토요일'] //달력의 요일 부분 Tooltip 텍스트
        ,minDate: "-3Y" //최소 선택일자(-1D:하루전, -1M:한달전, -1Y:일년전)
        ,maxDate: "0M" //최대 선택일자(+1D:하루후, -1M:한달후, -1Y:일년후)
    });

    var end = $( "#datepicker_end" ).datepicker({
        dateFormat: 'yy-mm-dd' //Input Display Format 변경
        ,showOtherMonths: true //빈 공간에 현재월의 앞뒤월의 날짜를 표시
        ,showMonthAfterYear:true //년도 먼저 나오고, 뒤에 월 표시
        ,changeYear: true //콤보박스에서 년 선택 가능
        ,changeMonth: true //콤보박스에서 월 선택 가능
        ,buttonText: "선택" //버튼에 마우스 갖다 댔을 때 표시되는 텍스트
        ,yearSuffix: "년" //달력의 년도 부분 뒤에 붙는 텍스트
        ,monthNamesShort: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'] //달력의 월 부분 텍스트
        ,monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'] //달력의 월 부분 Tooltip 텍스트
        ,dayNamesMin: ['일','월','화','수','목','금','토'] //달력의 요일 부분 텍스트
        ,dayNames: ['일요일','월요일','화요일','수요일','목요일','금요일','토요일'] //달력의 요일 부분 Tooltip 텍스트
        ,minDate: "-3Y" //최소 선택일자(-1D:하루전, -1M:한달전, -1Y:일년전)
        ,maxDate: "0M" //최대 선택일자(+1D:하루후, -1M:한달후, -1Y:일년후)
        ,defaultDate: "+1w"
    });

    //초기값을 오늘 날짜로 설정
    $('#datepicker_start').datepicker('setDate', '-7D'); //(-1D:하루전, -1M:한달전, -1Y:일년전), (+1D:하루후, -1M:한달후, -1Y:일년후)
    $('#datepicker_end').datepicker('setDate', 'today'); //(-1D:하루전, -1M:한달전, -1Y:일년전), (+1D:하루후, -1M:한달후, -1Y:일년후)
}


{
    $('.today').on('click', function (){
        $('#datepicker_start').datepicker('setDate', 'today');
    })

    $('.week').on('click', function (){
        $('#datepicker_start').datepicker('setDate', '-7D');
    })

    $('.half_month').on('click', function (){
        $('#datepicker_start').datepicker('setDate', '-15D');
    })

    $('.month').on('click', function (){
        $('#datepicker_start').datepicker('setDate', '-1M');
    })

    $('.three_month').on('click', function (){
        $('#datepicker_start').datepicker('setDate', '-3M');
    })

    $('.year').on('click', function (){
        $('#datepicker_start').datepicker('setDate', '-1Y');
    })

}

$(document).ready(function () {
    $(".search_button").on("click", function () {
        let days = $(this).data("value");


        $.ajax({
            type: "GET",
            url: "your_backend_endpoint",
            data: {
                days: days
            },
            success: function (data) {
                console.log(data);
            },
            error: function (xhr, status, error) {
                console.error("에러:", error);
            }
        });
    });
});







