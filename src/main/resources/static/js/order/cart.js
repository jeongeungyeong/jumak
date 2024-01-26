{ // 체크박스 이벤트
    $('.check-box__children').on('change', function () {
        let isChecked = $(this).prop('checked');
        checkBox($(this), isChecked);

        if(isChecked) { return; }

        checkBox($('#check-all'), false);
    });

//    전체 선택 이벤트
    $('#check-all').on('change', function () {
        let $checkList = $('.check-box__children');
        let isChecked = $(this).prop('checked');
        
        checkBox($(this), isChecked);

        if (!isChecked) {
            checkBox($checkList, false);
            return;
        }

        $checkList.each(function (i, item) {
            checkBox($(item), true);
        });
    });
}

/**
 * 체크박스 label이미지 변환 함수 <br>
 * jquery요소와 checked상태를 넘겨주면 해당 체크박스의 라벨을 찾아 이미지를 변환함 <br>
 * label은 checkBox 요소 다음 형제요소로 존재해야함 <br>
 * <br>
 * @param $ele checkBox를 jquery 요소로 받는다.
 * @param isChecked :boolean 체크 여부를 받는다.
 */
function checkBox($ele, isChecked) {
    $ele.prop('checked', isChecked);

    if (isChecked) {
        $ele.next().css('background', `url('/imgs/order/check_on_small.png') no-repeat 1px 2px`);
    } else {
        $ele.next().css('background', `url('/imgs/order/check_off_small.png') no-repeat 1px 2px`);
    }
}

//버튼 작업

//선택 삭제하기
$('.delete-btn').on('click',function (){

})



//바로구매 바로 가기
$('.all-order-btn').on('click', function (){
    $('#cart-form').attr('action', '/order/cart_next');
    if($(this).data('num')){
        $('#cart-form').submit();
    }else{
        alert('상품을 선택해주세요');
    }
})

