$(document).ready(function () {

    $(document).on('click','#send-btn',function () {

        var msg = $("#send-content").val();

        jQuery.ajax({
            data: "",
            url: "http://localhost:8080/demo/api/messages/" + msg,
            type: "get",
            success: function (res) {
                console.log(res);

                $("#chat-window").append("<div class='content-container'>"
                        + "<p class='sender-container card-container'>" + msg + "</p>"
                    + "</div>");
                $("#send-content").val("");

                setTimeout(function () {
                    $("#chat-window").append("<div class='content-container'>"
                        + "<p class='response-container card-container'>" + res.message + "</p>"
                        + "</div>");
                }, 1000);

            }
        });

    })
});
