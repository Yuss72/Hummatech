const input = document.getElementById("input-todo");
const tambahBtn = document.getElementById("tambah");
const muatBtn = document.getElementById("muat");
const hapusBtn = document.getElementById("hapus");
const list = document.getElementById("data-list");

function simpanData() {
    let data = [];

    document.querySelectorAll("#data-list li").forEach((item) => {
        data.push(item.textContent);
    });

    localStorage.setItem("todolist", JSON.stringify(data));
}

function tambahData(text) {
    let li = document.createElement("li");
    li.textContent = text;
    list.appendChild(li);
}

function muatData() {
    list.innerHTML = "";
    let dataTersimpan = JSON.parse(localStorage.getItem("todolist")) || [];
    dataTersimpan.forEach(text => tambahData(text));
}

tambahBtn.addEventListener("click", function (e) {
    e.preventDefault();
    if (input.value.trim() !== "") {
        tambahData(input.value);
        simpanData();
        input.value = "";
    }
});

muatBtn.addEventListener("click", function (e) {
    e.preventDefault();
    muatData();
});

hapusBtn.addEventListener("click", function (e) {
    e.preventDefault();
    localStorage.removeItem("todolist");
    list.innerHTML = "";
});

muatData();