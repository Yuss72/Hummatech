function kalkulator() {
    let no1 = parseFloat(document.getElementById("no1").value);
    let no2 = parseFloat(document.getElementById("no2").value);
    let operasi = document.getElementById("operasi-aritmatika").value;
    let output = document.getElementById("output");
    let hasil;

    switch (operasi) {
        case "+":
            hasil = no1 + no2;
            break;
        case "-":
            hasil = no1 - no2;
            break;
        case "*":
            hasil = no1 * no2;
            break;
        case "/":
            hasil = no2 !== 0 ? no1 / no2 : "Tidak Bisa Dibagi";
            break;
        case "//":
            hasil = no1 % no2;
            break;
        default:
            hasil = "No";
            break;
    }
    output.innerHTML = hasil;
}