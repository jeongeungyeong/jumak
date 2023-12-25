// 추천순
$(".products_pick_list").on("click", ".pick_list_btns", function () {
    let $replyBtnBox = $(this)
        .closest(".pick_list_box")
        .find(".pick_list_btns__box");

    $replyBtnBox.toggleClass("none");
});
// 정렬순서
// $("body").click(function (e) {
//     if ($(e.target).hasClass("pick_list_btns")) {
//         //console.log('aa');
//         return;
//     }
//     if (!$(".pick_list_btns__box").has(e.target).length) {
//         $(".pick_list_btns__box").addClass("none");
//     }
// });

// 카테고리
let $categoryBox = $(".category-box");

$categoryBox.on("click", function (e) {
    let idx = $categoryBox.index(this);
    console.log(idx);
    for (let i = 0; i < $categoryBox.length; i++) {
        if (i == idx) {
            $categoryBox.eq(i).addClass("checked");
        } else {
            $categoryBox.eq(i).removeClass("checked");
        }
    }
});

// 보드
$(".add-post-btn").on("click", function () {
    window.location.href = "/board/write";
});

//슬라이드
$(".slide_div_wrap").ready(function(){
    $(".slide_div").slick();
});