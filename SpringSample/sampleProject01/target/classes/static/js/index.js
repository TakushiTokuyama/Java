var delete_btn = document.getElementsByClassName('delete_btn');

$(document).ready(function () {

    setCss();

    delete_disabled();

});

setCss = function () {
    var result = document.getElementsByClassName('result');
    for (var i = 1; i <= result.length; i++) {
        if (i % 2 === 0) {
            result.item(i - 1).className = "offset-1 col-11 form-inline .bg-white result";
        }
    }
}

delete_disabled = function () {
    for (var i = 0; i < delete_btn.length; i++) {
        delete_btn.item(i).disabled = true;
    }
}

function checkPoint() {
	var id_check = document.getElementsByClassName('id_check');
    for (var i = 0; i < id_check.length; i++) {
        console.log(id_check[i].checked);
        if (id_check[i].checked) {
            delete_btn[i].disabled = false;
        } else {
            delete_btn[i].disabled = true;
        }
    }
}