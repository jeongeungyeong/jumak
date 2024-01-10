// 주문 상세
$('.qa_reply').on('click', function (){
    let num = $(this).data('num');
    window.location.href = `/admin/qa/reply/${num}`;
})

$('.qa_list_prev').on('click', function (){
    window.location.href = `/admin/qa`;
})