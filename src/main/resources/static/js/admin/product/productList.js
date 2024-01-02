
// 물품 상세
$('.btn_product_detail').on('click', function (){
    let num = $(this).data('num');
    window.location.href = `/admin/product/detail/${num}`;
})


// 물품 삭제
$('.btn_product_remove').on('click', function (){
    let num = $(this).data('num');

        $.ajax({
            url : `/admin/product/delete/${num}`,
            type : 'delete',
            success : function (){
                window.location.href = `/admin/product`;
                alert(`${num}번 물품 삭제 완료`);
            },
            error : function (xhr, status, error){
                console.error(error);
            }
        });

})

// 물품 추가
$('.btn_product_add').on('click', function (){
    window.location.href = `/admin/product/add`;
})