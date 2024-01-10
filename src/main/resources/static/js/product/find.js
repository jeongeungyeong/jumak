{   // 대 카테고리 클릭 처리
    let $circles = $('.cate-circle > li');

    $circles.on('click', function (){
        $circles.removeClass('on');

        $(this).addClass('on');
    });
}

{ // 소 카테고리 클릭 처리
    let $cateBtns = $('.cate-list > li > span');
    $cateBtns.on('click', function (){
        let count = $('.cate-list > li > span.active').length;

        if(count >= 3){
            $(this).removeClass('active');
            return;
        }

        $(this).toggleClass('active');
    });
}

{   // 메인 버튼(다시 선택, 결과보기) 이벤트
    $('.reset-btn').on('click', function (){
        let $cateBtns = $('.cate-list > li > span');

        $cateBtns.removeClass('active');
    });

    $('.search-btn').on('click', function (){
    //    비동기 통신 사용하기 !!!!!!!!!!!!!!!!!!
    });
}

