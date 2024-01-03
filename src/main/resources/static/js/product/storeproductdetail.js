// 옵션 숫자 계산
{
    let priceText = $('#result-price').text();
    let price = +priceText.replaceAll(',', '');
    let $numBox = $('.numBox');

    let $displayPrice01 = $('.option_price_display_0');
    let $displayPrice02 = $('.total_price--display');

    $('.plus').on('click', function () {
        let count = $numBox.val();

        $numBox.val(++count);
        let totalPrice = count * price;
        $displayPrice01.text(totalPrice.toLocaleString());
        $displayPrice02.text(totalPrice.toLocaleString());
    });

    $('.minus').on('click', function () {
        let count = $numBox.val();
        if(count < 2) { return; }
        $numBox.val(--count);
        let totalPrice = count * price;
        $displayPrice01.text(totalPrice.toLocaleString());
        $displayPrice02.text(totalPrice.toLocaleString());
    });
}

//후기 댓글

// 리플 작성 완료 처리
$('.btn-reply').on('click', function (){

});

$('.reply-list-wrap').on('click', '.reply-btns', function () {
    let $replyBtnBox = $(this).closest('.reply-btn-box').find('.reply-btns__box');

    $replyBtnBox.toggleClass('none');
});


// 수정 버튼
$('.btn-modify').on('click', function () {
    let boardNumber = $('.board-num').val();
    window.location.href = '/board/modify?boardNumber=' + boardNumber;
});
// 삭제 버튼
$('.btn-remove').on('click', function () {
    let boardNumber = $('.board-num').val();
    window.location.href = '/board/remove?boardNumber=' + boardNumber;
});

// 장바구니 바로 가기

// 바로구매 바로 가기
$('.btn_add_order').on('click', function (){
    window.location.href = '/order/next';
})