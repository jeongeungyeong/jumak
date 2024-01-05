
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


