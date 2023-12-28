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


orderStatus();

function orderStatus(){
    const el = document.getElementById('orderStatus');  //select box
    const len = el.options.length; //select box의 option 갯수
    let num = $('.orderStatus').data('status');
    for (let i=0; i<len; i++){
        //select box의 option value가 입력 받은 value의 값과 일치할 경우 selected
        if(el.options[i].value == num){
            el.options[i].selected = true;
        }
    }
}

