let isTrue = false;

$('#select').on('change', function (){
    let email = $('.member-email').val();

    let idx = email.indexOf('@');

    let value = $(this).val();
    let result = '';

    if(idx != -1) {
        result = email.replace(email.substring(idx), `@${value}`);
    }else {
        result = email + `@${value}`;
    }



    $('.member-email').val(result);
});

$(document).ready(function (){


    $("#userPassword").on("blur", function () {
        let userPassword = document.getElementById("userPassword").value;

        $.ajax({
            type: "GET",
            url: "/mypages/member-info",
            data: {userPassword: userPassword},
            success: function (response) {
                console.log(response)

                if(response == 1){
                    isTrue = true;
                    document.getElementById("wrongPassword").style.display = 'none'
                }else{
                    isTrue = false;
                    document.getElementById("wrongPassword").style.display = 'block'
                }
            },
            error: function (xhr, status, error) {
                console.error("실패!!" , error);
            }
        })
    })
})

$('#enter_button').on('click', function (){

    if(isTrue){
        $("#member_update").submit();
    }else {
        alert("확인해!");
    }
});


$("#enterPassword").on('keyup', function (){
    let newId = document.getElementById("newPassword").value;
    let enterId = document.getElementById("enterPassword").value;

    if(newId === enterId) {
        document.getElementById("wrongPW").style.display = 'none'
    } else {
        document.getElementById("wrongPW").style.display = 'block'
    }
})















