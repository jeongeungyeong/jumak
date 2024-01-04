/*
import * as reply from '../module/preply.js';
*/

let productNumber = $('.product-num').val();
let page = 1;

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


// 장바구니 바로 가기

// 바로구매 바로 가기
$('.btn_add_order').on('click', function (){

    window.location.href = '/order/next?';
})
/*

// 상품 후기 작업
$('.btn-reply').on('click', function (){
    page=1;
    let content = $('#reply-content').val();

    let replyObj = {
        replyContent : content,
        productNumber : productNumber
    };

    reply.add(replyObj, ()=>{
        reply.getListPage(productNumber, page, showReply);
    });

    $('#reply-content').val('');
});

// =====================================================
//무한 스크롤 페이징
$(window).on('scroll', function (){
    // 현재 브라우저의 스크롤 위치를 의미
    console.log(`ScrollTop : ${ $(window).scrollTop() }` )
    // 문서 전체의 높이를 의미
    console.log(`document height : ${ $(document).height() }` )
    // 브라우저 화면의 높이를 의미
    console.log(`window height : ${ $(window).height() }` )

//    [현재 브라우저 스크롤의 위치 == 문서높이 - 화면 높이] -> 문서 마지막에 스크롤이 도착함
    if($(window).scrollTop() == $(document).height() - $(window).height()) {
        console.log('!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!');
        console.log(++page);
        reply.getListPage(boardNumber, page, appendReply);
    }
});
reply.getListPage(productNumber, page, showReply);

 */

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