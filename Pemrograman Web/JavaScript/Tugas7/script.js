$(document).ready(function() {
    $("#form-input").submit(function(e) {
        e.preventDefault();

        let judul = $("#input-judul").val();
        let isi = $("#input-text").val();

        $.ajax({
            type: "POST",
            data: JSON.stringify({
                title: judul,
                body: isi,
                userId: 1
            }),
            url: "https://jsonplaceholder.typicode.com/posts",
            contentType: "application/json; charset=utf-8",
            success: function(response) {
                console.log("Data Terkirim: ", response);
                let temp = `<h2>${response.title}</h2>      
                            <p>${response.body}</p>`;
                $("#output").prepend(temp);

                $("#input-judul").val("");
                $("#input-text").val("");
            }
        })
    })   
})