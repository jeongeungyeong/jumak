
{ // 서브 메뉴 드롭다운
    $('header').on('mouseover', function () {
        let $subBg = $(this).find('.sub-menu__bg');
        let $subMenu = $(this).find('.header__sub-menu');

        $subBg.removeClass('header--none');
        $subMenu.removeClass('header--none');
    });

    $('header').on('mouseout', function () {
        let $subBg = $(this).find('.sub-menu__bg');
        let $subMenu = $(this).find('.header__sub-menu');

        $subBg.addClass('header--none');
        $subMenu.addClass('header--none');
    });
}

{
    // 검색 아이콘 클릭 이벤트
    $('.search-icon-box').on('click', function (){
        toggleSearchMenu();
    });

//    검색 닫기(X) 버튼 클릭 이벤트
    $('.header__search__x-btn').on('click', function (){
       toggleSearchMenu();
    });
}

{   //로그인, 회원가입 드롭다운
    $('.login-icon-box').on('mouseover', function () {
        $('.user-box').removeClass('header--none');
    });

    $('.user-box').on('mouseout', function () {
        console.log(this)
        $('.user-box').addClass('header--none');
    });
}



function toggleSearchMenu(){
    let $searchMenu = $('.header__search-top-menu');
    let $mainMenu = $('.nav');

    console.log('click!!!')

    $searchMenu.toggleClass('header--none');
    $mainMenu.toggleClass('header--none');
}









