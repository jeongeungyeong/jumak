// 주문 상세
$('.btn_order_detail').on('click', function (){
    let num = $(this).data('num');
    window.location.href = `/admin/order/detail/${num}`;
})

function f_oStatusChange(target){
    console.log(target)
    let value = $(target).val();
    console.log(value);
    let num = $(target).data('num');
    console.log(num);
    $.ajax({
        url : `/admin/order/update`,
        type : 'patch',
        data : {orderNumber : num ,orderStatusNumber : value},
        dataType : "json",
        success : function (){
        },
        error : function (xhr, status, error){
            console.error(error);
        }
    });
}

