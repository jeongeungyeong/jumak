displayImgs();

function displayImgs() {
    let productNumber = $('.product-num').val();

    $.ajax({
        url: '/productImgMain/img',
        type: 'get',
        data: {productNumber: productNumber},
        success: function (resp) {
            // let html = '';
            console.log(resp);


                let fileName = resp.productImgMainPath + '/' + resp.productImgMainUuid + "_" + resp.productImgMainName;
                let html = `
                        <img src="/productImgMain/display?fileFullName=${fileName}">
                        `


            $('.product_img_main').html(html);
        },
        error: function (xhr, status, error) {
            console.error(error);
        }
    });

    $.ajax({
        url: '/productImg/img',
        type: 'get',
        data: {productNumber: productNumber},
        success: function (resp) {
            // let html = '';
            console.log(resp);


            let fileName = resp.productImgPath + '/' + resp.productImgUuid + "_" + resp.productImgName;
            let html = `
                        <img src="/productImgMain/display?fileFullName=${fileName}">
                        `


            $('.product_img').html(html);
        },
        error: function (xhr, status, error) {
            console.error(error);
        }
    });
}

// 이전 버튼
$('.btn_product_prev').on('click', function (){
    window.location.href = `/admin/product`;
})

// 수정 버튼
$('.btn_product_modify').on('click', function (){
    let num = $(this).data('num');
    window.location.href = `/admin/product/modify/${num}`;
})