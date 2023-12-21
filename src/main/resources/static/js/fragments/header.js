
{ // 서브 메뉴 드롭다운
    $('header').on('mouseover mouseout', function () {
        let $subBg = $(this).find('.sub-menu__bg');
        let $subMenu = $(this).find('.header__sub-menu');

        $subBg.toggleClass('header--none');
        $subMenu.toggleClass('header--none');
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



function toggleSearchMenu(){
    let $searchMenu = $('.header__search-top-menu');
    let $mainMenu = $('.nav');

    console.log('click!!!')

    $searchMenu.toggleClass('header--none');
    $mainMenu.toggleClass('header--none');
}








