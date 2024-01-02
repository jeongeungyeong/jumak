// 주문 상세
$('.qaList').on('click', function (){
    let num = $(this).data('num');
    window.location.href = `/admin/qa/detail/${num}`;
})