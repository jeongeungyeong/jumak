
{ //약관 동의 checkBox, radioButton
    //전체 동의
    $('#allAgree').on('change', function (){
        checkBoxOnOff($(this));
        allCheckProcess($(this));
    });

//    이용약관
    $('#termsAgreel').on('change', function () {
        checkBoxOnOff($(this));
    });
//    개인정보 수집 및 이용
    $('#termsAgree2').on('change', function () {
        checkBoxOnOff($(this));
    });
//    개인정보 제 3자 제공
    $('#termsAgree5').on('change', function () {
        checkBoxOnOff($(this));
    });
//    선택
    $('#privateOffer5').on('change', function () {
        checkBoxOnOff($(this));
    });
//    본인인증
    $('#authCellphone').on('change', function () {
        checkBoxOnOff($(this));
    });
}

{   //다음 단계
    $('#btnNextStep').on('click', function () {
       location.href = '/user/join';
    });
}

function checkBoxOnOff(checkBoxEle){
    let $label = $(checkBoxEle).next('label');
    $label.toggleClass('checked');
}

function allCheckProcess(allCheckEle){
    if($(allCheckEle).prop('checked')){
        $('label:not(.choice_s)').addClass('checked');
    }else{
        $('label:not(.choice_s)').removeClass('checked');
    }
}








