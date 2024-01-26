{   // 대 카테고리 클릭 처리
    let $circles = $('.cate-circle > li');

    $circles.on('click', function () {
        $circles.removeClass('on');

        $(this).addClass('on');
    });
}

{ // 소 카테고리 클릭 처리
    let $cateBtns = $('.cate-list > li > span');
    $cateBtns.on('click', function () {
        let count = $('.cate-list > li > span.active').length;

        if (count >= 3) {
            $(this).removeClass('active');
            return;
        }

        $(this).toggleClass('active');
    });
}

{   // 메인 버튼(다시 선택, 결과보기) 이벤트
    $('.reset-btn').on('click', function () {
        let $cateBtns = $('.cate-list > li > span');

        $cateBtns.removeClass('active');
    });

    $('.search-btn').on('click', function () {
        let tagNumberArr = [];
        //    비동기 통신 사용하기 !!!!!!!!!!!!!!!!!!
        let $tagList = $('.cate-list .active').closest('li');
        $tagList.each((i, li) => {
            let tagNumber = $(li).data('tag');
            tagNumberArr.push(tagNumber);
        })

        let cateList = $('.on').data('cate');
        console.log(cateList);
        console.log(tagNumberArr)

        $.ajax({
            url: '/find/tag',
            type: 'get',
            traditional: true,
            data: {
                arr: tagNumberArr,
                productCategoryNumber1: cateList
            },
            success: function (resp) {
                console.log(resp);
                displayList(resp);
            },
            error: function (xhr, status, error) {
                console.error(error);
            }
        });
    });
}

function displayList(resp) {

    let text = ``;

    resp.forEach(item => {
        text += `
            <a href="">
                <li>
                  <div class="img-box">
                    <img src="/imgs/main/find/sample-img.jpg" alt="">
                  </div>
                  <div class="text-box">
                    <p class="text-box__name">${item.productName}</p>
                    <p class="text-box__explain">명인이 빚어낸 황금빛 제주의 자산</p>
                  </div>
                </li>
              </a>
        `;
    })

}