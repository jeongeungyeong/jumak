// 배송 주문 정보
let $deliveryBox = $('.delivery-box');
//기본정보
$deliveryBox.on('click',function (e){
   let idx = $deliveryBox.index(this);
   console.log(idx);

   for(let i=0;i<$deliveryBox.length;i++){
       if(i==idx){
           $deliveryBox.eq(i).addClass('checked');
       }else{
           $deliveryBox.eq(i).removeClass('checked');
       }
   }
});

$('.basic').on('click', function (e) {
    e.preventDefault();

    $.ajax({
        url : '/orders/delivery',
        type: 'get',
        dataType: 'json',
        success : function (resp){
            console.log(resp);
            $('#receiverName').val(resp.userName)
            $('#address').val(resp.userAddress)
            $('#zipcode').val(resp.userZipcode)
            $('#addressDetail').val(resp.userAddressDetail)
            $('#receiverPhone').val(resp.userPhoneNumber)
            $('#receiverCellPhone').val(resp.userCellphoneNumber)

        },
        error : function (xhr, status, err) {
            console.log(err);
        }
    });
});

$('.new').on('click', function (e) {
    e.preventDefault();
    $('#receiverName').val('');
    $('#address').val('');
    $('#zipcode').val('');
    $('#addressDetail').val('');
    $('#receiverPhone').val('');
    $('#receiverCellPhone').val('');

});



//직접입력
//배송지주소찾기
function searchAddress() {
    new daum.Postcode({
        oncomplete: function(data) {
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

            // 각 주소의 노출 규칙에 따라 주소를 조합한다.
            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
            var addr = ''; // 주소 변수
            var extraAddr = ''; // 참고항목 변수

            //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
            if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                addr = data.roadAddress;
            } else { // 사용자가 지번 주소를 선택했을 경우(J)
                addr = data.jibunAddress;
            }

            // 우편번호와 주소 정보를 해당 필드에 넣는다.
            document.getElementById('zipcode').value = data.zonecode;
            document.getElementById("address").value = addr;
            // 커서를 상세주소 필드로 이동한다.
            document.getElementById("addressDetail").focus();
        }
    }).open();
}