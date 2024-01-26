$(document).ready(function (){


    $("#userPassword").on("blur", function () {
        let userPassword = document.getElementById("userPassword").value;

        $.ajax({
            type: "GET",
            url: "/mypages/member-delete",
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