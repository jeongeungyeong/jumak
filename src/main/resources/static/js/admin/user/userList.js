
// 유저 상세
$('.btn_user_detail').on('click', function (){
    let num = $(this).data('num');
    window.location.href = `/user/detail/${num}`;
})


// 유저 삭제 
$('.btn_user_remove').on('click', function (){
    let num = $(this).data('num');

        $.ajax({
            url : `/user/delete/${num}`,
            type : 'delete',
            success : function (){
                window.location.href = `/user`
                alert(`${num}번 회원 삭제 완료`);
            },
            error : function (xhr, status, error){
                console.error(error);
            }
        })

})