// mengambil id display
const display = document.getElementById('display');

// fungsi agar layar bisa di isi
function Isi(val) {
    display.value += val;
}

// fungsi untuk hapus semua
function clearDisplay() {
    display.value = '';
}

// fungsi hapus satu-persatu
function deleteLast() {
    display.value = display.value.slice(0, -1);
}

// fungsi untuk menghitung
function calculate() {
    let isi = display.value;
    let hasil;

    if (isi) {
        try {
            hasil = new Function("return " + isi)();
        } catch {
            hasil = "Error";
        }
    } else {
        hasil = "0";
    }

    display.value = hasil;
}