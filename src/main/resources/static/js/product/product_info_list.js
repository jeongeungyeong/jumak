    let cateValue = $('input[name=shopCategory]:checked').val();
    let $sortBox = document.querySelector('.sort__box');
    let $sortPicked = document.querySelector(".sort__picked");
    let $sortList = document.querySelector('.sort__list');
    let $body = document.querySelector('body');

    // 정렬 기준 리스트 활성화
    $sortBox.addEventListener('click',(e)=>{
            $sortPicked.classList.add('active');
    });

    // 다른 곳 클릭시 정렬 기준 리스트 비활성화
    $body.addEventListener('click',(e) => {
        if(!e.target.classList.contains('sort__picked')){
            $sortPicked.classList.remove('active');
        }
    });

    // 정렬 기준 선택시 이벤트
    $sortList.addEventListener('click', (e)=>{
       if(e.target.closest('li')){
           e.preventDefault();

           document.querySelector('.sort__list > li.active').classList.remove('active')
           e.target.closest('li').classList.add('active');
           $sortPicked.innerText = e.target.innerText;
       }
    });

//    카테고리 정렬
    {
        let $checkedBtn = $('input[name=shopCategory]:checked');
        console.log($checkedBtn)

        $('label').removeClass('checked');
        $checkedBtn.closest('label').addClass('checked');
    }

    $('input[name=shopCategory]').on('change', function () {
        let $label = $(this).closest('label')

        $('.category-box').removeClass('checked');
        $label.addClass('checked');

        cateValue = $(this).val();

        window.location.href = `/productlist?orderCond=${orderValue}&cate=${cateValue}`;
    });