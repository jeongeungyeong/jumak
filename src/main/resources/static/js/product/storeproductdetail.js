
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
$('.btn_add_cart').on('click', function (){
    $('#product-form').attr('action', '/order/cart');
    if($(this).data('num')){
        $('#product-form').submit();
    }else{
        alert('로그인 하세요');
        location.href = "/user/login";
    }
})




// 바로구매 바로 가기
// 유저넘버를 갖고 있으면, 전체 form 데이터를 submit으로 보내줌
// 아니면 로그인 페이지로 이동
$('.btn_add_order').on('click', function (){
    $('#product-form').attr('action', '/order/next');
    if($(this).data('num')){
        $('#product-form').submit();
    }else{
        alert('로그인 하세요');
        location.href = "/user/login";
    }
})

// ===========================================================
// 상품 후기 리플

//    댓글 작성

let $writeBtn = document.querySelector('.btn-reply');

$writeBtn.addEventListener('click',function (){
    let $replyContent = document.getElementById('reply-content');
    let content = $replyContent.value;
    console.log(content);

    fetch("/reviews",{
        method:"POST",
        headers:{
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            productReviewContent: content,
            productNumber: productNumber
        }),
    })
        .then(response => response.json())
        .then(data => {
            // 성공적으로 전송
            console.log('댓글 작성 성공: ', data);
            // 화면에 뿌리기
            displayComment(data);

            //작성한 댓글 화면에 표시한 후, 입력창 초기화
            $replyContent.value = '';

        })
        .catch(error => {
            console.error('댓글 작성 실패',error);
        });
});

// 댓글을 화면에 추가하는 함수
/*function displayComment(comment) {
    // 새로운 댓글을 보여줄 DOM 요소 생성
    let commentElement = document.createElement('div');
    commentElement.className = 'reply';

    // 댓글 작성자 정보 추가
    let writerElement = document.createElement('div');
    writerElement.className = 'reply-box__writer';
    writerElement.textContent = comment.userNickname; // 댓글 작성자 이름 또는 정보
    commentElement.appendChild(writerElement);

    // 댓글 내용 추가
    let contentElement = document.createElement('div');
    contentElement.className = 'reply-box__content';
    contentElement.textContent = comment.productReviewContent;
    commentElement.appendChild(contentElement);

    // 댓글 버튼 및 기타 옵션을 추가하는 부분도 필요하다면 추가하시면 됩니다.

    // 원하는 위치에 새로운 댓글 요소를 추가
    let commentsContainer = document.querySelector('.reply-list-wrap');
    commentsContainer.appendChild(commentElement);
}*/



// =====================================================
//무한 스크롤 페이징
/*$(window).on('scroll', function (){
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
reply.getListPage(productNumber, page, showReply);*/










